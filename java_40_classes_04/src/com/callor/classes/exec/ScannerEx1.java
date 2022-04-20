package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		// 파일 오른쪽 클릭후 copy qualified Name 선택 - 저장된 위치
		String fileName = "data.txt";
		
		//is라는 클래스에 데이터를 가져와서 담아라
		InputStream is = ScannerEx1.class.getResourceAsStream(fileName);
		
		Scanner scan = new Scanner(is);
		
		//다음 줄에 있는 데이터 읽기(한줄씩 넘어간다)
		String strLine = scan.nextLine();
		System.out.println(strLine);
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		
		
	}
}
