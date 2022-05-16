package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {
	public static void main(String[] args) {
		
		List<BookVO> bookList1 = new ArrayList<>();
		
		/*
		 * VO 개체가 for문 안에 들어가 있어야 10개의 데이터에 다 다른 값을 집어넣을 수 있다.
		 * for문이 시작될때마다 VO 객체를 초기화 시켜주는 역할이다.
		 */
		BookVO bookVO1 = new BookVO();
		for(int i =0; i < 10; i++) {
			bookVO1.setTitle("Do it 자바");
			bookVO1.setComp("이지즈퍼블리시");
			bookList1.add(bookVO1);
		}
		
		List<BookVO> bookList2 = new ArrayList<>();
		
		for(int i =0; i < 10; i++) {
			/*
			 * 다른 값을 담으려면 for문이 시작될때마다 VO를 선언해서 초기화를 시켜줘야한다.
			 */
			BookVO bookVO2 = new BookVO();
			bookVO2.setTitle("Do it 자바");
			bookVO2.setComp("이지즈퍼블리시");
			bookList2.add(bookVO2);
		}
		
		
		
	}
}
