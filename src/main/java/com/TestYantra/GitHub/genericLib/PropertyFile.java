package com.TestYantra.GitHub.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getpropertyData(String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(IEndPoints.propertyFilepath));
		return p.getProperty(key);
	}

}
