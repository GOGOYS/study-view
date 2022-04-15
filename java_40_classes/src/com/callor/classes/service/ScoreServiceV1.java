package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.LIne;

public class ScoreServiceV1 {
	
	/*
	 * 상속을 염두해두고 클래스를 선언할때는
	 * 인스턴스 변수들을 private이 아닌 protected로 선언한다.
	 * protected는 private의 성질을 가지면서 상속받음 클래스에서
	 * 상속받아 변수를 선언한 것과 같은 효과를 낸다.
	 * 인스턴스 변수도 상속이 된다.
	 */
	protected String[] student;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}
	
	public int input() {
		
		System.out.println(LIne.dLine(lineLength));
		System.out.println("빛나라 고교 성적처리 V1");
		System.out.println(LIne.sLine(lineLength));
		
		int index = 0;
		for(index =0;index < student.length; index++) {
			
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름 :(END:중단) ",stNum);
			
			//키보드에서 문자열 입력받기
			String strName = scan.nextLine();
			
			//문자대신 end를 입력하몀 그만 그만입력하겠다 종료
			if(strName.equals("END")) {
				System.out.println("입력을 중단하였습니다.");
				break;
			}
			/*
			 * 학생 이름을 배열에 저장할때는 if문 다음에 위치해야한다.
			 * 만약 if문 위에 코드를 위치하면 중단되기전에 student[index] 요소에 end문자열이 먼저
			 * 저장되기 때문에 학생 이름에 end가 나타날 것이다.
			 */
			student[index] = strName;
			
			
			
			System.out.printf("%d 번 국어점수 : ", stNum);
			//int intScore = scan.nextInt();
			//intKor[index] = intScore;
			
			String strScore = scan.nextLine();
			int intScore =0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 입력해주세요");
			}else {
				intScore = Integer.valueOf(strScore);
			}
			
			intKor[index] = intScore;
			
		}
		
		
		return 0;
	}
	
	
	public void print() {
		
		for(int i =0; i < student.length; i++) {
			System.out.printf("%s\t",student[i]);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
