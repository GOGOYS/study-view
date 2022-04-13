package com.callor.arryas.exec;

public class ExecV6a {
	public static void main(String[] args) {
		
		/*
		 *  정수형 배열 100개를 선언하고 Math.random()를 사용하여
		 *  1 ~ 100 까지 임의 수를 생성하고 각 요소에 저장
		 *  배열의 각 요소에 저장된 수 중에서 짝수의 리스트를 
		 *  한 라인에 5개씩 끊어서 출력하시오
		 * */
		
		int[] intNum = new int[100];
		
		/*
		 * 짝수를 5번 출력하고 Enter를 출력하여 줄바꿈하기
		 * i 변수를 사용하여 횟수를 구분하면 홀수일때, 짝수일때 상관없이
		 * i 변수값은 변화를 하기 대문에 문제가 발생한다.
		 * 
		 * 짝수를 출력할때마다 출력한 횟수를 저장할 변구사 필요하다.
		 * 별도로 짝수를 출력할때 마다 출력한 횟수를 저장할 변수를 
		 * for()명령문 이전에 선언해야한다.
		 */
		
		//변수이름은 영문자 255자까지 작성가능
		int intEvenCount = 0;
		
		for(int i=0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100) +1;
			
		}
		
		for(int i= 0; i < intNum.length; i++) {
			
			boolean bEven = intNum[i]  % 2 == 0;
			
			if(bEven) {
				System.out.print(intNum[i]+ ", \t");
				
				//짝수를 출력한 후 출력한 횟수를 1증가 하기
				intEvenCount ++;
				
				boolean bEvenCount = intEvenCount % 5 == 0;
				//짝수를 출력한 횟수가 5가 맞으면 줄바꿈
				
				if(bEvenCount) {
					
					System.out.println();
				}
			}
			
		}
	}
}
