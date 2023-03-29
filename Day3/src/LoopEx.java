import java.util.Scanner;

class LEx1 {
	public void problem1() {
		Scanner sc = new Scanner(System.in);

		/*
		 * # 반복문 for
		 * 1. 반복문의 조건 3가지
		 * 1) 초기식
		 * 2) 조건식
		 * 3) 증감식
		 * 2. for문의 구조
		 * for(초기식;조건식;증감식){
		 * 		조건식이 참일 동안 실행할 문장;
		 * }
		 * 3. for문의 실행순서
		 * 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
		 */

		// 1부터 10까지 반복해 3 미만 7 이상 출력
		for (int i = 1; i < 11; i++) {
			if (i < 3 || i >= 7) {
				System.out.println(i);
			}
		}

		// 1부터 100까지 반복. 홀수와 짝수의 합을 각각 출력
		int oddValue = 0; // 홀수
		int evenValue = 0; // 짝수

		for (int i = 1; i < 101; i++) {
			int calc = i % 2;

			if (calc == 0) { // 짝수
				evenValue += i;
			} else { // 홀수
				oddValue += i;
			}
		}

		System.out.println(oddValue);
		System.out.println(evenValue);

		// 1. 5회 반복을 하면서 정수를 입력받는다.
		// 2. 입력받은 정수의 합을 모두 출력한다.
		// 3. 만약 입력받은 합이 100 이상이면
		//    반복이 5회가 아닐지라도 즉시 종료
		int total = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("숫자 입력: ");
			int inputValue = sc.nextInt();

			if (inputValue >= 100) {
				break;
			}

			total += inputValue;
		}

		System.out.println("정수의 합계: " + total);
	}

	public void problem2() {
		Scanner sc = new Scanner(System.in);

		// 먼저 if문으로 풀고 그 다음에 switch로 바꿔서 작성
		// 월(달) 입력받는다
		// 3 ~ 5월까지는 봄
		// 6 ~ 8월  여름
		// 9 ~ 11월 가울
		// 12 ~ 2월 겨울
		// 무한적으로 입력을 받다가 숫자 99를 입력하면 프로그램 종료
		// 1~12 외의 숫자를 입력하면 "월을 잘못 입력했습니다"

		while (true) {
			System.out.println("월을 입력하세요: ");
			int inputMonthValue = sc.nextInt();

			if (inputMonthValue == 99) { // 프로그램 종료
				System.out.println("프로그램 종료됨");
				break;
			} else if (inputMonthValue > 12 || inputMonthValue < 1) { // 잘못 입력했을 때
				System.out.println("월을 잘못 입력했습니다");
			} else if (inputMonthValue == 12 || inputMonthValue <= 2) { // 겨울
				System.out.println("겨울");
			} else if (inputMonthValue >= 9) { // 가을
				System.out.println("가을");
			} else if (inputMonthValue >= 6) { // 여름
				System.out.println("여름");
			} else if (inputMonthValue >= 3) { // 봄
				System.out.println("봄");
			}
		}

		boolean shutdownProgram = false;

		for (;;) {
			System.out.println("월을 입력하세요: ");
			int inputMonthValue = sc.nextInt();

			// JDK 11 이전 버전까지는 case문을 반복해서 적어야했으나
			// JDK 12 이후에는 "case 1, 2, 3:" 등으로 편하게 사용 가능함
			switch (inputMonthValue) {
				case 99: // 프로그램 종료
					System.out.println("프로그램 종료됨");
					shutdownProgram = true;
					break;

				// JDK 12 이후에서 사용 가능한 문법
				case 12, 1, 2: // 겨울
					System.out.println("겨울");
					break;

				case 3: // 봄
				case 4:
				case 5:
					System.out.println("봄");
					break;

				case 6: // 여름
				case 7:
				case 8:
					System.out.println("여름");
					break;

				case 9: // 가을
				case 10:
				case 11:
					System.out.println("가을");
					break;

				default: // 잘못된 값을 입력했을 때
					System.out.println("월을 잘못 입력했습니다");
					break;
			}

			if (shutdownProgram)
				break;
		}
	}

	public void switchEx1() {
		String res = switch (1) {
			case 1 -> {
				yield "";
			}
			default -> {
				throw new IllegalArgumentException("Unexpected value: " + 1);
			}
		};
	}
}

public class LoopEx {

	public static void main(String[] args) {
		LEx1 c = new LEx1();
		// c.problem1();
		c.problem2();
	}

}
