package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		// 파일 오른쪽 클릭후 copy qualified Name 선택 - 저장된 위치
		String fileName = "data.txt";
		
		//is라는 클래스에 데이터를 가져와서 담아라
		InputStream is = ScannerEx2.class.getResourceAsStream(fileName);
		
		Scanner scan = new Scanner(is);
		
		while(true) {
			boolean bYes = scan.hasNext();
			if(bYes == false) {
				break;
			}
			
			String strLine = scan.nextLine();
			System.out.println();
		}
	}
}
