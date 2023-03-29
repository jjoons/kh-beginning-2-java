import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ArrayEx06C {
	public void example1() {
		// 2차원 배열
		int[][] arr = new int[3][3];

		/*
		 * 아파트 5층 2호
		 * 
		 * 2차원 배열로 선언
		 */
		int[][] apartment = new int[5][2];

		/*
		 * 신체검사를 한다. 키를 저장 (실수)
		 * 
		 * 1학년 3반
		 * 각각의 반에 5명의 키를 저장하는 2차원 배열
		 */
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 전체 출력
		// 2차원 배열에서 length
		for (int i = 0; i < arr2.length; i++) {
			int[] intArr = arr2[i];

			for (int j = 0; j < intArr.length; j++) {
				System.out.print(intArr[j]);
			}

			System.out.println();
		}

		// for
		for (int[] num : arr2) { // 행 전체 꺼내온다. { 1, 2, 3 }
			for (int num2 : num) { // 열에서 하나씩 꺼내온다.
				System.out.println(num2);
			}

			System.out.println();
		}

		// 부분 출력 (원하는 값만 하나 출력)
		// 배열명[행][열]
		// 배열명[행][열] = 값;

		System.out.println(arr2[1][1]);

	}

	public void problem1() {
		int[][] arr3 = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = 10 * k;
				k += 1;

				System.out.print(arr3[i][j] + " ");
			}

			System.out.println();
		}

		Scanner sc = new Scanner(System.in);

		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60

		int index1, index2;

		while (true) {
			System.out.println("인덱스1 입력: ");
			index1 = sc.nextInt();

			System.out.println("인덱스2 입력: ");
			index2 = sc.nextInt();

			if (arr3.length - 1 < index1) {
				System.out.println("인덱스1에 해당 인덱스는 없습니다.");
				continue;
			}

			if (arr3[index1].length - 1 < index2) {
				System.out.println("인덱스2에 해당 인덱스는 없습니다.");
				continue;
			}

			break;
		}

		System.out.println(arr3[index1][index2]);

		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		boolean isFind = false;
		int findIndex1 = -1, findIndex2 = -1;

		while (!isFind) {
			System.out.println("찾고싶은 값 입력: ");
			int wantFindValue = sc.nextInt();

			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					if (wantFindValue == arr3[i][j]) {
						findIndex1 = i;
						findIndex2 = j;
						isFind = true;
					}
				}
			}

			if (!isFind)
				System.out.println("해당 값을 찾을 수 없습니다. 다시 시도해 주세요");
		}

		if (isFind)
			System.out.println("인덱스1: " + findIndex1 + ", 인덱스2: " + findIndex2);

		// 문제 3) 값 2개를 입력받아 교체

	}

	public void problem1Solution() {
		// 문제 3) 값 2개를 입력받아 교체
		int[] list = { 1, 26, 17, 4, 20, 44, 3 };

		// 이미 배열(Array)
		// sort(배열명)
		Arrays.sort(list); // 오름차순

		// toString() 
		// 배열을 출력할 수 있게 밑에 for문처럼 쓸 수 있도록
		// 안에 값들을 문자 타입으로 정리해 두었다.
		String res = Arrays.toString(list);
		System.out.println(res);

		for (int i : list) {
			System.out.println(i);
		}

		// 추가적
		// 내림차순으로 정렬 reverseOrder()
		// 함수가 기본 타입은 정렬하고 내림차순 하지 않는다.
		// 그래서 객체화시키는 wrapper 클래스를 사용한다.
		// ArrayList 타입을 정할 때 기본 타입이 들어가지 않음
		//
		Integer[] list2 = { 1, 26, 17, 4, 20, 44, 3 };
		Arrays.sort(list2, Collections.reverseOrder());
	}
}

public class ArrayEx06 {

	public static void main(String[] args) {
		ArrayEx06C c = new ArrayEx06C();
		// c.example1();
		// c.problem1();
		c.problem1Solution();
	}

}
