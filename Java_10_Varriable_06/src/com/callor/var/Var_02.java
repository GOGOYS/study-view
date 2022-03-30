package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 10)+1;
		int intNum2 = (int)(Math.random() * 10)+1;
		
		System.out.println(intNum1 >= intNum2);

		
		/*
		 * boolean타입 변수 선언하고 intNum1과 intNum2의 값을 비교하여 나타나는 결과를 변수애 담는다.
		 */
		boolean bYes = intNum1 >= intNum2;
		System.out.println(bYes);
		
		/*
		 * 산술연산과 비교연산을 함께ㅐ 포함하는 연산식(expression)
		 * 1.intNum1 % 2가 연산되고 그 결과가 0과 같은지 비교 연산을 수행한다.
		 * 2. 최종적으로 비교 연산 결과를 bEven 변수에 저장한다.
		 * 3. 이 연산식의 최종결과가 담기는 bEven의 값은 intNum1의 값은 intNum1이 짝수면 true, 아니면 false
		 */
		boolean bEven = (intNum1 %2) == 0 ;
		
		/*
		 * intNum1에 저장된 값이 3의 배수인가?
		 * drainge3에 담긴 값이 true이면 당연히 3의 배수이다.
		 * 담긴 값이 false이면 이 결과를 표현하는데 상당히 어려움이 있다.
		 * 그래서 여기는 3의 배수가 아니다 라고 표현한다.
		 */
		boolean drainge3 = (intNum1 % 3) ==0;
		
		System.out.println(drainge3);
	}
}
