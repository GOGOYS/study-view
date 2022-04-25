package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV22 {
	public static void main(String[] args) {
		
		/*
		 * ScoreList에는 실제 데이터가 저장될 곳의 주소만 담겨있는 상태
		 */
		List<Integer> scoreList = new ArrayList<Integer>();
		
		//ScoreList의 주소를 생성자의 매개변수로 주입하기
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		//ScoreList의 주소를 전달받은 intList에 10개의 데이터를 추가하기
		System.out.println(scoreList);
		/*
		 * 변수를 담지 않아도 같은 저장소의 주소를 공유하여 쓴다.
		 * 저장소를 같이 쓰는게 아니라 저장소의 주소값을 공유한다.
		 * List가 final 값이여야 가능하다. 
		 */
		
		//SerivceV2의 getScore()가 추가한 데이터를 바라보고 있는 ScoreList를 출력
		sV2.getScore(10);
		
		//scoreList와 intList는 같은 데이터를 바라보고 있기 때문에
		//ServiceV2.getScore()가 추가한 데이터를 controller에서 출력할 수 있다.
		System.out.println(scoreList);
	}
}
