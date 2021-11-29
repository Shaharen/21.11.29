
public class Exam01 {

	public static void main(String[] args) {
		// 2차원 배열의 생성
		// 자료형[][] 배열명 = new 자료형[첫번째 방][두번째 방];

		// 5행 5열의 배열 생성하기
		int[][] array = new int[5][5];

		// 1. 배열에 데이터값 저장하기
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;
		array[0][4] = 5;

		// 배열을 손쉽게 저장하기 위해 for문 활용하기
		// 행을 반복해 줄 수 있는 for문 작성

		// 하나씩 값이 증가되는 변수 사용!
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			// 열을 반복해 줄 수 있는 for문 작성
			for (int j = 0; j < array[i].length; j++) {// 원하는 층의 길이만큼
				array[i][j] = num;
				num++;
			}
		}

		// 2. 배열에 대한 값 확인하기 -> 이중 for문 사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 3. 다차원 배열
		int[][] arr = new int [2][];
		
		arr[0] = new int[1];
		arr[1] = new int[2];
		
		arr[0][0] = 1;
		arr[1][0] = 2;
		arr[1][1] = 3;
		
		System.out.println(arr[0][2]); // -> 출력 오류
	}

}
