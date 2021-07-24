package com.TestYantra.GitHub.Scripts;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.TestYantra.GitHub.genericLib.PropertyFile;

import static io.restassured.RestAssured.*;



public class BaseClass {
	public PropertyFile pfile=new PropertyFile();
	
	
	@BeforeMethod
	public void openApp() {
		baseURI="https://api.github.com";
	}

	
	@AfterMethod
	public void closeApp() {
		Reporter.log("we are closeing");
	}

}
