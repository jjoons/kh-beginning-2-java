package array;

import java.util.Scanner;

class Ex5 {
	public void sameString() {
		// == 문자열과 문자열 비교할 땐 .equals() 사용
		//   두 개의 문자가 같으면 true, 다르면 false
		String name = "이서희";
		String name2 = "이지희";

		// 비교 name == name2 같은지?

		System.out.println(name == name2);

		String name3 = "이서희";
		// 비교 name == name3 같은지?

		System.out.println(name == name3);

		// name을 변경 -> "강동원" 출력
		name = "강동원";
		System.out.println(name);
	}

	public void select1() {
		Scanner sc = new Scanner(System.in);

		// 숫자 (정수)
		int[] arr = { 10, 20, 0, 0, 0 };
		int count = 2;

		for (;;) {
			int remainCount = arr.length - count;

			System.out.println("현재 남은 공간: " + remainCount);
			System.out.println("1. 추가 2. 삭제 0. 종료");
			int sel = sc.nextInt();

			System.out.println(count + "," + remainCount);

			if (sel == 1) {
				// 추가
				// 1. 공간이 남아있으면 "공간이 있습니다." 추가하면 됨
				// 정수를 하나 입력받는다.
				// 데이터의 개수 증가
				// 공간이 없으면 break;

				if (count <= 5) {
					arr[remainCount - 1] = arr[count + 1] + 10;
					count++;
				} else {
					System.out.println("공간이 가득 찼습니다");
				}
			} else if (sel == 2) {
				// 삭제

				if (count > 0) {
					arr[remainCount - 1] = 0;
					count--;
				} else {
					System.out.println("공간이 비어있습니다");
				}
			} else if (sel == 0) {
				break;
			} else { // 예외적인 메시지
				System.out.println("0~2번 사이만 입력하세요");
			}
		}
	}

	public void select1Solution() {
		Scanner sc = new Scanner(System.in);

		// 숫자 (정수)
		int[] arr = { 10, 20, 0, 0, 0 };
		int count = 2;

		while (true) {
			System.out.println("현재 남은 공간: " + (arr.length - count));
			System.out.println("1. 추가 2. 삭제 0. 종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				// 추가
				// 1. 공간이 남아있으면 "공간이 있습니다." 추가하면 됨
				// 정수를 하나 입력받는다.
				// 데이터의 개수 증가
				// 공간이 없으면 break;

			} else if (sel == 2) {
				// 삭제

			} else if (sel == 0) {
				break;
			} else { // 예외적인 메시지
				System.out.println("0~2번 사이만 입력하세요");
			}
		}
	}
}

public class ArrayEx05 {

	public static void main(String[] args) {
		Ex5 c = new Ex5();
		// c.sameString();
		c.select1();
		// c.select1Solution();
	}

}
