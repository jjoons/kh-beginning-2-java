package methods_class;

class Calculator {}

public class OverloadingEx {
	// 더하는 기능
	public static void add(int a) {
		System.out.println("하나의 정수 합: " + (a + a));
	}

	public static void add(int a, int b) {
		System.out.println("정수 합: " + (a + b));
	}

	public static void add(double a, double b) {
		System.out.println("실수 합: " + (a + b));
	}

	public static void add(int a, double b) {
		System.out.println("정수와 실수 합: " + (a + b));
	}

	public static void main(String[] args) {
		add(1, 1);
		add(1.1, 2.2);
		add(1, 2.25);

		// 똑같은 이름의 함수를 여러 개 정의할 수 있다
		// 오버로딩 (새로운 함수를 만든다)

		// 조건
		//   함수명: 똑같아야 함
		//   리턴값: 똑같을 필요 없다
		//   매개 변수의 개수가 다르거나 매개 변수의 타입이 달라야 한다.


	}
}
