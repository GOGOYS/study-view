package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class GetValue {
	 public  static List<Integer> gerList(int length){
		 
		 List<Integer> list = new ArrayList<>();
		 for(int i =0; i < length; i++) {
			 int num = (int)(Math.random() * 100)+1;
			 list.add(num);
		 }
		 return list;
		 
	 }
	 
	 public static int[] getArray(int length) {
		 int[] intNum = new int[length];
			
			for(int i =0; i < intNum.length; i++) {
				
				intNum[i] = (int)(Math.random() *100 ) + 1;	
			}
			
			return intNum;
	 }
	 	
}
