package com.callor.app.Service;

/*
 * interface가 선행 되어 사용할 메소드를 먼저 선언해 놓아서 인터페이스에 모아두는 것이 좋다
 * 
 * 인터페이스를 만든 후 멘소드를 사용하는 클래스를 따로 만는거 연습하기.
 * 
 */
public interface ScoreService {
	
	public void makeScore();
	
	public void printScore();
}
