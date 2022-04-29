package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ScoreService{
	
	public static List<ScoreVO> sVO;
	
	public ScoreService() {
		sVO = new ArrayList<ScoreVO>();
	}
	
	public static int makeScore() {
		
		for(int i =0; i <20; i++) {
			
			int num = (int)(Math.random()* 100)+1;
			sVO.getKor();
		}
		
		return 0; 
	}
}
