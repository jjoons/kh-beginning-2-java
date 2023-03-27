import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 2개를 입력받아서 합 출력

		// 성적을 입력받아 60점 이상 100점 이하 true, false
		// if문 쓰지 말기

		// 비교연산자
		// >= 크거나 같음
		// == 같음
		// != 다름

		// 논리연산자
		// and (&&) 비교 연산자 두개 이상 모두 참
		// ex) 영화티켓

		// or (||) 비교 연산자 두개 이상 중 하나만 참
		// ex) 할인카드

		// 증감연산자
		// - 무조건 1밖에 증가하거나 감소함
		// ++ , --

		// ++변수명 먼저 증가하고 그 다음에 반환
		// 변수명++ 반환한 뒤 증가
		int num1 = 10;
		int num2 = (++num1) + 2;
		int num3 = 20;

		// 복합연산자
		// +=, -=, *=, /=
		// A += B; 는 A = A + B; 와 같음

		// 조건연산자 (삼항연산자)
		// 비교문 ? 참인경우 : 거짓인경우
		String res = 10 == 10 ? "true" : "false";
		boolean res2 = 10 == 10;

	}

}
