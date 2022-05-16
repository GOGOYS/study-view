package com.callor.app.exec;

public class Exec06 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		int count =0;
		for(int i =0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()* 91)+10;
		}
		
		for(int j =0; j< nums.length; j++) {
			int index=0;
			//nums[j] 값이 9라고 했을때
			// 2~ 8까지 반복실행된다.
			for(index =2; index < nums[j]; index++) {
				// 나머지가 0이 되는 순간 break를 만나 for가 중단된다.
				if(nums[j] % index == 0) {
						break;					
				}
			} // for index
			//내부의 break가 실행되면 여기로 탈출한다.
			//break를 만나지 않았을때
			//nums[j] 값과 index값이 같다
			//index 값이 같거나 큰가 비교해본다
			//밑의 값이 true면 break를 만나지 않았다는것
			if(nums[j] <= index) {
				System.out.println(nums[j]  + "는 소수");
			}else {
				System.out.println(nums[j] + "는 소수가 아님");
			}
		} // for(j)
		
		
	}
}
