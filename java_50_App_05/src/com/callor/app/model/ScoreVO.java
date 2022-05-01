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
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAgr() {
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
