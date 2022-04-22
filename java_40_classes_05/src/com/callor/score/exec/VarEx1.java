package com.callor.score.exec;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {
	public static void main(String[] args) {
		
		
		// primitive(기본) type keyword // 소문자로 되어 있는 기본 키워드 변수
		// primitive type 변수 선언
		
		//int 타입 변수
		int num1 = 100;
		
		//float 타입 변수
		float num2 = 100.3f;
		
		//boolean 타입 변수
		boolean bYes = true;
		
		
		//class type keyword// 첫글자가 대문자인 타입의 변수들은 그냥 클래스타입이라고 말한다.
		//class type 변수 선언
		//참조형 변수 선언
		
		//Integer 클래스 타입 변수
		Integer intNum1 = 100;
		
		//Float 클래스 타입 변수
		Float fnum2 = 100.3f;
		
		//Boolean 클래스 타입 변수
		Boolean bYes1 = true;
		
		//String 클래스 타입 -문자열형
		String str = "korea";
		
		//StudentVO형 클래스 타입 변수
		StudentVO stVO = new StudentVO();
		
		//StudentVo 배열형
		StudentVO[] stList = new StudentVO[10];
		
		//ScoreSerivce 클래스 타입 변수 //인터페이스도 결국 클래스이다.
		ScoreService scService = new ScoreServiceImplV1();
		
		
	}
}
