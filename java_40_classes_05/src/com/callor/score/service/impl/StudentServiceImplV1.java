package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	
	private StudentVO[] stList;
	private String stFile;
	
	
	//기본생성자를 없앰으로서 임의 생성자(매개변수)에 값이 가게함
	/*
	 * private StudentServiceImplV1() { }
	 */
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stList = new StudentVO[length];
		for(int i =0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}
	}
	
	@Override
	public void loadStudent() {
		
		//unhandle exception이 나오면 try catch로 묵어주기
		InputStream is = null;
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(stFile + " 파일을 찾을 수 없습니다.");
			//void에  return이 있으면 무조건 코드실행을 종료해라.
			return;
		}
		
		Scanner scan = new Scanner(is);
		/*
		while(true) {
			boolean bYes = scan.hasNext(); // hasNext() 입력된 값이 있냐고 물어보는것
			if(bYes == false) {
				break;
			}
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}
		*/
		
		
		/*
		 * 읽을 값이 있냐고 물어보는 것
		 * 조건문 안에 코드를 넣어서 읽을게 없으면 while문이 종료되게 한다.
		 * 
		 */
		//hasNext()가 참일때만 실행되게끔
		int index = 0; // stList의 요소를 가리키는 것
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번:" + stInfos[0]);
			System.out.println("이름:" + stInfos[1]);
			System.out.println("학년:" + stInfos[2]);
			System.out.println("학과:" + stInfos[4]);
			System.out.println("주소:" + stInfos[5]);
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stList[index++] = stVO;
			
		}//end while // 여기를 지나면 stList에 모든 데이터가 담겨있을것
		this.printStudents();
		
	}// end loadStudent
	
	//V1 클래스에서 학생 stList에 담긴 데이터를 확인하기위해 내부용으로 만든 메서드
	private void printStudents() {
		
		
		for(int i=0; i< stList.length; i++) {
			System.out.println(stList[i].toString());
		}
		//두 for()문의 결과는 같음.
		for(StudentVO vo : stList) {
			System.out.println(vo.toString());
			
		}
		
	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
