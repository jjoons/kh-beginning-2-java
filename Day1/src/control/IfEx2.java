package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		/*
		 * 최대값 구하기 1단계
		 * 1. 숫자 3개 입력받음
		 * 2. 입력받은 3개의 수를 비교해
		 * 3. 가장 큰 수를 출력함
		 * 4. 가장 작은 수 출력함
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int max = num1;
		int min = num1;

		// 큰 값
		if (max < num2) {
			max = num2;
		} else if (max < num3) {
			max = num3;
		}

		// 작은 값
		if (min > num2) {
			min = num2;
		} else if (min < num3) {
			min = num3;
		}

		// println 한번만 이용해서 아래와 같은 형식으로 출력
		// 최대값: **
		// 최소값: **
		System.out.println("최대값: " + max + "\n최소값: " + min);

		// sc.close();
	}

}
