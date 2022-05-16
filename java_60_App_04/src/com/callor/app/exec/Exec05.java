package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {
	public static void main(String[] args) {
		
		//배열을 선언만 하고 아직 준비가 안된상태
		//이때 getter, setter를 소환하면 nullpointerexception이 발생
		BookVO[] bookVO = new BookVO[10];
		//배열의 요소를 반드시 초기화 하여야한다.
		for(int i =0;  i<bookVO.length;i++) {
			bookVO[i] = new BookVO();
		}
		int index = 2;
		/*
		 * 배열을 선언했으면 배열을 초기화를 시켜줘야한다. 선언만 하면 못쓴다.
		 */
		bookVO[index] = new BookVO();
		bookVO[index].setTitle("자바의 정석");
		bookVO[index].setComp("도울출판사");

		System.out.println("도서명: "+ bookVO[index].getTitle());
		System.out.println("출판사: "+ bookVO[index].getComp());
		
	}
}
