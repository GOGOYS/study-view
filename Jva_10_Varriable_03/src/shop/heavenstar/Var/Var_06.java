package shop.heavenstar.Var;

public class Var_06 {

	public static void main(String[] args) {
		
		int num1 = 0;
		
		/*
		 * 변수++ 또는 ++변수는 단독으로 사용될때는 연산결과가 똑같다.
		 * 하지만, 다른 명령문 안에서 사용될때는 성질이 매우 달라서 많이 주의를 해야한다.
		 * ++변수 : 가장 먼저 실행되는 명령이된다.
		 * 변수++ : 모든 명령이 다 실행되고 다음줄 명령문으로 진행하기 직전에 실행된다.
		 */
		System.out.println(++num1);
		System.out.println(num1++);
		
		num1 = 0;
		num1 = ++num1 * 3;
		
		System.out.println(num1);
		num1 = 0;
		num1 = num1++ * 3;
		// num1 = num1++ * 3; : 연산이 다 이루어지고 나서 =이 실행되는 거라 num1++는 사실상 의미가 없다.
		System.out.println(num1);
		
		
	}

}
