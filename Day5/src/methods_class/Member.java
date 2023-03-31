package methods_class;

import java.util.Random;
import java.util.Scanner;

// 클래스를 이용해서 값을 넘겨주고 넘겨받고 하는 프로그램
class User {
	int id;
	int pw;
}

class Movie {
	String movieName; // 영화명
	String movieTime; // 상영시간
}

public class Member {
	// camelCase, PascalCase
	// 메소드 이름을 지을 때 두 단어 중 뒤에 오는 첫 글자는 대문자
	// 필수는 아니지만 암묵적으로 사용함
	public static void moviePrint(Movie movie) {
		System.out.println("영화 제목: " + movie.movieName);
		System.out.println("영화 시간: " + movie.movieTime);
	}

	public static void main(String[] args) {
		// 웅남이 98분
		Movie movie = new Movie();
		movie.movieName = "웅남이";
		movie.movieTime = "98분";

		Movie movie2 = new Movie();
		movie2.movieName = "존윅4";
		movie2.movieTime = "130분";
	}
}

class MemberClean1 {
	// 변수 int -> 매개 변수 int
	//     double -> 매개 변수 double
	// 클래스 클래스 타입으로 매개 변수를 만들어준다
	public static void info(User user) {
		System.out.println("--- KH User ---");
		System.out.println(user.id);
		System.out.println(user.pw);
	}

	public static void fn1(Random random) {

	}

	public static void fn2(Scanner scanner) {
		// scanner.next();
	}

	public static void main(String[] args) {
		// 자바가 만들어 준 API
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 내가 만든 클래스
		// User  1111  2222
		User user1 = new User(); // { id: 0, pw: 0 }
		user1.id = 1111;
		user1.pw = 2222;

		info(user1);
	}
}
