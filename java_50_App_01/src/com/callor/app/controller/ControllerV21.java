package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV21 {
 public static void main(String[] args) {
	
	 List<Integer> scoreList = new ArrayList<Integer>();
	 ServiceV2 sv2 = new ServiceV2(scoreList);
	 
	 //getScore()가 return한 값을 scoreList에 담는다.
	 scoreList = sv2.getScore(10);
	 
	 // print() method에 객체를 매개변수로 전달하면
	 //print()문 내부에서 객체.toString() 명령을 수행하고 결과를 출력한다.
	 System.out.println(scoreList.toString());
	 System.out.println(scoreList);
	 //두가지 다 같이 사용가능.
 }
}
