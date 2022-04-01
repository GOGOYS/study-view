package col.callor.controller.op;

public class Operator_04 {
	public static void main(String[] args) {
		
		int intNum1 = 100;
		// intNum1의 부호를 음수로 하여 intNum2에 대입하라
		int intNum2 = -intNum1; 
		
		intNum1 = 100;
		intNum2 = intNum1 * (-1);
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		//bit 연산자
		//intNum1을 이진수로 변환후 각 bit를 OR연산
		intNum2 = intNum1 ^ 2;
		intNum2 = intNum1 | 2;
		
		//각 값을 이진수로 변환후 각 bit를 AND연산
		intNum2 = intNum1 & 2;
		
		//자바에는 제곱 연산자가 없으니 일일히 곱셈을 해야한다.
		System.out.println(intNum2);
	}
}
