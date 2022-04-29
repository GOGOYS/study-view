package com.callor.app.model;

import java.util.List;

public class ScoreVO {
	 private List<Integer> intNum;
	 private List<Integer> intKor;
	 private List<Integer> intEng;
	 private List<Integer> intMath;
	 private List<Integer> intSum;
	 private List<Integer> intAgr;
	 
	 
	 
	 
	public List<Integer> getIntNum() {
		return intNum;
	}
	public void setIntNum(List<Integer> intNum) {
		this.intNum = intNum;
	}
	public List<Integer> getIntKor() {
		return intKor;
	}
	public void setIntKor(List<Integer> intKor) {
		this.intKor = intKor;
	}
	public List<Integer> getIntEng() {
		return intEng;
	}
	public void setIntEng(List<Integer> intEng) {
		this.intEng = intEng;
	}
	public List<Integer> getIntMath() {
		return intMath;
	}
	public void setIntMath(List<Integer> intMath) {
		this.intMath = intMath;
	}
	public List<Integer> getIntSum() {
		return intSum;
	}
	public void setIntSum(List<Integer> intSum) {
		this.intSum = intSum;
	}
	public List<Integer> getIntAgr() {
		return intAgr;
	}
	public void setIntAgr(List<Integer> intAgr) {
		this.intAgr = intAgr;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [intNum=" + intNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + ", intAgr=" + intAgr + "]";
	}


}
