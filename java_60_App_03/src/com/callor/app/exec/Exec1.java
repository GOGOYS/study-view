package com.callor.app.exec;

/*
 * random()를 사용하여
 * 1~100가지의 임의 정수를 생성하여 변수에 저장
 * 변수에 저장된 값이 짝수인지 홀수인지 판별하여 console에 출력
 * 이 과정을 10번 반복
 */
public class Exec1 {
	public static void main(String[] args) {
		
		int num;
		
		for(int i = 0; i < 10; i++) {
			num = (int)(Math.random()*100)+1;
			
			if(num % 2 == 0) {
				System.out.printf("%d는 짝수입니다\n",num);
			}else {
				System.out.printf("%d는 짝수가 아닙니다\n",num);
			}
		}
	}
}
