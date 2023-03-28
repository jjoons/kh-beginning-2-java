import java.util.Random;
import java.util.Scanner;

class Games {
	private Games() {
	}

	static void looeGame1() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		int count = 1;
		int totalCount = 0;
		int total = 0; // 누적 점수 저장

		while (count <= 5) {
			// 1. 랜덤 값을 뽑는다.
			//   2단부터 9단 하나 뽑고
			//   1부터 9까지만 곱한다.

			int x = rand.nextInt(8) + 2;
			int y = rand.nextInt(9) + 1;
			int ans = x * y;

			System.out.println("x: " + x + ", y: " + y);
			System.out.println("정답 입력: ");
			int my = sc.nextInt();

			if (ans == my) {
				total += 20; // 20씩 더하기
				// totalCount++;
			}

			count++;
		}

		System.out.println("성적: " + total);
		// System.out.println("성적: " + (totalCount * 20));
	}

	static void problem1() {
		// 문제1) 9의 배수 중 일의 자리가 6인 첫번째 배수 출력 ==> 답: 36
		int a = 1;

		while (a < 100) {
			if (a == 6) {
				System.out.println(9 * a);
			}
			a++;
		}
	}

	static void problem2() {
		// 문제2) 9의 배수 중 십의 자리가 6인 첫번째 배수 출력 ==> 답: 63
		int a = 9;
		int b = 0;
		int c = 0;

		while (a < 901) {
			b = a / 10;
			// c = ; // 첫번째 배수

			if (b == 6) {
				System.out.println(a);
			}

			a += 9;
		}
	}

	static void problem3() {
		// 문제3) 8의 배수 중 150보다 작고 150에 가장 가까운 수 출력 ==> 답: 144
		int a = 1;
		int result = 0;

		while (a < 21) {
			result *= a;

			if (result < 150) {
				System.out.println(result);
			}
		}
	}

	static void upDownGameStage2() {
		/*
		 * Up & Down 게임 [2단계]
		 * 1. com은 랜덤으로 1~100사이를 저장한다.
		 * 2. me는 1~100 사이를 입력한다.
		 * 3. com과 me를 비교해서 com이 크면 "크다", com이 작으면 "작다" 힌트 제공
		 * 4. 정답을 맞추면 게임은 종료된다.
		 *     단, 100점 틀릴 때마다 5점 감소! 0이 되면 게임 종료
		 */

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt(100) + 1;

		int me;
		int score = 100;

		boolean isAnswer = true;

		while (true) {
			System.out.println("Up Down 게임 숫자 입력: ");
			me = sc.nextInt();

			if (com > me) {
				score -= 5;
				System.out.println("크다, 현재 점수: " + score);
			} else if (com < me) {
				score -= 5;
				System.out.println("작다, 현재 점수: " + score);
			} else {
				break;
			}

			if (score <= 0) {
				isAnswer = false;
				break;
			}
		}

		if (isAnswer) {
			System.out.println("정답을 맞췄습니다: " + com + ", 점수: " + score);
		} else {
			System.out.println("점수가 0점이 되어 게임이 종료되었습니다.");
		}
	}

	static void upDownGameStage2Example1() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int com = r.nextInt(100) + 1;
		int score = 100;
		int me = 0;

		//com == me && score == 0

		while (com != me && score != 0) { //true
			System.out.println("1~100 사이의 숫자를 입력하세요");
			me = sc.nextInt();

			score -= 5;
			if (me > com) {
				System.out.println("Down");
				//System.out.println("5점 감점 현재 점수" + score + "입니다.");
			}

			if (me < com) {
				System.out.println("Up");
			}
			System.out.println("5점 감점 현재 점수" + score + "입니다.");

		}

		System.out.println("정답입니다.");
	}

	static void problem4() {
		/*
		 * 정수를 무한적으로 입력 받다가 -100을 입력하면 프로그램 종료!
		
		횟수값을 입력 받아서 횟수만큼 이름을 출력하기 
		횟수 : 3
		
		이서희
		이서희
		이서희
		
		횟수: 10
		이서희
		이서희
		이서희
		이서희
		이서희
		이서희
		이서희
		이서희
		이서희
		이서희
		*/
		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			num = sc.nextInt();
			System.out.println(num);
		} while (num != -100);

		while (num != 100) {
			num = sc.nextInt();
			System.out.println(num);
			if (num == -100)
				break;
		}

		// for (초기식; 조건식; 증감식) {}
		for (num = 0; num != 100;) {

		}
	}
}

public class LooeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 랜덤 (로또. 임의의 수를 하나 뽑는다.)
		Random rand = new Random();

		// nextInt(개수) + 시작수
		// 1부터 시작해서 3까지 3개 중에서 하나를 뽑는다.
		// System.out.println(rand.nextInt(3) + 1);

		// Games.looeGame1(); // 구구단 게임[3단계]

		//Games.problem1();
		// Games.problem2();
		//Games.problem3();
		Games.upDownGameStage2();

	}

}
