package �޼ҵ�;

public class Exam07 {

	public static void main(String[] args) {
		// ������ ���� num1 �� num2 �� �ʱ�ȭ�ϰ�
		// ������ ���� op �� ������ ���ϴ� �����ڷ� �ʱ�ȭ
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
		}return -1;	// ���� Ȯ��
		
	}
}
