package control;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		/*
		 * if (비교문) { 참일 경우 실행할 코드 }
		 * else { 거짓일 경우 실행할 코드 }
		 */

		/*
		 * if (비교문) { 참일 경우 실행할 코드 }
		 * else if (비교문) { 참일 경우 실행할 코드 }
		 * else { 거짓일 경우 실행할 코드 }
		 */

		// 문제) 시험점수3개를 입력받고 학점출력
		Scanner sc = new Scanner(System.in);

		System.out.println("시험점수 3개 입력: ");

		String score = "";
		int averageScore = 0;

		for (int i = 0; i < 3; i++) {
			averageScore += sc.nextInt();
		}

		averageScore /= 3;

		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하 ==> 재시험
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다.
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+

		if (averageScore >= 90) {
			score = "A";
		} else if (averageScore >= 80) {
			score = "B";
		} else if (averageScore >= 70) {
			score = "C";
		} else if (averageScore <= 69) {
			score = "재시험";
		}

		// 숫자의 자리수를 구함
		// 327
		System.out.println(327 / 100);
		System.out.println((327 % 100) / 10);

		int s = averageScore % 10;

		if (s >= 7 && averageScore >= 70) {
			score += "+";
		}
		System.out.println("학점: " + score + ", 점수: " + averageScore);

		// 문자 + 문자 = 연결

		/*
		 * A와 B를 입력받아서 비교하세요
		 * A가 B보다 큰 경우에는 '>'를 출력
		 * B보다 작은 경우에는 '<'를 출력
		 * B가 같은 경우에는 '=='를 출력
		 */
		int a = 10;
		int b = 15;
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}

	}

}
