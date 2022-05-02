package com.callor.app.model;

public class ScoreVO {
	private int intNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAgr;

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	public int getIntNum() {
		return intNum;
	}

	public void setIntNum(int intNum) {
		this.intNum = intNum;
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

	public float getfAgr() {
		//VO 클래스에서 연산식을 수행하는게 더 좋다.
		//코드를 수정하거나 추가할때 VO를 사용하는게 더 용이하다.
		fAgr = (float)intSum / 3; 
		return fAgr;
	}

	public void setfAgr(float fAgr) {
		this.fAgr = fAgr;
	}

	@Override
	public String toString() {
		return intNum + "\t" + intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + fAgr;
	}

}
