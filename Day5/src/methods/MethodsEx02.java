package methods;

class MethodsEx02_1 {
	public static void show(int num) {
		System.out.println(num);
	}

	public static String input() {
		String name = "이서희";
		int number2 = 100;
		double number3 = 10.254;

		return name; // main에게 데이터를 보낸다
	}

	public void ex1() {
		int number = 10;

		// {} (중괄호) 기준으로 범위가 나눠진다.
		// 데이터를 이동시킬 매개 변수(parameter)
		show(number);

		// 내가 만든 함수에서 main으로 데이터를 이동시킬 것
		String name = input();
		System.out.println(name);
	}
}


public class MethodsEx02 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return (double) a / b;
	}

	public void ex1() {
		// 모든 결과값을 출력하는 건 main
		int a = 10, b = 20;

		// 내가 만든 함수를 실제로 시작할 때는 main 함수 안에서 해야한다
		int res2 = mult(a, b);
		System.out.println("곱한 결과: " + res2);

		int res = add(a, b);
		System.out.println("더한 결과: " + res);
	}

	public static void main(String[] args) {
		new MethodsEx02().ex1();
	}
}
