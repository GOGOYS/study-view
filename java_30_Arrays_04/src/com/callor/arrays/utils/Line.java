package com.callor.arrays.utils;

public class Line {

		/*
		 * 클래스 영역의 dLine, sLine 문자열형 변수를 선언하기
		 * static 키워드 : 프로젝트 코드가 실행되는 순간
		 * 				   항상 자동으로 사용할 준비가 되도록 --선언하는 키워드
		 * 
		 * final 키워드 : 변수에 final 키워드가 부착되면, 한번 저장된 값을 
		 * 				  절대 변경 할 수 없다 (can not assign)
		 * 
		 * 프로젝트에서 공통으로 공유하여 사용ㅎ라 변수는
		 *  public static final 키워드를 함께 사용한다.
		 */
		public static final String dLine = "=".repeat(100);
		public static final String sLine = "-".repeat(100);
		
		/*
		 * return 타입이 문자열형(String 형, String type인)
		 * dLine method 선언
		 */
		public static String dLine(int count) {
			
			String dLine = "=";
			return dLine.repeat(count);
		}
		
		
		/*
		 * int type(정수형) argument가 1개 있고
		 * return type이 String type(문자열 형)인 sLine method선언
		 */
		public static String sLine(int count) {
			String sLine = "-";
			return sLine.repeat(count);
		}
		
}
