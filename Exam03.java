
public class Exam03 {

	public static void main(String[] args) {
		// ������ ���

		int[][] array = new int[5][5];
		int num = 21;
		
		// �Է�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][4 - j] = num++; // 4 = array.length - 1
			}
		}
		// ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
				
	}

}
