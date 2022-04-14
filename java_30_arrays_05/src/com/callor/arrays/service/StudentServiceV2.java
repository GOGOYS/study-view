package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

/*
 * ServiceV2에서 ServiceV1을 상속 받았다.
 * 상속을 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받는다.
 * 단, 생성자 제외
 * 
 * 상속 키워드가 extends(확장) 인 것에 주목
 * 
 */
public class StudentServiceV2 extends StudentServiceV1{
	
	public StudentServiceV2() {
			
		this(10);
	}
	
	public StudentServiceV2(int length) {
		
		strStudents = new String[length];
		
		scan = new Scanner(System.in);
	
	}
	
	/*
	 * ServiceV1에 선언된 메서드 중에서
	 * inputStudent 메서드를 다시 정의 하겠다.
	 */
	@Override
	public int inputStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("학생정보 입력 V2");
		System.out.println(Line.sLine(50));
		
		int index = 0;
		
		for(index = 0; index < strStudents.length; index++) {
			System.out.printf("%d번 학생 이름 입력(QUIT : 중단) > ", index +1);
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			}
			
			strStudents[index] = strName;
		}
		/*
		 * for()가 시작되기전에 선언된 index는 for(){}이 종료되어도 값을 유지하고 있다.
		 * 만약 for()명령문이 모두 수행되지 않고 중단되면 
		 * 항상 index < strStudents.length 보다 작다.
		 */
		
		if(index < strStudents.length) {
			System.out.println("입력이 중단되었습니다.");
		}else {
			System.out.println("입력을 다 마쳤습니다.");	
		}
		
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

