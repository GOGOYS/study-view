package col.callor.controller.op;

public class Operator_02 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 =0;
		
		System.out.println(intNum1 += 10);
		
		System.out.println( (intNum1 += 10) > 10);
		
		
		/*
		 * short-circuit Evaluation(SCE)
		 * 최적화된 단축 평가 값
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다.
		 * 
		 * 이 명령이 실행되면 두개의 논리 연산식이 실행된다. 두개의 논리 연산식의 결과를 OR연산하여
		 * console에 출력한다. 결과는 true 또는 false가 될것이다.
		 * 
		 * ||연산에서 좌우 값중 한개라도 true이면 결과는 당연히 true이다 
		 * 즉 뒤의 결과가 무엇이든 연산의 결과는 true이다.
		 * 따라서 이후의 연산은 실행하지 않는다.
		 */
		System.out.println(
				( (intNum1 += 10) > 20) || ( (intNum2 += 10) > 10)
				);
		System.out.println(intNum1);
		System.out.println(intNum2);
		// || 연산에서 필요없는 코드는 실행하지 않는다. 앞에서 true가 나왔으니 뒤의 코드는 실행되지 않음.
		
		System.out.println(
				( (intNum1 += 10) < 20) && ( (intNum2 += 10) < 100)
				);
		// && 연산에서 필요없는 코드는 실행하지 않는다. 앞에서 false가 나왔으니 뒤의 코드는 실행되지 않음.
		
		// ||와 &&의 특성 이해하기
		
		
		
		
		
		
		
	}
}
