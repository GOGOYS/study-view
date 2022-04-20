package com.callor.classes.exec;

public class StringEx1 {
	 public static void main(String[] args) {
		String strNation = "대한민국만세";
		System.out.println(strNation);
		
		String strName = new String("홍길동");
		System.out.println(strName);

		//문자열 중에서 일부분만 추출하고 싶을때
		// 3번째 전까지 자르기 3번째 이후로 추출
		String strNo1 = strNation.substring(3);
		// 3번째부터 5번째 사이만 추출하기
		String strNo2 = strNation.substring(3,5);
		
		System.out.println(strNo1);
		System.out.println(strNo2);
		
		//갈수록 앞글자 하나씩 잘라먹기
		for(int i =0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i));
		}
		
		
		// 한글자씩 출력하기
		for(int i =0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i, i+1));
		}
		
		
		//print와 같은 작동원리? 	System.out.println(strNation);

		for(int i =0; i < strNation.length(); i++) {
			System.out.print(strNation.substring(i, i+1));
		}
		System.out.println();
		
		
		
		int[] intNum = new int[10];
		
		/*
		 * 배열에 있는 length는 속성이다.
		 */
		for(int i =0; i < intNum.length; i++) {
			System.out.print(intNum[i]);
		}
		System.out.println();
		
		
		
		
		/*
		 * 문자열의 있는 length는 메서드이다.
		 * 반복문이 실행될때마다 length메서드를 호출하여 사용한다.
		 * 너무나 비효율적
		 */
		
		/*
		 * str1.length()는 문자열의 길이를 계산하는 메서드이다.
		 * for()반복문이 문자열의 길이만큼 반복될때 계속해서 문자열의 길이를 계산하는 코드가 실행된다.
		 */
		String str1 = "0123456789";
		for(int i =0; i < str1.length();i++) {
			System.out.print(str1.substring(i, i+1));
		}
		System.out.println();
		
		/*
		 * for() 문이 실행되기 전에 문자열의 갯수를 계산하여 return하는 length매서드를 호출하고
		 * 결과를 변수에 담자. 
		 * 이제는 문자열의 길이를 계산하는 코드는 한번만 실행되고
		 * 문자열의 길이만큼 반복물을 수행할 수 있게 된다.
		 * 상당히 많은 코드 실행이 없어져 효율적이 코드가 된다.
		 */
		String str2 = "0123456789";
		int str2Length = str2.length();
		for(int i =0; i < str2Length;i++) {
			System.out.print(str1.substring(i, i+1));
		}
		System.out.println();
		
		
		
		
	}
}
