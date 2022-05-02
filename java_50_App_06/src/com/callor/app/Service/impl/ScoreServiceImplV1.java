package com.callor.app.Service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.Service.ScoreService;
import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

//ScoreServiceImplV1에 마우스 올려서 add 오버라이드 하기
public class ScoreServiceImplV1 implements ScoreService{
	
	/*
	 * Service 클래스에서 필요한 데이터를 클래스 영역에 선언할때는
	 * final 키워드를 부착하자
	 * final 키워드를 부착하면 혹시모를 데이터 손상을 방지하고
	 * 		데이터가 저장된 상태에서의 임의의 또다시 초기화 하는 것을 방지하기 위해서
	 * 초기화하지 않으면 오류가 나서 널포인터익셉션을 막을 수 있다.
	 * 
	 */
	
	//리스트 객체를 final로 선언하고
	private final List <ScoreVO> scList;
	
	public ScoreServiceImplV1() {
		
		//생성자에서 리스트 객체를 초기화하여 널포인터익셉션을 사전에 예방한다.
		scList = new ArrayList<>();
	}

	// TODO 성적데이터 생성
	@Override
	public void makeScore() {
		
		//int size = scList.size();
		
		for(int i =0; i <20; i++) {
			
			//51~100까지의 범위의 데이터 생성
			int intKor = (int)(Math.random() * 50)+ 51;
			int intEng = (int)(Math.random() * 50)+ 51;
			int intMath = (int)(Math.random() * 50)+ 51;
			
			//생성된 3과목의 점수를 VO 클래스에 생성하여 저장하기
			ScoreVO scVO = new ScoreVO();
			
			scVO.setIntStNum(i+1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
//			int intSum = intKor + intEng + intMath;
//			float fAvg = (float)intSum / 3;
//			
//			scVO.setIntSum(intSum);
//			scVO.setfAvg(fAvg);
//			
			scList.add(scVO);
			
			
		}
		
		
		
		
		
		
	}

	// TODO 성적 데이터 출력
	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적 일람표");
		System.out.println(Line.sLine(lineLength));
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));
		
		int[] intTotal = new int[4];
		int I_KOR =0;
		int I_ENG =1;
		int I_MATH =2;
		int I_SUM =3;
		
		for(int i =0; i < size; i++) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%3d\t",scVO.getIntStNum());
			System.out.printf("%3d\t",scVO.getIntKor());
			System.out.printf("%3d\t",scVO.getIntEng());
			System.out.printf("%3d\t",scVO.getIntMath());
			System.out.printf("%3d\t",scVO.getIntSum());
			System.out.printf("%3d\t",scVO.getfAvg());
			
			intTotal[I_KOR] += scVO.getIntKor();
			intTotal[I_ENG] += scVO.getIntEng();
			intTotal[I_MATH] += scVO.getIntMath();
			intTotal[I_SUM] += scVO.getIntSum();
		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%d\t%d\t%d\t%d\t%5.2f\n",intTotal[I_KOR],intTotal[I_ENG],intTotal[I_MATH],intTotal[I_SUM]);
		
		
	}

}
