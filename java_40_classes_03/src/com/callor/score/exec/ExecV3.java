package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {
	public static void main(String[] args) {
		
		/*
		 * VO클래스를 사용하여 배열 선언하기
		 */
		ScoreV2VO[] scores = new ScoreV2VO[10];
		
		//배열로 선언된 객체는 사직 사용할 준비가 덜 되었다.
		//각 요소들을 반드시 생성자로 초기화 시켜주어야한다.
		scores[0] =new ScoreV2VO();
		scores[1] =new ScoreV2VO();
		scores[2] =new ScoreV2VO();
		scores[3] =new ScoreV2VO();
		scores[4] =new ScoreV2VO();
		
		scores[0].setStrName("홍길동");
		scores[1].setStrName("이몽룡");
		scores[2].setStrName("장영자");
		scores[3].setStrName("성춘향");
		scores[4].setStrName("심사임당");
		
	}
}
