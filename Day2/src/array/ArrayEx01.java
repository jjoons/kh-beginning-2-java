package array;

import java.util.Random;

class C {
	public void description1() {
		// 배열: 동일한 타입의 변수를 여러 개 묶는다.
		// 학생 분들의 점수를 저장하는 배열 25명
		// 단점: 삭제 X, 추가 X (공간)

		// 순서가 있는 자료형, 인덱스는 0부터 시작

		int[] scoreList = new int[25]; // 배열은 고정
		int[] a = { 1, 2, 3 };
		int[] b;

		// 배열 복사 (주소값)
		b = a;

		// 1:1 하나씩 복사하기
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		// 함수를 이용해서 복사
		//   깊은 복사, 얇은 복사
		b = a.clone();

		System.out.println(b[0]);
		System.out.println(a[0]);

		b[0] = 3;

		System.out.println("값 변경");
		System.out.println(b[0]);
		System.out.println(a[0]);

		// 배열의 길이
		// 함수 위에 커서를 두고 Shift+F2를 누르면 온라인 도움말 페이지로 이동
		System.out.println(scoreList.length);

		String[] studentList = new String[25];

		// ArrayList, LinkedList
	}

	public void problem1() {
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제2) 전체 합 출력
		// 정답2) 150
		int result = 0;

		for (int i : arr) {
			result += i;
		}

		System.out.println("정답: " + result);

		// 문제3) 4의 배수의 개수 출력
		//   2개

		int index = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int calc = arr[i] % 4;
			if (calc == 0) {
				count++;
			}
		}

		while (index < arr.length) {
			if (arr[index] % 4 == 0) {
				count++;
			}

			index++;
		}
	}

	public void selectMenu() {
		String[] menus = { "마라탕", "쌀국수", "돈까스", "엽떡", "해장국", "매운갈비찜", "김치찌개", "냉면" };
		Random rand = new Random();

		// 메뉴 개수
		int size = menus.length;

		// 랜덤값을 뽑는다.
		int resultIndex = rand.nextInt(size);
		System.out.println(menus[resultIndex]);
	}

	public void lotto() {
		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;

			System.out.print(lotto[i] + " ");
		}

	}
}

public class ArrayEx01 {

	public static void main(String[] args) {
		C c = new C();
		// c.problem1();
		// c.selectMenu();
		c.lotto();

	}

}
