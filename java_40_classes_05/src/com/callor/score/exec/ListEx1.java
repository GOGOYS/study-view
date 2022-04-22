package com.callor.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		
		/*
		 * 배열이 아닌 List라 부른다.
		 * List에 <Integer> 배열 타입을 지정하고 
		 * .add를 이용해 배열에 값을 차례차례 넣을수 있다.
		 * 필요한 데이커가 있으면 .add를 통해 계속해서 값 추가 가능.
		 */
		List<Integer> nums1 = new ArrayList<Integer>();
		List<Float> nums2 = new LinkedList<Float>();
		
		// .add(값) 배열의 값을 담아라
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		
		//get(인덱스) index번째의 값을 읽어와라
		int num0 = nums1.get(0);
		System.out.println(num0);
		System.out.println(nums1.get(2));
		
		//현재 3개의 데이터만 추가되어 있기 때문에 인덱스 3번 요소의 값은 get할 수 없다.
		//System.out.println(nums1.get(3));
		
		//set(인덱스, 값) index번째에 값을 담아라.
		nums1.set(0, 100);
		
		
		
		for(int i = 0; i < nums1.size(); i ++) {
			System.out.println(nums1.get(i));
		}
		//위 코드에서 nums1.size()는 nums1요소의 개수만큼 반복하여 호출된다.
		//이는 비효율적 코드이다.
		
		//size()값을 for()명령 이전에 변수에 담아두고 시작하자.
		int num1Length = nums1.size();
		for(int i = 0; i < num1Length; i ++) {
			System.out.println(nums1.get(i));
		}
		
		for( Integer num : nums1) {
			System.out.println(num);
		}
	}
}
