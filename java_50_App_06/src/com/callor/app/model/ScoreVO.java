package com.callor.app.model;

/*
 * 성적처리를 하기 위해서 반드시 필요한 데이터
 * 학번, 국어, 영어, 수학
 * 출력 결과를 보기위해 총점과 평균도 있으면 좋다
 * 
 *  **좀더 확장을하여 학생의 석차 항목도 있으면 좋겠다
 *  
 *  필요한 데이터를 설계 : 추상화
 *  private 변수선언 : VO 클래스의 추상화된 데이터를 저장할 변수들 
 *  private 변수에 접근하기 위하여 getter, setter method도 재 정의
 *  
 *  spring project에서는 기본 생성자, 모든 필드를 포함한 임의 생성자를 만들지만, Console Project에서는 생략 가능하다.
 */
public class ScoreVO {
	
	private int intStNum;
	
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intSum;
	private float fAvg;
	
	private int intRank;
	
	

	public int getIntStNum() {
		return intStNum;
	}

	public void setIntStNum(int intStNum) {
		this.intStNum = intStNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		//VO 클래스에서 연산식을 수행하는게 더 좋다.
		//코드를 수정하거나 추가할때 VO를 사용하는게 더 용이하다.
		intSum = intKor + intEng + intMath;
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		//VO 클래스에서 연산식을 수행하는게 더 좋다.
		//코드를 수정하거나 추가할때 VO를 사용하는게 더 용이하다.
		fAvg = (float)intSum / 3;
		return fAvg;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}

	/*
	 * toSting을 재정의 하여
	 * 문자열로 만들어 return 한다.
	 */
	@Override
	public String toString() {
		String scStr = String.format("%5d\t", intStNum);
		scStr += String.format("%5d\t", intKor);
		scStr += String.format("%5d\t", intEng);
		scStr += String.format("%5d\t", intMath);
		scStr += String.format("%5d\t", getIntSum());
		scStr += String.format("%5.2f\n", getfAvg());
		return scStr;
	}
	
	
	
	
}	
