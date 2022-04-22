package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;

public class ListEx2 {
	public static void main(String[] args) {
		
		//최신 버전은 뒤 쪽의 <>안에 배열의 타입 생략 가능하다.
		List<StudentVO> stList = new ArrayList<>();
		
		for(int i =0; i < 10; i++) {
			StudentVO vo = new StudentVO();
			
			// %05s: %s 사이에 숫자가 있으면 5개의 칸을 만들고 오른쪽 정렬하라. 숫자 앞에0이 있으면 빈칸대신 0을 채워라
			String strNum = String.format("%05s", i+1); 

			int intNum = (int)(Math.random()*100)+1;
			int intGrade = (intNum % 4) +1;
			String strGrade = intGrade + "";
			
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			
			System.out.println(vo.toString());
			stList.add(vo);
		}
	}
}
