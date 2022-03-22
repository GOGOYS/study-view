/*
 * 현재 생성한 HelloKorea 클래스는 
 * com/callor/hello 폴더에 저장되어있다 라는 표식
 * 현재 생성한 클래스가 저장된 base package다
 */


package com.callor.hello;

// 지금 작성하는 소스코드는 HelloKorea.java 파일이다
// HelloKorea.java를 클래스파일 또는 자바소스코드 라고한다.
public class HelloKorea {
//	Syntax error 자바가 알아먹지 못하는 단어(잘못입력했다는 뜻)
	/*
	 * main 키워드 +컨트롤 +스페이스바: 상용구 작성
	 * @param args
	 * 
	 * Key words, reserved word, 명령어(command word)
	 * package public, class, static, void
	 */
	public static void main(String[] args) {
		
		System.out.println("반갑습니다");
		System.out.println(30 + 40);
		System.out.println(30 * 40);
		System.out.println(40 - 30);
		System.out.println(40 / 2);
		
		System.out.println("30 + 40 = " + ( 30 + 40));
		// 위의 코드는 컴파일 되는 과정에서 아래의 코드처럼 변한다.
		// 앞에 문자열이 있고 뒤의 연사자가 +되면 컴퓨터는 연산자를 문자열로 바꾼다.
		System.out.println("30 + 40 = " + "70");
		
		System.out.println("대한" + "민국");
		// 문자열 덧셈 연산
		// 문자열+문자열은 문자열을 연결하여 결과를 만든다.		
		System.out.println("대한민국");
		// 문자열 끼리 연산은 덧셈만 가능하며, 문자열 연결이라고 한다.		
		
	}

}
