package �޼ҵ�;

import java.util.Scanner;

public class Exam04_method {

	public static void main(String[] args) { // main �� �޼ҵ���
		// * �޼ҵ�
		// - ��ü�� ������ ǥ��
		// - �ݺ������� ���Ǵ� �ڵ� �ּ�ȭ
		// - � �۾��� �����ϱ� ���� ��ɹ��� ����

		// 1. �޼ҵ��� ���� ( main�޼ҵ带 �������� )
		// - ���� ������ : public
		// - ���� Ÿ�� : �޼ҵ� ���� ���� ��������� ���ƿ��� �����Ϳ� ���� Ÿ��
		// - �޼ҵ��� �̸� ex) main
		// - �޼ҵ尡 ����� X�� -> �޼ҵ� �Ű�����, �Ұ�ȣ �ȿ� �� ���� ex) String[] args
		// - Ŭ������ ���� ��ġ�� �޼ҵ带 ������ ��� static Ű���� �ٿ��� �����

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);

		int result2 = multipleNumber(num1, num2);
		System.out.println(result2);

		// �޼ҵ�� ũ�� �޼ҵ� ȣ��� �޼ҵ� ���Ƿ� �۾��� ����ȴ�.
		// �޼ҵ� ���� : ȣ���Ͽ� �� �Լ��� �����ϴ� �� -> main �޼ҵ� �ۿ��� ����
		// �޼ҵ� ȣ�� : ���ǵ� ����� �Լ�(�˰���)�� ȣ���ϴ� �� ( ���ǰ� �Ǿ�� ȣ�� ���� )

	} // main() ������ �κ�

	// ���Ӱ� �޼ҵ带 ���� �� �ִ� ����!!!!
	// ���� ������ public => ���� / �ܺ� ��𼭵� ������ ������ ������
	// static : ������ �Ǵ� ������ ���� ��
	public static int addNumber(int x1, int x2) {

		int result = x1 + x2;

		return result; // ��ȯ���� ���� Ÿ���� ���ƾ���
	}
	// ��
	public static int multipleNumber(int x1, int x2) {

		int result = x1 * x2;

		return result;
	}
} // class ������ �κ�
