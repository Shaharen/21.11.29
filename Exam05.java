package 메소드;

public class Exam05 {

	public static void main(String[] args) {
		// 메소드의 리턴 타입
		// 1. int, String, double ..... -> 리턴 타입 존재
		// 2. void -> 리턴 타입이 존재 X

		hello("빅데이터 반");

	}

	// 매개변수 O , 반환값 X
	public static void hello(String str) {

		System.out.println(str + " 반갑습니다~");

		// 리턴 타입이 void 라서 return 필요없음
	}

}
