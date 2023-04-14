import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class StringExC {
	public String[] arr = { "IMF", "제주도", "자바도시", "한글나라", "컴퓨터", "java", "python",
			"초롱초롱", "군고구마", "바람", "스크립터", "모카" };

	public void ex1() {
		String[] arr = this.arr;

		// 문자 하나하나씩 비교함

		// 배열 정렬
		Arrays.sort(arr);

		// toString()
		System.out.println(Arrays.toString(arr));

		// 기준이_되는_변수값.compareTo(비교할_값)

		// 숫자일 때 (기본자료형 X Integer)

		/*
		 * 비교했을 때 같으면 0
		 * 다르면 기준이 되는 값 > 비교하는 값  1 (양수)
		 *        기준이 되는 값 < 비교하는 값 -1 (음수)
		 */

		// 문자일 때
		// 같으면 0
		// 다르면 비교하는 값이 작으면 음수 (-1)
		// 다르면 비교하는 값이 크면 양수 (1)

		// 다르면 문자의 개수만큼 리턴

		String str1 = "가";
		String str2 = "나";
		String str3 = "가";

		int res1 = str1.compareTo(str2); // 음수
		System.out.println(res1);

		int res2 = str2.compareTo(str1); // 양수
		System.out.println(res2);

		int res3 = str1.compareTo(str3); // 0
		System.out.println(res3);
	}

	public void ex2() {
		String str = "hello";

		System.err.println(str);

		// 문자 한개 추출 charAt(방번호)
		char ch = str.charAt(0);
		System.out.println(ch);

		ch = str.charAt(2);
		System.out.println(ch);

		ch = str.charAt(4);
		System.out.println(ch);

		str = "python java html jsp spring";

		// 문자 여러 개 추출 (슬라이싱/slice)
		// substring(시작, 끝)
		// 끝나는 번호는 데이터 미포함
		String extractLetter = str.substring(7, 11);
		System.out.println(extractLetter);

		str = "python,java,html,jsp,spring";
		// 구분자를 이용해서 잘라내기
		// split("구분자")
		// 구분자를 이용해 배열 형태로 저장되서 온다.
		String[] strs = str.split(",");

		for (String s : strs) {
			System.out.println(s);
		}

		// 길이 확인 .length
		int size = str.length();
		System.out.println(size);
	}

	public void problem1() {
		Random rand = new Random();

		String[] arr = { "IMF", "제주도", "자바도시", "한글나라", "컴퓨터", "java", "python",
				"초롱초롱", "군고구마", "바람", "스크립터", "모카" };

		int result = rand.nextInt(arr.length);
		String selected = arr[result];
		System.out.println(selected);
	}

	public void problem2() {
		String jumin = "890101-2123456";

		// 문제  성별 출력
		// 정답  여성

		String[] numbers = jumin.split("-");
		String s = numbers[1].substring(0, 1);

		if (s == "2" || s == "4") {
			System.out.println("여성");
		}

		// 이메일을 입력받는다.
		//   example@example.com
		//   9자 이상 "가입이 가능하다"
		//   9자 미만 "가입이 불가능합니다"
		// 구분자를 이용해서 아이디와 도메인 분리
		// .com .net 으로 끝나면
		// "정상적으로 가입이 가능하다"
		// "정상적으로 가입할 수 없습니다"

		Scanner sc = new Scanner(System.in);

		System.out.println("이메일 주소 입력: ");
		String inputEmail = sc.next();

		if (inputEmail.length() >= 9) {
			String[] emailDomain = inputEmail.split("@");
			String[] domain = emailDomain[1].split(".");

			String topDomain = domain[1];

			if (topDomain == "com" || topDomain == "net") {
				System.out.println();
			}

		} else {
			System.out.println("가입이 불가능합니다");
		}

	}

	public void problem2Solution() {
		String jumin = "890101-2123456";

		// 문제  성별 출력
		// 정답  여성

		char ch3 = jumin.charAt(7);

		if (ch3 == '2' || ch3 == '4') {
			System.out.println("여성");
		} else if (ch3 == '1' || ch3 == '3') {
			System.out.println("남성");
		}

		int num10 = 10;
		// 숫자 -> 문자
		String z = num10 + "";
		System.out.println(z);

		// 숫자 -> 문자 공식
		String str11 = String.valueOf(num10);

		//문자 여러 개든 문자 하나든 문자
		// 문자 -> 숫자 (정수, 실수)
		char ch5 = 'a';
		System.out.println((int) ch5);

		String ch6 = "10";
		int num = Integer.parseInt(ch6);

		char ch2 = jumin.charAt(7);
		if ((ch2 % 2) == 1) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}
	}
}

public class StringEx {

	public static void main(String[] args) {
		new StringExC().problem2();
	}

}
