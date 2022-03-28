package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		int intNum1 =0;
		intNum1 = num1();
		System.out.println(intNum1); //디버깅 코드
		
		int intNum2 =0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 +100;
		
		System.out.println(intNum2);
		System.out.println(num1());
		
		
		/*
		 * add()를 실행(run,명령을 수행)하여 그 결과를 intNum2에 저장해 달라
		 */
		intNum2 = add();
		
		
	}//end main()
	
	/*
	 * add()를 선언하기
	 * 정수 55와 33을 덧셈하여 return하기
	 */
	public static int add() {
		return 55 + 33;
	}
	
	
	/*
	 * num1()을 선언하기
	 */
	public static int num1() {
		//num1이라는 키워드를 선언하기 위해 앞에 public static int를 동반하여 키워드처럼 작동되게함
		//num1 method를 선언했다.
		return 100;

		
	}
}

//키워드는 무언가를 실행하라는 명령

//변수에 값을 담는법
//변수 안에 직접 입력하는방법
//변수안에 변수를 담는법
//변수안에 매서드를 담는법