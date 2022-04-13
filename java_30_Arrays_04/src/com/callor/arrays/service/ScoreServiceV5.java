package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * printScore()
 * sumcore()
 */
public class ScoreServiceV5 {
	
	private int[] intKorea;
	
	private int intSum;
	
	public ScoreServiceV5(int length) {
		
		intKorea = new int[length];
		
		intSum =0;
	}
	
	public void makeScore() {
		
		for(int i =0; i < intKorea.length; i++) {
			
			intKorea[i] = (int)(Math.random() * 100) +1;
		}
	}
	
	public void printScore() {
		
	
		System.out.println(Line.dLine(120));
		System.out.println("성적 일람표");
		System.out.println(Line.sLine(120));
		
		for(int i =0; i < intKorea.length; i++) {
			
			System.out.printf("%d : %d\t\t",(i+1),intKorea[i]);
			intSum += intKorea[i];
			
			if((i+1) % 5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println(Line.dLine(120));
	}
	
	public void sumScore() {
		System.out.println("성적의 총점 :" + intSum);
	}
}
