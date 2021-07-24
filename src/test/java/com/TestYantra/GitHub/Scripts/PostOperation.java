package com.TestYantra.GitHub.Scripts;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestYantra.GitHub.PojoLib.Project;
import com.TestYantra.GitHub.genericLib.IEndPoints;
import com.TestYantra.GitHub.genericLib.JavaUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostOperation extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		String name=pfile.getpropertyData("nameRepo")+JavaUtility.getRandomNum();
		
		Project p=new Project(name);
		
		Response resp = given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(p)
		.post(IEndPoints.postOperation);
		resp.then().log().all()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON);
		Reporter.log("post opertion was successful");
		
		String gitreproName = resp.jsonPath().get("name");
		Reporter.log("The name of the reprository which is scusscefully cetaed "+gitreproName,true);
		
		//Patch operation on dynamic created repository
		Project p1=new Project(name,"Hello dummy project");
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(p1)
		.pathParam("owner",pfile.getpropertyData("ownerName"))
		.pathParam("repo",gitreproName)
		.patch("https://api.github.com/repos/{owner}/{repo}")
		.then().log().all();
		
		Reporter.log("patch opertion was successful");
		
		given()
		.auth().oauth2("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")
		.pathParam("owner",pfile.getpropertyData("ownerName"))
		.pathParam("repo",gitreproName)
		.delete("/repos/{owner}/{repo}")
		.then().log().all();
		
		Reporter.log("delete opertion was successful");
		
		
		
		
	}

}
