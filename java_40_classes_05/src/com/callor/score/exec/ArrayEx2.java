package com.callor.score.exec;

import java.util.List;

import com.callor.score.domain.StudentVO;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int length =10;
		String[] stNums = new String[length];
		String[] stNames = new String[length];
		String[] intGrade = new String[length];
		
		StudentVO[] stList = new StudentVO[10];
		for(int i=0; i < stList.length; i++) {
			stList[i] = new StudentVO();
		}
		
		//한번 선언된 배열을 다시 선언하면서 배열의 저장공간을 설정하면
		//원래에 저장공간을 내비두고 다른 배열의 저장소를 만들어버려서 기존의값을 잃어버린당.
		
		/*
		 * 앞에서 선언, 생성되어 데이터가 추가된 배열을 다시 생성하게 되면
		 * 원래 저장된 데이터는 모두소멸된다.
		 */
		stList = new StudentVO[20];
	}
}
