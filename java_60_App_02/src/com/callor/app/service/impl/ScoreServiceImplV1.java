package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected final Scanner scan;
	protected final  List<ScoreVO> scList;
	

	public ScoreServiceImplV1() {
		
		scan = new Scanner(System.in);
		scList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputScore() {
		ScoreVO scVO = new ScoreVO();
		
		while(true) {
			/*
			 * 학생이름 입력
			 * QUIT가 입력되면 break;
			 * 국어입력
			 * 영어입력
			 * 수학입력
			 * 
			 * VO 생성
			 * VO에 setting
			 * 
			 * scList.add()
			 */
			System.out.print("학생 이름을 입력하세요(QUIT: 종료) >> ");
			String stNum = scan.nextLine();
			if(stNum.equals("QUIT")) {
				break;
			}
			System.out.print("국어 점수 입력 >> ");
			String stKor = scan.nextLine();
			Integer intKor = Integer.valueOf(stKor);
			
			System.out.print("국어 점수 입력 >> ");
			String stEng = scan.nextLine();
			Integer intEng = Integer.valueOf(stEng);
			
			System.out.print("국어 점수 입력 >> ");
			String stMath = scan.nextLine();
			Integer intMath = Integer.valueOf(stMath);
			
			scVO.setStName(stNum);
			scVO.setStKor(intKor);
			scVO.setStKor(intEng);
			scVO.setStKor(intMath);
			
			scList.add(scVO);
			
		}
		
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}
	

	
}
