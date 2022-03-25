package shop.heavenstar.Var;

/*
 * 호명 : Var_01 클래스
 */
public class Var_01 {

	/*
	 * 호명: main method(메소드, 메서드)
	 * 표기: main()
	 * main()는 public static void 기워드와 한 그룹으로 사용되면 마치 키워드처럼 작동된다.
	 * public static void main(){} Java의 시작점, 진입점 method 명령 그룹이라고 한다.
	 * 
	 * 초기에 자바 프로젝트를 시작할때는 반드시 main(){}블럭에서 부터 코드가 시작되어야 한다.
	 */
	public static void main(String[] args) {
		
		// 숫자형 변수는 선언할 때 반스디 최소한 0으로 값을 할당하자.
		// 변수의 선언과 초기화를 한다.
		int intNum1 = 0;
		int intNum2 = 0;

		//변수를 선언만 한다. 선언만된 변수는 어떤 값이든 먼저 할당,저장,대입 해야만 이후에 문제를 일으키지 않는다.
		int intSum;
		intSum = 0;
		//변수가 초기화(값이 할당,저장,대입) 되어야만 변수를 읽을 수 있다.
		
		System.out.println(intSum); // intSum 변수의 값을 읽어서 콘솔에 출력하라
		System.out.println(); // println() method 괄호안에 아무것도 없으면 빈줄을 한줄 만들어라
		
		/*
		 * 단어() 형태의 단어를 method라고 한다. function, 함수라고 한다. method는 함수에 포함되는 개념이다.
		 * method는 단독으로 사용하지 않고, 다른 키워드와 조합으로 사용되는 경우가 많다.
		 */
		
		/*
		 * 명령문의 조합
		 * 명령문은 키워드1 키워드2 키워드3 처럼 빈칸으로 키워드를 구분하거나
		 * 키워드1.키워드2.키워드3 처럼 Dot(.)으로 키워드를 구분하여 
		 * 하나의 명령문(statement)를 구현(명령문을 문법에 맞게 완성)한다.
		 * 
		 * 빈칸으로 조합된 키워드는 사용 용도에 따라 많은 경우의 수가 있다.
		 * public static void main()
		 * public void main()
		 * public int main() 등등 사용법이 다양하다.
		 * 
		 * Dot(.)로 조합된 키워드는 사용하는 경우의 수가 제한적이다.
		 * System.out.println()
		 * printWriter.printLn()
		 * printWriter.out.printLn()
		 */
		
		
		/*
		 * method는 키워드() 형태로 사용을 하며
		 * 다른 키워드와 조합으로 명령문을 완성한다
		 * ()안에 어떤 값을 첨가 하는데 이것을 아규먼트(arguments)라고 한다.
		 * method에 따라 args가 있거나 없거나 상관 없이 작동 되기도 하고 없으면 문법 오류를 발생하기도 한다.
		 * method에 첨가되는 args는  method코드가 만들어질때 정해지는 것으로 특별한 규칙이 없다.
		 * 사용하는 사람이 잘~ 찾아서 사용해야 한다.
		 */
		System.out.print(0);
		System.out.print(0 + 0);
		System.out.print("대한민국");
		System.out.print("\n");
		// 특수문자를 화면에 표시하고 싶으면 역슬래쉬 \\n 하나 더 넣기
		
		System.out.println();
		
		
		
	}

}
