package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		for(int i =0; i < 100; i++) {
			nums.add((int)(Math.random() *100)+1);
		}
		
		int size = nums.size();
		
		for(int i=0; i < size; i++) {
			if(nums.get(i) >= 55) {
				System.out.printf("\t%3d : %3d\n", i, nums.get(i));
			}
			
		}
	}
}
