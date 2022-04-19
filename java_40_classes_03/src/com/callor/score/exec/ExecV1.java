package com.callor.score.exec;

import com.callor.score.domain.ScoreVO;
import com.callor.score.utils.Line;

public class ExecV1 {
	public static void main(String[] args) {
		
		//ScroeVO 클래스를 사용하여 3개의 객체를 생성
		ScoreVO stNo1 = new ScoreVO();
		ScoreVO stNo2 = new ScoreVO();
		ScoreVO stNo3 = new ScoreVO();
		
		System.out.println(stNo1.strName);
		System.out.println(stNo1.intKor);
		
		stNo1.strName = "홍길동";
		stNo2.strName = "이몽룡";
		stNo3.strName = "성춘향";
		
		stNo1.intKor = 90;
		stNo2.intKor = 88;
		stNo3.intKor = 100;
		
		//1번 학생의 이름과 국어 점수를 확인하고싶다.
		System.out.println(Line.dLine(50));
		System.out.println("성적처리");
		System.out.println(Line.sLine(50));
		System.out.printf("%s\t%d\n",stNo1.strName,stNo1.intKor);
		System.out.printf("%s\t%d\n",stNo2.strName,stNo2.intKor);
		System.out.printf("%s\t%d\n",stNo3.strName,stNo3.intKor);
		System.out.println(Line.dLine(50));
		
	}
}
