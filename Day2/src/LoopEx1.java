
class A {
	private A() {
	}

	static void problem1() {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5 6 7 8 9
		// 특수문자
		// \t tab 만큼 띄어쓰기
		// \n 줄바꿈

		// 정렬
		// .printf("%숫자d")

		for (int i = 1; i < 10; i++) {
			if (i >= 5 && i <= 9) {
				System.out.print(i + " ");
			}
		}

		// println() 줄바꿈 포함 O
		// printf()  줄바꿈 포함 X, 서식
		// print()   줄바꿈 포함 X
	}
}

public class LoopEx1 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * while (조건문) {
		 *   // 참인 경우 반복하면서 실행
		 * }
		 * 
		 * 
		 * for () {
		 *   
		 * }
		 * 
		 */

		// 1부터 5까지 출력
		// 시작: 1
		// 조건: 1부터 5까지 반복
		// 증감: 1씩

		/*
		 * 정답
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */

		int start = 1;

		while (start != 6) {
			System.out.println(start);
			start = start + 1;
		}

		System.out.println();

		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		for (int i = 10; i > 0; i--) {
			if (i <= 6 && i >= 3) {
				System.out.print(i + (i >= 4 ? ", " : ""));
			}
		}
	}

}
