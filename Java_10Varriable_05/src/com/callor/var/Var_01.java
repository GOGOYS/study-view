package com.callor.var;

public class Var_01 {
 public static void main(String[] args) {
	 
	 //실수 형으로 선언할 경우 0보다는 0.0처럼 명확하게 표현하는 것이 좋다 
	 double douNum1 = 0.0;
	 double douNum2 = 0.0;
	  
	 douNum1 = Math.random() *1000;
	 douNum2 = Math.random() *1000;
	  
	 double douSum = douNum1 + douNum2;
	 double douProduct = douNum1 * douNum2;
	 double douMinus = douNum1 - douNum2;
	 double douDivision = douNum1 / douNum2;
	 
	 System.out.println(douNum1);
	 System.out.println(douNum2);
	  
	 System.out.println(douNum1 + " + " + douNum2 + " = " + douSum );
	 System.out.println(douNum1 + " * " + douNum2 + " = " + douProduct );
	 System.out.println(douNum1 + " - " + douNum2 + " = " + douMinus );
	 System.out.println(douNum1 + " / " + douNum2 + " = " + douDivision );
	  
}
}
