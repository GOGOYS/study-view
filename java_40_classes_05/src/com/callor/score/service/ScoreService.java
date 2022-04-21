package com.callor.score.service;

//인터페이스를 사용하면 결합도는 낮고 응집도는 높게된다.
//클래스를 ?하기 위한 설계도
public interface ScoreService {
	
	public void makeScore();
	public void printScore();
	
	public int reSum();
	public float retAvg();

}
