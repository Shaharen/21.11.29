package 메소드;

public class Exam06 {

	public static void main(String[] args) {
		// 사칙연산 메소드 구현
		
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
	}
	public static void add(int x1, int x2) {
		int result = x1 + x2;
		System.out.println(result);
	}
	public static void sub(int x1, int x2) {
		int result = x1 - x2;
		System.out.println(result);
	}
	public static int mul(int x1, int x2) {
		int result = x1 * x2;
		System.out.println(result);
		return result;
	}
	public static int div(int x1, int x2) {
		int result = x1 / x2;
		System.out.println(result);
		return result;
	}
}
