
public class Exam01 {

	public static void main(String[] args) {
		// 2���� �迭�� ����
		// �ڷ���[][] �迭�� = new �ڷ���[ù��° ��][�ι�° ��];

		// 5�� 5���� �迭 �����ϱ�
		int[][] array = new int[5][5];

		// 1. �迭�� �����Ͱ� �����ϱ�
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;
		array[0][4] = 5;

		// �迭�� �ս��� �����ϱ� ���� for�� Ȱ���ϱ�
		// ���� �ݺ��� �� �� �ִ� for�� �ۼ�

		// �ϳ��� ���� �����Ǵ� ���� ���!
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			// ���� �ݺ��� �� �� �ִ� for�� �ۼ�
			for (int j = 0; j < array[i].length; j++) {// ���ϴ� ���� ���̸�ŭ
				array[i][j] = num;
				num++;
			}
		}

		// 2. �迭�� ���� �� Ȯ���ϱ� -> ���� for�� ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 3. ������ �迭
		int[][] arr = new int [2][];
		
		arr[0] = new int[1];
		arr[1] = new int[2];
		
		arr[0][0] = 1;
		arr[1][0] = 2;
		arr[1][1] = 3;
		
		System.out.println(arr[0][2]); // -> ��� ����
	}

}
