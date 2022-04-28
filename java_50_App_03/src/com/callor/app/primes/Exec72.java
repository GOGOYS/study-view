package com.callor.app.primes;

public class Exec72 {
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		
		for(int i =0; i < nums.length; i++) {
			int num = (int)(Math.random() * 100)+2;
			nums[i] = num;
		}
		
		int count =0;
		for(int num : nums) {
			int index = 0;
			for(index = 2; index < num; index++) {
				if(num % index ==0) {
					break;
				}
			}
			
			//for(index)가 break를 만났으면 index 값은 num보다 항상 작다
			//index 값이 num 보다 작다는 것은 num가 소수가 아니라는 것
			//그 반대이면 index == num 으로 검사할 수 있지만
			//index >= 로 검사하여 좀더 안전한 코드로 작성한다.
			if(index >= num) {
				count++;
			}
		}
		System.out.println("소수의 개수 :" + count);
	}
}
