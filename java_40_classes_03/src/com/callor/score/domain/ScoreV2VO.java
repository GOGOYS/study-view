package com.callor.score.domain;

public class ScoreV2VO extends Object{
	
	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAge;
	
	
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
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
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}
	public float getfAge() {
		fAge = (float)getIntSum() / 3.0f;
		return fAge;
	}
	
	/*
	 * 빈 공간 우클릭- 소스- 제너레이트 게터앤 세터
	 * alt + shift + s ->  제너레이트 게터엔 세터
	 */
	
	@Override
	public String toString() {
		return "ScoreV2VO ["
				+ "strName=" + strName + 
				", intKor=" + intKor + 
				", intEng=" + intEng + 
				", intMath=" + intMath
				+ ", intSum=" + getIntSum() + 
				", fAge=" + getfAge() + "]";
	}
	
	/*
	 * 빈 공간 우클릭- 소스- 제너레이트 투 스트링
	 * alt + shift + s ->  제너레이트 투 스트링
	 */
	
	
	
}
