package com.TestYantra.GitHub.genericLib;

import java.util.Random;

public class JavaUtility {
	
	public static int getRandomNum() {
		Random ran=new Random();
		int num = ran.nextInt();
		return num;
		
	}

}
