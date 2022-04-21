package com.callor.score.controller;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScroeControllerV2 {
	public static void main(String[] args) {
		
		
		String stFile = "src/com/callor/score/data/student.txt";
		int stlength = 50;
		StudentService stService = new StudentServiceImplV1(stFile, stlength);
		stService.loadStudent();
		StudentVO[] stList = stService.getStudents();
		StudentVO stNo1 = stService.findByNum("0001");
		/*
		 * ScoreServiceImplV1 클래스를 사용하여 객체를 생성하고
		 * method를 호출하여 기능을 수행하려고 한다.
		 * 
		 * 원래는-
		 * 클래스 객체 = new 클래스()
		 * 
		 * interface를 상속받아서 선언한 클래스-
		 * 인터페이스 객체 = new 클래스Impl()
		 */
		
		//클래스의 다형성
		//인터페이스를 상속 받았으면 선언할때 인터페이스로 선언한다.
		//생성자는 인터페이스를 상속받은 클래스의 생성자를 호출하여 인스턴스로 생성.
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
	}
}
