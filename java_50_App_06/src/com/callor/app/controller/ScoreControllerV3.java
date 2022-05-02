package com.callor.app.controller;

import com.callor.app.Service.ScoreService;
import com.callor.app.Service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
	}
}
