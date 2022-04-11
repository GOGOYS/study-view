package com.callor.arrays;

public class ArraysV5a {
	public static void main(String[] args) {
		
		
		/*
		 * intScore 배열에 담긴 값을 for()문을 사용하여
		 * 각 요소별로 한줄로 출력 하다가
		 * 5번째 요소를 출력한 후 enter(new line)을 하라
		 */
		
		int[] intScore = new int[100];
		
		for(int i=0; i < intScore.length; i++) {
			intScore[i] = (int)(Math.random()* 100)+1;
			
		}
		
		for(int i =0; i < intScore.length; i++) {
			System.out.print(intScore[i] + ", \t");
			
			if((i+1) % 5 ==0 ) {
				System.out.println();
			}
		}
		
		
		
		
	}
}
