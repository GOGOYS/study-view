package com.callor.contoller;

import com.callor.Service.ServiceV2;

public class controllrerV5_1 {
	public static void main(String[] args) {
		
		
	
		
		int intNum =1;
		
		/*
		 * for ( ;intNum < 10; intNum++) { System.out.printf("\t%d x %d = %d\n",3,
		 * intNum, 3 *intNum ); }
		 */
		
		for ( ;;) {
			System.out.printf("\t%d x %d = %d\n", 3, intNum, 3 * intNum++);
			
			if(intNum > 9) {
				System.out.println("\tintNum이 10보다 큽니다");
				
				break;
			}
		}
		
		
		
		ServiceV2 serviceV = new ServiceV2();
		
		serviceV.guguDan();
		
		System.out.println(serviceV);
	}
} // end class
