package com.TestYantra.GitHub.Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestYantra.GitHub.genericLib.IEndPoints;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
public class GetOperation extends BaseClass{
	
	@Test
	public void tc1() throws FileNotFoundException, IOException {
		given()
		.pathParam("owner",pfile.getpropertyData("ownerName"))
		.pathParam("repo", pfile.getpropertyData("repoName"))
		.get("/repos/{owner}/{repo}")
		.then().log().all()
		.assertThat().statusCode(200)
		.contentType(ContentType.JSON);
		
		Reporter.log("Get operation is successful");
		
	}
	

}
