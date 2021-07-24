package com.TestYantra.GitHub.PojoLib;

public class Project {
	
	private String name;
	private String description;
	
	public Project(String name ,String description) {
		super();
		this.description = description;
		
		this.name = name;
	}

	public Project(String name) {
		super();
		this.name = name;
	}

   Project(){
	   
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}



	
	
	

}
