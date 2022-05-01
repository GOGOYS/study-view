package com.callor.app.controller;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreController {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		ScoreVO  scoreVO = new ScoreVO();
	
		
		scoreService.makeScore();
		scoreService.scorePrint();
	}
}
