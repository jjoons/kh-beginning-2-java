class SortExC {
	public void bubbleSortEx() {
		// 정렬
		// 버블 정렬
		//

		// 값 교체
		int a = 10, b = 20;
		int temp = 0; // 임시 저장공간

		temp = a;
		a = b;
		b = a;

		// 버블 정렬을 위한 배열 선언
		int[] arr = { 3, 6, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			// 내부 for문 비교해서 큰 값을 뒤로 교체

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp1 = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp1;
				}
			}
		}

		// 순서가 있는 자료형
		// 방번호. 즉, 인덱스 번호가 있는 자료형
		for (int i = 0; i < arr.length; i++) {}

		// 순서가 없는 자료형 (여러개를 저장하는 자료형)
		// 인덱스 번호가 없다
		/*
		 * for (자료형 : 여러개를 저장하는 자료형 변수명) {}
		 * 
		 * 조건을 줄 필요가 없다.
		 * 사이즈를 알아서 계산을 해서 반복한다.
		 * 개수만큼 반복
		 * 
		 */

		String[] list = { "python", "java", "html" };

		for (String str : list) {
			System.out.println(str);
		}

		for (int value : arr) {
			System.out.println(value);
		}
	}

	public void pattern() {
		// 출력
		// *
		// **
		// ***
		// ****
		// *****

		// 중복 for문 이용

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

			}
		}
	}

	public void patternSolution() {
		// 출력
		// *
		// **
		// ***
		// ****
		// *****

		// 중복 for문 이용

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void pattern2() {
		// 결과
		// *         *
		// **       **
		// ***     ***
		// ****   ****
		// ***** *****
		// ***********
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j <= i; j++) {

			}
		}

		// 결과
		/*
		 *    1
		 *   111
		 *  11111
		 * 1111111
		 *  11111
		 *   111
		 *    1
		 */

		// 결과
		// 123A
		// 45BC
		// 6DEF

	}
}

public class SortEx {

	public static void main(String[] args) {
		SortExC c = new SortExC();
		// c.bubbleSortEx();
		c.patternSolution();
	}

}
