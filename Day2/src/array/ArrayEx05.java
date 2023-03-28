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
		int totalSize = arr.length;
		int findDelIndex;

		while (true) {
			System.out.println("현재 남은 공간: " + (totalSize - count));
			System.out.println("1. 추가 2. 삭제 0. 종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				// 추가
				// 1. 공간이 남아있으면 "공간이 있습니다." 추가하면 됨
				// 정수를 하나 입력받는다.
				// 데이터의 개수 증가
				// 공간이 없으면 break;

				// count > 5
				if (count > 5) {
					System.out.println("공간이 다 찼다!");
					break;
				}

				// 공간이 남아있다
				int num = sc.nextInt();

				// 배열의 인덱스
				arr[count++] = num;

				if ((totalSize - count) > 0) {
					System.out.println("저장");
				} else {
					System.out.println("다 찼다");
					break;
				}

			} else if (sel == 2) {
				// 삭제
				// 1. 삭제할 값 입력
				// 2. 삭제할 인덱스를 찾는다
				// 3. 개수가 동일한 새로운 배열을 생성

				findDelIndex = -1;

				int[] temp = arr; // 기존 배열
				int[] arr2 = new int[5]; // 새로운 배열
				int index = 0;
				int j = 0; // 새로 복사하는 배열의 인덱스 부여

				while (index < count) {
					if (count == 0)
						break;

					if (index != findDelIndex) {
						arr[index] = temp[index];
						j++;
					}

					index++;
				}

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
		// c.select1();
		c.select1Solution();
	}

}
