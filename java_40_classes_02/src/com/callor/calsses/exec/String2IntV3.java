package com.callor.calsses.exec;

import java.util.Scanner;

public class String2IntV3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		String strNum = scan.nextLine();
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
			boolean bEven = intNum % 2 ==0;
			if(bEven) {
				System.out.printf("\t정수 %d 는 짝수\n", intNum);
			}else {
				System.out.printf("\t정수 %d 는 짝수가 아님\n", intNum);	
			}
		} catch(Exception e) {
			System.out.println("입력한 문자열을 숫자로 변경할 수 없음");
			
		}
		
		/*
		 * 코드가 실행되는 도중에 어떤 문제로 인하여 exception 이 발생하는 경우 코드가 비정상적으로 중단된다
		   만약 많은 데이터를 입력하는 과정에서 코드가 중단되면 입력하던 데이터를 잃게 된다.
		   코드가 비정상적으로 중단 될 것으로 예상되는 경우 exception 처리를 적절히 수행하는 
		   코드를 추가하여 사용자에게 메시지를 전달하고, 계속해서 데이터를 입력하거나, 
		   정상 종료 할수 있도록 수행하는 코드를 exception handling 이라고 한다.
		 */
	}
}
