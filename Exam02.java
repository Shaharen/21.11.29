
public class Exam02 {

	public static void main(String[] args) {
		// �迭 ���� ������� �Ʒ��� ���
		// �밢�� �������� �ٲٱ�
		int[][] array = new int[5][5];

		// 1) �� ���� ���� �Է�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = 21 + i + 5 * j;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		

		// 2) ���� ���� ����
		int[][] array2 = new int[5][5];
		int num = 21;
		// �Է�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[j][i] = num++;
			}
		}
		System.out.println();
		// ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
