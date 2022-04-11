package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		ServiceV2 serviceV2 = new ServiceV2();
		
		serviceV2.guguDan();
		
		System.out.println("================================");
		
		serviceV2.guguDan(7);
		
		
	}
	
}
