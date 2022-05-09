package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ScoreVO {
	private String stName;
	private int stKor;
	private int stEng;
	private int stMath;
	//private int intSum;
	//private float fAvg;
	
	/*
	 * 필드변수와 관계없이
	 * 총점을 계산하여 return하는 method 정의하기
	 * 객체지향에서 이러한 별개의 method를 메시지 라고 한다
	 * 또는 객체의 행위라고 한다.
	 * vo.getIntSum() method를 호출하면
	 * 3과목의 합계점수를 return한다
	 */
	public int getIntSum() {
		int sum = stKor + stEng + stMath;
		return sum;
	}
	
	/*
	 * vo.getAvg를 호출하면
	 * 3과목의 평균을 계산하여 리턴한다
	 */
	public float getAvg() {
		int sum = getIntSum();
		float avg = (float)sum / 3;
		return avg;
	}
	
	/*
	 * toString()의 재정의하여 한학생의 성적리스트를 문자열로
	 * return 하겠다.
	 */
	public String toString() {
		
		String result = "";
		// %-10s : 전체 10자리의공란을 만들고 이름위치를 확보 : 왼쪽정렬 10자리
		result += String.format("%-10s\t", stName);
		
		result += String.format("%5d\t", stKor);
		result += String.format("%5d\t", stEng);
		result += String.format("%5d\t", stMath);
		
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\t", getAvg());
		
		return result;
		
		
	}
	

	

}
