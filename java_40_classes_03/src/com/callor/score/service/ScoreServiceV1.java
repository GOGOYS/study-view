package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {
	
	protected ScoreV2VO[] scores;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		scores = new ScoreV2VO[length];
		for(int i=0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}
	
	//학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {
		
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
		System.out.println(Line.dLine(50));
		System.out.println("삧나고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		for(int i=0; i < scores.length; i++) {
			System.out.print(scores[i].getStrName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n", scores[i].getfAge());
		}
		System.out.println(Line.dLine(50));
	}
	
	public void printScoreSum() {
		int intKorSum =0;
		int intEngSum =0;
		int intMathSum =0;
		int intSumSum =0;
		int intArgSum =0;
		for(int i = 0; i< scores.length; i++) {
			intKorSum += scores[i].getIntKor();
			intEngSum += scores[i].getIntEng();
			intMathSum += scores[i].getIntMath();
			intSumSum += scores[i].getIntSum();
			intArgSum += scores[i].getfAge();
		}
		
		System.out.print("점수합  ");
		System.out.print(intKorSum + "\t");
		System.out.print(intEngSum + "\t");
		System.out.print(intMathSum + "\t");
		System.out.print(intSumSum + "\t");
		System.out.print(intArgSum);
	}
	
	
}


