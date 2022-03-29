package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
	
		 double douNum1 = 0.0;
		 double douNum2 = 0.0;
		 
		 douNum1 = Math.random() * 1000;
		 douNum2 = Math.random() * 1000;
		 
		 double douSum = douNum1 + douNum2;
		 double douMinus = douNum1 - douNum2;
		 double douMulti = douNum1 * douNum2;
		 double douDiv = douNum1 / douNum2;
		 /*
		  * printf()를 사용하여 변수에 담긴 데이터를 console에 출력하기
		  * "%d + %d = %d" form  string을 사용하여 출력할 모영을 지정하고 
		  * 각각 &d 위치에 표현할 데이터를 나열했다
		  * %d 는 Decimal (10진수)를 표현하는 키 단어이다.
		  * double type은 %d로 표현할 수 없다.
		  * 그래서 오류가 난다.
		  */
		 /* System.out.printf("\t%d + %d = %d\n", douNum1, douNum2, douSum); */
		 
		 /*
		  * printf를 사용하여 실수 데이터를 console에 출력 할려면 %f 기호를 사용하여 표현해야 한다.
		  */
		 System.out.printf("\t%f + %f = %f\n", douNum1, douNum2, douSum);
		 
		 //%.2f : 정수부분은 모두 표현하고 소수점 이하 2째자리까지 표현하라.
		 System.out.printf("\t%.2f + %.2f = %.2f\n", douNum1, douNum2, douSum);
		 
		 System.out.println("\t=====================================");
	
		 System.out.printf("\t%.2f + %.2f = %.2f\n", douNum1, douNum2, douSum);
		 System.out.printf("\t%.2f x %.2f = %.2f\n", douNum1, douNum2, douMulti);
		 
		 System.out.println("\t=====================================");
		 /*
		  * %8.2f : 전체 자릿수를 8개로하고 소수점이라 2자리까지 표현
		  * 만약 데이터가 전체 자릿수보다 작으면 남은 부분을 공백으로 표현
		  * 숫자를 오른쪽으로 정렬할때 사용하는 방법
		  * 8.2 : 정수자릿수 + 소수점(1) + 소수점이하 두자리를 모두 합한 개수가 8개 라는 표현이다
		  * 전체 자릿수가 8개를 넘어가면 form이 흐트러지는 경우도 있다.
		  * 충분히 표현할 수 있는 자릿수로 만들것
		  */
		 System.out.printf("\t%.2f + %.2f = %8.2f\n", douNum1, douNum2, douSum);
		 System.out.printf("\t%.2f x %.2f = %8.2f\n", douNum1, douNum2, douMulti);
	}
}
