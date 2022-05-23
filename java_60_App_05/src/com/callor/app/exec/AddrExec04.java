package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrExec04 {
	public static void main(String[] args) {
		/*
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할때는 Generic type을 지정한다.
		 * 1.List에 add 하는 데이터를 제한하여 잘못된 데이터가 add 되는 것을 방지하기 위함
		 * 2.메모리 낭비를 막고 성능상 잇점이 있기 때문에 아래 선언된 List는 Generic type이 AddressVO이다.
		 * 여기 List에 데이터를 추가하려면 먼저 AddressVO type의 vo 객체를 만들고, 데이터를 저장한 다음 add한다.
		 */
		List<AddressVO> addrList = new ArrayList<>();
		/*
		 * vo데이터를 List에 add 하기 위해서는 항상 새로운 vo를 생성하고 데이터를 setting하고 add해야한다.
		 */
		AddressVO addrVO1 = AddressVO.builder().name("홍길동").age(20).habby("춤").build();
		addrList.add(addrVO1);
		
		AddressVO addrVO2 = AddressVO.builder().name("이몽룡").age(21).habby("신").build();
		addrList.add(addrVO2);
		
		AddressVO addrVO3 = AddressVO.builder().name("성춘향").age(22).habby("왕").build();
		addrList.add(addrVO3);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddrList(addrList);
		
		
	}
}
