package 메소드;

import java.util.Scanner;

public class Exam04_method {

	public static void main(String[] args) { // main 도 메소드임
		// * 메소드
		// - 객체의 행위를 표현
		// - 반복적으로 사용되는 코드 최소화
		// - 어떤 작업을 수행하기 위한 명령문의 집합

		// 1. 메소드의 구조 ( main메소드를 기준으로 )
		// - 접근 지정자 : public
		// - 리턴 타입 : 메소드 수행 이후 결과값으로 돌아오는 데이터에 대한 타입
		// - 메소드의 이름 ex) main
		// - 메소드가 사용할 X값 -> 메소드 매개변수, 소괄호 안에 들어갈 내용 ex) String[] args
		// - 클래스와 같은 위치에 메소드를 생성할 경우 static 키워드 붙여서 만들기

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);

		int result2 = multipleNumber(num1, num2);
		System.out.println(result2);

		// 메소드는 크게 메소드 호출과 메소드 정의로 작업이 진행된다.
		// 메소드 정의 : 호출하여 쓸 함수를 정의하는 것 -> main 메소드 밖에서 진행
		// 메소드 호출 : 정의된 사용할 함수(알고리즘)을 호출하는 것 ( 정의가 되어야 호출 가능 )

	} // main() 끝나는 부분

	// 새롭게 메소드를 만들 수 있는 영역!!!!
	// 접근 지정자 public => 내부 / 외부 어디서든 접근이 가능한 지정자
	// static : 저장이 되는 영역에 관한 것
	public static int addNumber(int x1, int x2) {

		int result = x1 + x2;

		return result; // 반환해줄 값의 타입이 같아야함
	}
	// 곱
	public static int multipleNumber(int x1, int x2) {

		int result = x1 * x2;

		return result;
	} 
} // class 끝나는 부분
