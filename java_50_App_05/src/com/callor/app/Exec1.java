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
//		
//		int payment = 50000;
//		int swicth = 1;
//		
//		while(true) {
//			
//			int Count = num / payment;			
//			
//			System.out.printf("%d원의 지급 갯수는 %d입니다\n",payment, Count);
//			
//			num -= (Count * payment);
//			
//			if(swicth >0) {
//				payment /= 5;
//			}else {
//				payment /= 2;
//			}
//			
//			swicth *= (-1);
//			
//			if(num <10) {
//				
//				break;
//			}
//		}
		
		/*
		 * 급여를 현금으로 지급하려 한다.
		 * 대한민국 액면가를 기준으로 최소화폐 매수로 지급하려고 한다.
		 * 급여 금액에 따라 최소 화폐 매수 계산을 수행하기
		 * 
		 * 대한민국 화폐 단위는 
		 * 5만, 1만, 5천, 1천, 5백, 1백, 5십, 1십
		 */
		
		int pay = 3_824_520;
		
		//5만원 권
		int paper = pay / 50000;
		System.out.println("5만원권" + paper);
		pay -= paper * 50000;
		
		//반복적으로 10원까지 계산을 수행하면 결과를 얻을 수 있다.
		
		
		
		
		
	}
	
		
}
