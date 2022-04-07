package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class controllerV2 {
	public static void main(String[] args) {
		
		int sum =sum();
		System.out.println(sum);
		
		ServiceV2 serviceV2 = new ServiceV2();
		//ServiceV2 클래스의 sum() 매서드는 private이기 때문에 여기에서 호출할 수없다.
		//int sum2 = serviceV2.sum();
		
		//ServiceV2 클래스의 add() 매서드는 한정자가 생략되어 있지만.
		//패키지의 위치가 달라서 호출할 수없다.
		/* serviceV2.add(); */
	} // end  main
	
	private static int sum() {
		return 30 +40;
	}
}
