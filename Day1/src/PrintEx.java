
public class PrintEx {

	public static void main(String[] args) {
		// 계산 (산술연산자)
		// println 단축어 sysout 친 다음 Ctrl+Space
		System.out.println(1 + 1);
		System.out.println(2 - 2);

		System.out.println(10 * 10); // 곱하기
		System.out.println(10 / 5); // 나눗셈
		System.out.println(10 % 2); // 나머지
		System.out.println(); // 줄 바꿈

		System.out.println("프로그램 끝");

		System.out.println("2 * 2 - 4 결과:" + (2 * 2 - 4));

		// 1) 월급 150만원 연봉 출력
		int monthPrice = 1_500_000;
		System.out.println("연봉: " + monthPrice);

		// 2) 연봉 출력하는데 세금 10% 제외하고 연봉 다시 출력
		System.out.println("세금 10% 제외 연봉: " + (int) (monthPrice * 0.9));

		// 3) 시험 점수 30, 50, 40점 평균 구해서 출력
		int[] testResults = { 30, 50, 40 };
		int totalTestScore = 0;
		for (int i : testResults) {
			totalTestScore += i;
		}
		int averageTestScore = totalTestScore / testResults.length;
		System.out.println("평균 시험 점수: " + averageTestScore);

		// 4) 100초를 1분 40초로 출력
		int time = 100;
		int minute = time / 60;
		int seconds = time % 60;
		System.out.println(time + "초는 " + minute + "분 " + seconds + "초");

		// println()
		// Hello World!

		// 1 + 2 결과 출력
		System.out.println("1+2: " + (1 + 2));

		// 3 - 2 결과 출력
		System.out.println("3-2" + (3 - 2));

		// 7 3 * / (몫) (나머지값) 결과 출력
		System.out.println("7 / 3 몫: " + 7 / 3 + " 나머지: " + 7 % 3);

	}

}
