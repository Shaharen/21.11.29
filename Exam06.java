package 메소드;

public class Exam06 {

	public static void main(String[] args) {
		// 사칙연산 메소드 구현
		
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
	}
	// 다양한 메소드 출력 방법
	public static void add(int x1, int x2) {
		int result = x1 + x2;
		System.out.println(result); // result 담아서 출력
	}
	public static void sub(int x1, int x2) {
		System.out.println(x1 - x2); // 연산 자체 출력
	}
	public static int mul(int x1, int x2) {
		System.out.println(x1 * x2);
		return x1 * x2; // 결과값 출력 후 리턴에 담기
	}
	public static int div(int x1, int x2) {
		int result = x1 / x2;
		System.out.println(result);
		return result;
	}
}

