package com.TestYantra.GitHub.genericLib;

public interface IEndPoints {

	String getOpertion="/repos/{owner}/{repo}";
	String postOperation="/user/repos";
	String updateOperation="/repos/{owner}/{repo}";
	String deleteOperation="/repos/{owner}/{repo}";
	
	String propertyFilepath="./src/test/resources/data.properties";
}
