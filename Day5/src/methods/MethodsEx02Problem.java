package methods;

import java.util.Scanner;

public class MethodsEx02Problem {
	public static int sq(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 하나의 정수를 Scanner로 받아서
		// 제곱하는 정수를 만드세요
		// 입력 (  ) 정수
		// 함수명 sq
		// return문 선택 사항

		System.out.println("정수 입력: ");
		int inputValue = sc.nextInt();
		int result = sq(inputValue);
		System.out.println(result);
	}
}
