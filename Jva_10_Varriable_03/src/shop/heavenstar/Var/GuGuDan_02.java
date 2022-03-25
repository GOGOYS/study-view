package shop.heavenstar.Var;

public class GuGuDan_02 {
	public static void main(String[] args) {
		 int intDan =8;
		 int intIndex =1;
		 
		 /*
		  * 미리 출력항 모양을 만들고 ("%d x %d = %d") 뒤에 나열된 값을 %d 대신 부착하여 console에 출력하기
		  * 
		  * 양식(form)을 미리 만들고 form 모양에 따라 값을 출력하는 용도의 method
		  * 
		  * "\n" : println처럼 출력후 줄바꿈하기
		  * "\t" : 키보드의 Tab 키를 누른 것 처럼 간격을 띄우기
		  * "%d" : 정수형 숫자를 표현하는 기호
		  */
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 // 변수명 뒤에 붙어있는 ++는 명령문이 실행되고 다음줄로내려가야 적용된다. 즉 다음줄에서 +1이 된것처럼 사용됨
		 
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);		 
		 System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex ++);		 
	}
}
