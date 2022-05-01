package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ScoreService{
	
	public final List<ScoreVO> sVO;

	int korSum =0;
	int engSum =0;
	int mathSum =0;
	int sumSum =0;
	
	public ScoreService() {
		sVO = new ArrayList<ScoreVO>();

	}
	

	public void makeScore() {
		
		for(int i =0; i <20; i++) {
			int numKor = (int)(Math.random()* 50)+50;
			int numEng = (int)(Math.random()* 50)+50;
			int numMath = (int)(Math.random()* 50)+50;
			int numSum = numKor + numEng + numMath;
			int numAgr = numSum /3;
			ScoreVO scVO = new ScoreVO();
			scVO.setIntNum(i+1);
			scVO.setIntKor(numKor);
			scVO.setIntEng(numEng);
			scVO.setIntMath(numMath);
			scVO.setIntSum(numSum);
			scVO.setfAgr(numAgr);

			sVO.add(scVO);
			korSum += numKor;
			engSum += numEng;
			mathSum += numMath;
			sumSum += numSum;
	
		}
		 
	}
	
	public void scorePrint() {
		String dLine ="=".repeat(60);
		String sLine ="-".repeat(60);
		System.out.println(dLine);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(sLine);
		for(int i =0; i < 20; i++) {
			System.out.println(sVO.get(i));
		}
		System.out.println(dLine);
		System.out.printf("총점\t%d\t%d\t%d\t%d",korSum,engSum,mathSum,sumSum );
	}
	
	
}
