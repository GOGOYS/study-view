package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	
	public static void main(String[] args) {
		AddressVO[] addrVO = new AddressVO[3];
		AddrServiceV1 addrService = new AddrServiceV1();
		
		addrVO[0] = AddressVO.builder().name("홍길동").age(22).tel("010-222-2222").build();
		addrVO[1] = AddressVO.builder().name("이소룡").age(24).tel("010-694-7452").build();
		addrVO[2] = AddressVO.builder().name("길동이").age(27).tel("010-401-0032").build();
		addrService.printAddrList(addrVO);
		
		
		
	}

}
