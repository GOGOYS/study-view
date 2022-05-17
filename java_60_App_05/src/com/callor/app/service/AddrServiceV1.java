package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1{
	
	//매개변수 1개 받기
	public void printAddr(AddressVO vo){
		System.out.println(vo.toString());
		
	}
	
	//배열의 매개변수 1개 받기 = 1개지만, 배열의 갯수말큰 vo가 전달
	public void printAddrList(AddressVO[] vo) {
		for(int i=0; i <vo.length;i++) {
			//객체만 printli()에 전달하면 
			//내부에서 vo.toString()을 호출하여 문자열을 받아 출력
			System.out.println(vo[i]);			
		}
	}
	
	public void printAddrList(List<AddressVO> addrList) {
		
			for(AddressVO vo : addrList) {
				System.out.println(vo.toString());			
			}
			int size = addrList.size();
			
			for(int i =0; i < size; i++) {
				System.out.println(addrList.get(i));
			}
			
	}

}
