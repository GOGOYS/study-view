package com.callor.app;

public class Exec1 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 1000000000);
		
		System.out.println("급여 :" + num);

//		int oMan = (num / 50000);
//		num -= oMan * 50000;
//		
//		int ilMan = (num / 10000);
//		num -= ilMan * 10000;
//		
//		int oChun = num / 5000;
//		num -= oChun * 5000;
//		
//		int ilChun = num / 1000;
//		num -= ilChun * 1000;
//		
//		int oBack = num / 500;
//		num -= oBack * 500;
//		
//		int back = num / 100;
//		num -= back * 100;
//		
//		int oShib = num / 50;
//		num -= oShib * 50;
//		
//		int shib = num / 10;
		
		//System.out.printf("5만원 %d, 만원 %d, 오천원 %d, 천원 %d, 오백원 %d, 백원 %d, 오십원 %d, 십원 %d\n",oMan, ilMan,oChun, ilChun, oBack, back, oShib, shib);
		
		int payment = 50000;
		int swicth = 1;
		
		while(true) {
			
			int Count = num / payment;			
			
			System.out.printf("%d원의 지급 갯수는 %d입니다\n",payment, Count);
			
			num -= (Count * payment);
			
			if(swicth >0) {
				payment /= 5;
			}else {
				payment /= 2;
			}
			
			swicth *= (-1);
			
			if(num <10) {
				
				break;
			}
		}
		
	}
	
		
}
