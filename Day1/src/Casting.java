
public class Casting {

	public static void main(String[] args) {
		// 형변환 (Casting)
		// 강제적으로 형변환 (명시적)
		// 프로그래머가 강제적으로 변환을 함.
		System.out.println((double) 1);
		System.out.println((int) 1.254);

		// 자동적으로 형변환 (묵시적)
		System.out.println(1 + 1.1);

		// 변수: 값 저장
		int a = (int) 1.1;
		double b = 10;

		// 정수 + 정수 = 정수
		// 실수 + 실수 = 실수
		// 정수 + 실수 = 실수

		// 소수점 자리 표현
		// %f 소수점 6자리까지 표현함. %.4f 같은 경우는 4자리까지 표현함
		// %lf 소수점 15자리까지 표현
		// printf("서식", )
		System.out.printf("%f \n", 1.123456);
		System.out.printf("%.5f \n", 1.123456);
		System.out.printf("%.4f \n", 1.123456);
		System.out.printf("%.3f \n", 1.123456);
		System.out.printf("%.2f \n", 1.123456);
		System.out.printf("%.1f \n", 1.123456);

		/*
		 * %d 정수 표현 (int, Integer) %c 한문자 (char) %s 문자열 (String)
		 */

	}

}
