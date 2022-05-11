package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoVO {
	
	private String tKey;            //ID에 해당하는 칼럼
	private String tContent;		//할일 내용
	private String sDate;			//추가한(시작) 날짜
	private String sTime;			//추가한(시작) 시각
	private String eDate;			//완료한 날짜
	private String eTime;			//완료한 시각
	
	private boolean bComp;			//완료여부
	
	@Override
	public String toString() {
		
		String result = String.format("%s\t", tKey);
		result += String.format("%s\t", sDate);
		result += String.format("%s\t", sTime);
		
		//3항연산
		//eDate == null true이면 "진행중" 문자열을 compStr에 저장
		//그렇지 않으면 "완료됨"을 compStr에 저장
		//eDate의 값이 null 이거나 ""이면
		String compStr = eDate == null || eDate.isEmpty() ? "진행중" : "완료됨";
		//아래의 if() 명령문을 간소화한 명령문
		if(eDate == null || eDate.isEmpty()) {
			compStr = "진행중";
		}else {
			compStr = "완료됨";
		}
		
		result += String.format("%s\t", tContent);
		result += String.format("%s", compStr);
		return result;
	}
}
