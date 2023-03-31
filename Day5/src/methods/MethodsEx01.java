package methods;

import java.util.Scanner;

public class MethodsEx01 {
	public void ex1() {
		// 함수 (입력, 기능, 출력)
		//   - 일련의 코드를 단순화한 문법
		//   - 반복되는 명령문들을 묶었다
		//   - 어떤 문제를 처리하기 위한 방법을 소스 코드로 묶어 놓고
		//     필요에 따라서 동작하는 기능

		/*
		 * 국어, 수학, 영어 각각의 점수를 정수로 입력
		 * 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F
		 * 
		 * 결과
		 * 국어 등급: A 입니다
		 * 수학 등급: B 입니다
		 * 영어 등급: C 입니다
		 */

		// 한 명의 학생 점수를 입력해서 등급 배열과 반복문

		Scanner sc = new Scanner(System.in);

		System.out.println("국어, 수학, 영어");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		int[] scores = new int[3];
		String res = null;

		if (kor >= 90) {
			res = "A";
		} else if (kor >= 80) {
			res = "B";
		} else if (kor >= 70) {
			res = "C";
		} else if (kor >= 60) {
			res = "D";
		} else {
			res = "F";
		}

		System.out.println("국어 등급: " + res + "입니다.");

		if (math >= 90) {
			res = "A";
		} else if (math >= 80) {
			res = "B";
		} else if (math >= 70) {
			res = "C";
		} else if (math >= 60) {
			res = "D";
		} else {
			res = "F";
		}

		System.out.println("수학 등급: " + res + "입니다.");

	}

	public void ex1_1() {
		Scanner sc = new Scanner(System.in);
		// 한 명의 학생 점수를 입력해서 등급 배열과 반복문
		int[] scores = new int[3];

		String res = null;
		String[] subject = { "국어", "영어", "수학" };

		for (int i = 0; i < scores.length; i++) {
			System.out.println("국, 영, 수: ");
			scores[i] = sc.nextInt();

			if (scores[i] >= 90) {
				res = "A";
			} else if (scores[i] >= 80) {
				res = "B";
			} else if (scores[i] >= 70) {
				res = "C";
			} else if (scores[i] >= 60) {
				res = "D";
			} else {
				res = "F";
			}

			System.out.println(subject[i] + res + "입니다");
		}
	}

	public static String grade(int score) {
		String res = null;

		if (score >= 90) {
			res = "A";
		} else if (score >= 80) {
			res = "B";
		} else if (score >= 70) {
			res = "C";
		} else if (score >= 60) {
			res = "D";
		} else {
			res = "F";
		}

		return res;
	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);

		// 함수 실행(호출)
		System.out.println("국어 점수: " + grade(100));
		System.out.println("수학 점수: " + grade(90));
		System.out.println("영어 점수: " + grade(80));
	}

	// 반복되는 문장들을 묶는 메소드 정의

	// 프로그램이 시작하면 가장 먼저 실행하는 함수 (시작점)
	public static void main(String[] args) {
		new MethodsEx01().ex2();
	}
}
