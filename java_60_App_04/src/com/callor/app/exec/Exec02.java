package com.callor.app.exec;

public class Exec02 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		int evenCount =0;
		int evenSum =0;
		for(int i =0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() *100)+1;
		}
		
		for(int i=0; i < nums.length; i++) {
			if(nums[i] % 2 ==0) {
				evenCount ++;
				evenSum += nums[i];
			}
		}
		
		System.out.printf("짝수의 갯수는 %d이고 짝수의 합은 %d 입니다.",evenCount,evenSum);
	}
}
