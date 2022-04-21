package com.callor.score.controller;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		String stFile = "student.txt";
		int stLength = 50;
		
		StudentServiceImplV1 stService1 = new StudentServiceImplV1(stFile, stLength);
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
		
		
		ScoreServiceImplV1 scServicev1 = new ScoreServiceImplV1();
		scServicev1.makeScore();
		int intSum = scServicev1.reSum();
		float fAvg = scServicev1.retAvg();
		scServicev1.printScore();
	}
}
