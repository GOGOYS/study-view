package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		int intSum=0;
		
		for(int i =0; i < intNum.length; i++) {
			intNum[i] = (int)(Math.random()* 100)+1;
		}
		
		for(int i =0; i < intNum.length; i++) {
			System.out.print(intNum[i]+ "\t");
		}
		
		for(int i =0; i < intNum.length; i++) {
			intSum += intNum[i];				
		}
		
		System.out.printf("\n배열의 저장된 값들의 합은 %d 입니다",intSum);
		/*
		 * 이미 위에서 총점을 계산 하였는데 또 반복문을 수행하면서 평균을 다시 계산하는 것은 비효율적이다.
		 */
		float avg = 0f;
		avg= (float)intSum / intNum.length;
		System.out.printf("\n배열의 평균은 %f 입니다.", avg);
		/*
		 * 총점을 구하는 연산이 없다면
		 * 평균을 구할때 먼저 총점을 구하고
		 * 계산된 총점으로 나누어 평균을 구하는 것이 좋다
		 * 
		 * 각 항목의 평균을 구하여 누적덧셈을 하는 것은 
		 * 연산 오차를 일으킬 수 있다.
		 */
	}
}
