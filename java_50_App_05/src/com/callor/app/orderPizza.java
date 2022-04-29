package com.callor.app;

public class orderPizza {
	public static void main(String[] args) {

		
		int num = (int) (Math.random() * 25) + 25;
		
		int count = 1;
		
		
		for(int i =1; i < num; i++) {
			
			if(num > 6 * i) {
				count++;
			}
		}
		System.out.printf("학생 %d명에게 필요한 피자의 판수는 %d판 입니다\n", num, count);

		
		
		int pizza =6;
		
		if(num % pizza ==0) {
			System.out.printf("인원 %d는 %d의 피자가 필요", num, num/pizza);
		}else {
			int pan = (num / pizza) +1;
			System.out.printf("인원 %d는 %d의 피자가 필요", num, pan);
		}
	}
}
