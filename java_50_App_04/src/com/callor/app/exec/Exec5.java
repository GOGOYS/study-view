package com.callor.app.exec;

import java.util.List;

import com.callor.app.GetValue;

public class Exec5{
	public static void main(String[] args) {
			List<Integer> nums = GetValue.getList(100);
		
		int size = nums.size();
		
		int lastNum =0;
		int lastIndex =0;
		for(int i =0; i < size; i++) {
			
			if(lastNum < nums.get(i)) {
				lastNum = nums.get(i);
				lastIndex = i;
			}
		}
		System.out.printf("%3d : %3d ",lastIndex, lastNum);
		
		// lastNum 값과 일치하는 최초의 요소 위치를 알려주는  method
		int index = nums.indexOf(lastNum);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치" + index);
	}
}
