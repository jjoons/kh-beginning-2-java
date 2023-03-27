package control;

import java.util.Scanner;

class Games {
	private Games() {
	}

	static void upDownGame() {
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		int com = 8;

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력: ");
		int me = sc.nextInt();

		// 여러개의 경우를 선택하는 if문
		// if (비교문) 작성 가능
		// else () 작성 X

		if (me < com) {
			System.out.println("Up!");
		} else if (me == com) {
			System.out.println("Bingo!");
		} else {
			System.out.println("Down!");
		}
	}

	static void launchAge() {
		Scanner sc = new Scanner(System.in);

		/*
		 * 나이를 Scanner로 입력받아서
		 * 나이가 20세 미만 "소아청소년"
		 *     20세 이상 "성인"
		 *  
		 * 나이를 입력받고 20세 미만 " 할인율 10% 입니다" 출력
		 *         30세 미만 " 할인율 20% 입니다" 출력
		 *         30세 이상 " 할인율 5% 입니다"
		 */
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		String msg = "";

		if (age < 20) {
			msg = "소아청소년 할인율은 10%입니다";
		} else if (age >= 20) {
			msg = "성인";
			msg += "할인율 " + (age < 30 ? "20" : "5") + "%입니다";
		}

		System.out.println(msg);
	}

	static void gugudanGame() {
		Scanner sc = new Scanner(System.in);

		/*
		 * # 구구단 게임[1단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
		 *    예) 3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		System.out.println("구구단 첫번째 숫자 입력: ");
		int gugudanNum1 = sc.nextInt();
		System.out.println("구구단 두번째 숫자 입력: ");
		int gugudanNum2 = sc.nextInt();
		int result = gugudanNum1 * gugudanNum2;

		System.out.println("정답 입력: ");
		int input = sc.nextInt();
		System.out.println(result == input ? "정답" : "땡");
	}

	static void calcAvgScore() {
		Scanner sc = new Scanner(System.in);

		/*
		 * 국어 수학 영어 3개를 받아서 평균 내기
		 * 평균 점수가 90점 이상인 경우
		 *     국수영 모두 90점 이상 "최우수상"
		 *     그 중 하나라도 90점 미만이면 "우수상"
		 *     
		 * 평균이 80점 이상 89점 이하의 경우
		 *     국어 수학 영어 3개 중 하나라도 90점 이상 "장려상"
		 *     (삭제) 국어 수학 영어 3개 모두! 90점 미만 "입상"
		 *     
		 * 평균 80점 미만 "안녕" 출력
		 */

		System.out.println("국어 점수 입력: ");
		int localLangScore = sc.nextInt();

		System.out.println("수학 점수 입력: ");
		int mathScore = sc.nextInt();

		System.out.println("영어 점수 입력: ");
		int engScore = sc.nextInt();

		int avg = (localLangScore + mathScore + engScore) / 3;

		if (avg >= 90) {
			if (localLangScore >= 90 && mathScore >= 90 && engScore >= 90) {
				System.out.println("최우수상");
			} else if (localLangScore >= 90 || mathScore >= 90 || engScore >= 90) {
				System.out.println("우수상");
			}
		} else if (avg >= 80 && (localLangScore >= 90 || mathScore >= 90 || engScore >= 90)) {
			System.out.println("장려상");
		} else {
			System.out.println("안녕");
		}
	}
}

public class UpDownGame {

	public static void main(String[] args) {
		// Games.upDownGame();
		// Games.launchAge();
		// Games.gugudanGame();
		Games.calcAvgScore();

	}

}
