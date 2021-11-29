
public class Exam02 {

	public static void main(String[] args) {
		// 배열 숫자 진행방향 아래로 출력
		// 대각선 기준으로 바꾸기
		int[][] array = new int[5][5];

		// 1) 각 공간 숫자 입력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = 21 + i + 5 * j;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		

		// 2) 대입 순서 변경
		int[][] array2 = new int[5][5];
		int num = 21;
		// 입력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[j][i] = num++;
			}
		}
		System.out.println();
		// 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
