package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		
		/*
		 * List(Arraylist)
		 * java에서 배열을 대신하여 사용되느 자료형
		 * 여러가지 자료형 중에서 가장 많이 사용하는 구조
		 * List : interface
		 * ArrayList : 구현클래스 //(구현)이란 말이 붙어있으면 인터페이스를 상속받았다.
		 * 
		 * 인터페이스를 이용해서 객체를 선언하고, 생성자를 사용해서 인스턴스화시킨다.
		 */
		List<Integer> intList = new ArrayList<>();
		
		//구현클래스만으로 객체를 선언하고 생성하는 코드를 사용할 수는 있지만,
		//interface를 사용하여 객체를 선언하는것이 좋다.
		ArrayList<String> stList = new ArrayList<>();
		
		//List형의 자료는 저장(추가)할 데이터의 type을 Generic(제네릭)으로 설정한다.
		// Generic으로 설정할 수 있는 type은 반드시  class type이여야 한다.
		//primitive type은 Generic으로 설정할 수 없다.
		List<Float> floatLst = new ArrayList<>();		
	}
}
