package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력 >");
		/*
		 * san.nextInt() 메서드는 엔터 신호를 다음의 nextLine()에 전달하여
		 * 이후의 nextLine()에 문제를 일으킨다. 
		 */
		//int intNum = scan.nextInt();
		String strNum = scan.nextLine();
		int intNum = 0;
		
		//Exception Handling 오류가 나지 않도록 미연에 방지 하는것
		if(strNum.equals("")) {
			System.out.println("숫자만 입력해주세요.");
		}else {
			intNum = Integer.valueOf(strNum);            
			
		}
		
		System.out.println("문자열입력 >");
		String strValue = scan.nextLine();
		
		System.out.println("입력된 정수 :" + intNum);
		System.out.println("입력된 문자열 :" + strValue);
		
		
	}
}
