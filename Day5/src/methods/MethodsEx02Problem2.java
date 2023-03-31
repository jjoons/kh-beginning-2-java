package methods;

public class MethodsEx02Problem2 {
	public int loop(int val) {
		int returnValue = 0;

		for (int i = 1; i <= val; i++) {
			returnValue += i;
		}

		return returnValue;
	}

	public void problem1() {    // 함수명 loop
		// 매개 변수 10
		// 기능: 1부터 매개 변수의 값까지 더한 다음
		//      결과를 return해서 출력

		int result = new MethodsEx02Problem2().loop(5);
		System.out.println(result);
	}

	public static int maxNumber(int a, int b, int c) {
		int returnValue = a < b ? b : a;
		return returnValue > c ? returnValue : c;
		// return Math.max(returnValue, c);
	}

	public static int minNumber(int a, int b, int c) {
		int returnValue = a > b ? b : a;
		return returnValue < c ? returnValue : c;
		// return Math.min(returnValue, c);
	}

	public static boolean equal(String str1, String str2) {
		return str1.equals(str2);
	}

	public void problem2() {
		// 함수명: maxNumber, minNumber
		// 3개의 정수를 매개 변수로 받아서
		// 가장 큰 값과 가장 작은 값 main에서 return 출력

		int maxResult = maxNumber(4, 5, 2);
		int minResult = minNumber(10, 2, 9);

		System.out.println("최대값: " + maxResult);
		System.out.println("최소값: " + minResult);

		// 문자열을 비교하는 함수 생성
		// equal()
		// 매개 변수 str1, str2
		// return true, false
		String str1 = "hello";
		String str2 = "world";

		boolean strResult = equal(str1, str2);
		System.out.println("문자열 비교 결과: " + strResult);
	}

	public static void main(String[] args) {
		new MethodsEx02Problem2().problem2();
	}
}
