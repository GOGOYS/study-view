package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;
import com.callor.score.utils.Score;

public class ScoreServiceV3 extends ScoreServiceV1{
	
	
	public ScoreServiceV3() {
		this(10);
	}
	
	public ScoreServiceV3(int length) {
		scores = new ScoreV2VO[length];
		for(int i=0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}
	
	//학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV3(String[] stNames) {
		
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i =0; i< length; i++) {
			scores[i]= new ScoreV2VO();
			scores[i].setStrName(stNames[i]);
		}
	}
	
	public void makeScore() {
		
		for(int i =0; i < scores.length; i++) {
			int intKor = (int)(Math.random() *50)+51;
			int intEng = (int)(Math.random() *50)+51;
			int intMath = (int)(Math.random() *50)+51;
			
			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
			
			
		}
	}
	
	public void printScore() {
		
		float[] totals = new float[5];
		
		System.out.println(Line.dLine(50));
		System.out.println("삧나고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%-3s\t",scores[i].getStrName());
			System.out.printf("%4d\t",scores[i].getIntKor());
			System.out.printf("%4d\t",scores[i].getIntEng());
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%4d\t",scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAge());
			
			totals[Score.I_KOR] += scores[i].getIntKor();
			totals[Score.I_ENG] += scores[i].getIntEng();
			totals[Score.I_MATH] += scores[i].getIntMath();
			totals[Score.I_SUM] += scores[i].getIntSum();
			
			totals[Score.I_AVG] += scores[i].getfAge();
		}
		System.out.println(Line.dLine(50));
		//%6s 6자리 칸을 만들고 그 빈칸을 비워놔라 
		// "총점"은 4칸을 차지하므로 뒤의 두칸을 공백으로 비워놔라
		System.out.printf("%-3s\t","총점");
		System.out.printf("%4.0f\t",totals[Score.I_KOR]);
		System.out.printf("%4.0f\t",totals[Score.I_ENG]);
		System.out.printf("%4.0f\t",totals[Score.I_MATH]);
		System.out.printf("%6d\t",totals[Score.I_SUM]);
		System.out.printf("%4.2f\n",totals[Score.I_AVG] / scores.length);
		System.out.println(Line.dLine(50));
		
	}
	
	
	
	
}


