package shop.heavenstar.Var;

public class Var_04 {

	public static void main(String[] args) {

		int num1 = 10;
		num1 = num1 + 10; //영문자 17글자(빈칸 ;) 포함해서
		
		//용량을 줄이기 위해서
		num1=num1+10; //영문자 13글자
		
		num1+=10; //  num1 = num1 + 10; 과 똑같은 코드
		num1 += 10;
		
		num1 += 1; // 1 증가 시키기
		
		num1 ++; // 1 증가 시키는건 ++

		
		num1 = num1 - 10;
		num1 -= 10;
		
		num1 = num1 - 1;
		num1 -= 1;
		
		num1 --;
		
		num1 *= 3; // num1 = num1 * 3; 원래의 num1값에 3을 곱해서 다시 num1에 저장
		num1 -= 3;
		num1 /= 3;
		num1 %= 3;
	}

}
