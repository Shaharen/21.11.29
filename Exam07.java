package 메소드;

public class Exam07 {

	public static void main(String[] args) {
		// 정수형 변수 num1 과 num2 를 초기화하고
		// 문자형 변수 op 를 선언해 원하는 연산자로 초기화
		int num1 = 50;
		int num2 = 15;
		String op = "-";
		
		int result = (int)cal(num1, num2, op);
		
	}
	
	public static int cal(int x1, int x2, String a ) {
		if (a.equals("-")){
			int result = x1 - x2;
			return result;
		}
		if (a.equals("*")) {
			int result = x1 * x2;
			return result;
		}return -1;	// 오류 확인
		
	}
}
