/*
 * Var_01.java 파일이 src/com/callor/var 폴터에 저장되어 있다 라는 표식
 */

package com.callor.var;

// class 선언문, class prototype
public class Var_01 {
	//여기서부터 실제 명령문 코드가 작성되는 곳	
	public static void main(String[] args) {
		
		//코드에서 사용되는 수의 체계
		//정수, 실수		
		//정수형(int type), 실수형(float type)
		
		/*
		 * int: 정수형 데이터를 저장할 기억장소를 예약해달라
		 * num1: 예약한 기억장소에 쉬운 num1 이라는 이름을 붙여라
		 *  = 30: 예약된 num1기억장소에 30을 저장하라(할당)
		 *  
		 *  정수형 변수 num1을 선언하고 정수 255 값으로 초기화 하라.
		 *  정수형 변수 num2를 선언하고 정수 88 값으로 초기화 하라.
		 */
		int num1 = 255;
		int num2 = 88;
		//저장소에 이름을 붙여놓고 그곳에 지정된 값을 저장 
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		
		//나중에 코드를 업그레이드 할때 어떻게하면 빠르고 오류가 안나게 업그레이드를 할 수 있을까 라는
		// 고민을 하면서 해야한당.		
		System.out.println(40.0 / 30.0);
		System.out.println(2147483647);
		
		//정수형 변수 num3, num4를 선언 "만" 하기		
		int num3;
		int num4;
		
		//대입 할당: 선언된 정수형 변수 num3, num4에 새로운 값을 할당,저장,대입
		num3 = 40;
		num4 = 100;
		
		
		/*
		 * 선언만 된 변수에서는 값을 읽을 수 없다.
		 * 반드시 앞에서 어떤 값이라도 저장, 할당을 해야만 이후에 읽을 수 있다.
		 */
		System.out.println(num3 + num4);
		
		int num5 = 0;
		//어떤 값을 저장할지 모를때 숫자일 경우 0으로 초기화를 하여, 오류를 예방할 수 있다. 가장 좋은 방법
		
		System.out.println(num5);
		
		int num_1 =0;
		// {} 같은 영역안에서 같은 이름의 변수는 설정할 수 없다.
		 
		/*
		 * 변수 명명규칙과 패턴
		 * 1.첫글자는 무조건 소문자
		 * 2. 이후에는 대소문,숫자,_를 조합할 수있다
		 * 3. 두개 이상의 단어를 조합하여 만드는 것이 좋다
		 * 4. 두개 이상의 단어를 조합할때 두번째 단어부터 대문자
		 * 	=> Camel Case
		 * 5. 두개 이상의 단어를 조랍할때 첫번째 단어는 변수의 type으로 만드는 것이 좋다.
		 *  => 헝가리언 표기법
		 */
		
		
		int intNum1 = 0;
		// 보통 정수형 변수는 변수 이름 앞에 int를 붙여 정수형이라는걸 알려준다.
		
		int intStNum = 16000263;
		int intStAge = 26;
		int intTelNum = 1039526770;
		System.out.println(intStNum + intTelNum + intStAge);
		 
		
		
		//erp: enterprise resource plane
		//mis: 		
		
	}

}
