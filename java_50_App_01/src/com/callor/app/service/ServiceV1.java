package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {
	
	// final :이 변수는 한번만 변수를 저장 할 수 있다.
	//하지만 class  type의 변수는 그러하지 않는 경우도 있다.
	//class  type의 변수에 final을 선언하는 이유는 
	//한번 초기화된 변수를 다시 초기화하지 못하게 하는 것이다.
	//특히 List와 같이 많은 데이터를 저장하는 변수는 final로 선언해라.
	private  final List<Integer> intList;
	
	//final로 선언된 변수는 반드시 생성자에서 초기화한다.
	public ServiceV1() {
		intList = new ArrayList<>();
	}
	
	public void makeScore() {
		
		for(int i=0; i < 10; i++) {
			
			Integer rnd = (int)(Math.random()* 100)+1;
			intList.add(rnd);
		}
		
		//밑에같은 코드가 들어오면 기껏 List안에 데이터를 넣어놓고
		//초기화가 되기때문에 초기화 되는걸 막기위해 final로 선언한다.
		//intList는 final로 선언되어 있기 때문에 다시 초기화할 수 없다.
		//intList = new ArrayList<>();
	}
	
	public List<Integer> getIntList(){
		return intList;
	}
	
	
	
}
