package com.callor.classes.utils;

public class LIne {
	
	public static String dLine(int length) {
		
		String dLine = "=";
		return dLine.repeat(length);
	}
	
	public static String sLine(int length) {
		
		return "-".repeat(length);
	}
}
