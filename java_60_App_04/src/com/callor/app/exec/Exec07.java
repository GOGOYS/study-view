package com.callor.app.exec;

import java.io.InputStream;

import com.callor.utils.Line;

public class Exec07 {
	public static void main(String[] args) {
		System.out.println(Line.dLine(20));
		System.out.println("7단 구구단");
		System.out.println(Line.sLine(20));
		for(int i =0; i < 8; i++) {
			int multy = 7 * (i+2);
			System.out.printf("7 x %d = %d\n", i+2,multy);
		}
		System.out.println(Line.dLine(20));
	}
	
}
