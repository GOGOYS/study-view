package com.callor.contoller;

import java.util.Scanner;

//import java.util.Scanner;
// 컨트롤 쉬프트 o는 임포트

public class ScannerEx_2_1 {
	public static void main(String[] args) {
		
//		//Scanner 클래스를 사용하여 scan 인스턴스를 생성하고
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("========================");
//		System.out.println("나만의 계산기");
//		System.out.println("========================");
//		System.out.print("정수를 입력후 엔터 :");
//		int intNum1 = scan.nextInt();
//		System.out.print("정수 한개를 더 입력후 엔터 :");
//		int intNum2 = scan.nextInt();
//		
//		System.out.print("입력한 두 정수의 합 :");
//		System.out.println(intNum1 + intNum2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("나만의 계산기");
		System.out.println("==================");
		System.out.printf("숫자 입력후 엔터");
		int intNum1 = scanner.nextInt();
		System.out.printf("숫자 입력후 엔터");
		int intNum2 = scanner.nextInt();
		
		System.out.println("입력한 수의 합");
		System.out.println(intNum1 + intNum2);
		
	}
}
