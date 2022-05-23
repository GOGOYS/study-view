package com.callor.app.exec;

public class exex02{
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0; i< nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i <nums.length; i++) {
			if( nums[i]% 2 == 0) {
				System.out.printf("%d는 짝수 입니다\n",nums[i]);
			}else {
				System.out.printf("%d는 홀수 입니다\n",nums[i]);
			}
		}
	}
}
