package com.callor.app.exec;

public class exex0 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()* 91)+10;
		}
		
		for(int j= 0; j < nums.length; j++) {
			int index =0;
			for(index =2; index < nums[j]; index++) {
				if(nums[j] % index == 0) {
					break;
				}	
			}
			if(nums[j] <= index) {
				System.out.println(nums[j]);
			}
			
		}
	}
}
