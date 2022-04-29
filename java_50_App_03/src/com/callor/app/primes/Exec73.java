package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec73 {
	public static void main(String[] args) {
		 List<Integer> nums = new ArrayList<>();
		 
		 for(int i=0; i < 100; i++) {
			 /*
			  * int형 데이터를 Integer형 변수에 담기 위해서는
			  * Integer.valueOf() method를 사용하여 INteger형으로 형 변환을 해야한다
			  * 하지만 int 형을 Integer형의 변수에 저장하면
			  * 자동으로 Boxing이 이루어진다.
			  * 이것을 Auto Boxing이라고 한다
			  * 반대는 Auto UnBoxing이라고 한다.
			  */
			 Integer num = Integer.valueOf((int)(Math.random() *100))+2;
			 nums.add(num);
		 }
		 
		 int count =0;
		 int size = nums.size();
		 
		 for(int i =0; i < size; i++) {
			 
			 int num = nums.get(i);
			 
			 int index =0;
			 for(index =2; index < num; index++) {
				 
				 if(num % index ==0) {
					 break;
				 }
			 }
			 
			 if(index >= num) {
				 count++;
			 }
		 }
		 
		 System.out.println("소수의 개수 :"+count);
	}
}