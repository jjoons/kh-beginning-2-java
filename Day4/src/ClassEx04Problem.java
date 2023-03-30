import java.util.ArrayList;
import java.util.Scanner;

// 영화 예매
class CGV {
	// 고객들의 정보를 저장하는 ArrayList 선언
	// userList
	// <> 내가 만든 고객 클래스 타입
	ArrayList<User> accList = new ArrayList<>();

	// User 정보는 본인 정보로
	// 영화명: 웅남이, 시간 98분, 5관, 인원수 2명
	// 데이터 저장

	// 각각의 객체들을 만들 때 생성자 이용

	public boolean addUser(User user) {
		return this.accList.add(user);
	}
}

// 고객 정보
class User {
	String id;
	String pw;
	String phone;
	String email;

	// 예매 정보를 저장하는 변수
	Reservation res = new Reservation();

	public User(String id, String pw, String phone, String email) {
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}

	public void login(String id, String password) {
		if (this.id != id || this.pw != password) {
			System.out.println("아이디나 비밀번호가 틀립니다");
		}

	}
}

// 예매 정보
class Reservation {
	String movieName; // 영화 이름
	String movieTime; // 영화 상영시간
	int numberPeople; // 인원수
	String movieRoom; // 몇 관인지 저장

	public Reservation() {}

	public Reservation(String movieName, String movieTime, int numberPeople,
			String movieRoom) {
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.numberPeople = numberPeople;
		this.movieRoom = movieRoom;
	}

}

public class ClassEx04Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User user = null;

		for (;;) {
			System.out.println("--- CGV ---");
			System.out.println("1. 영화예매");
			System.out.println("2. 조회");
			System.out.println("3. 삭제");
			if (user == null)
				System.out.println("4. 로그아웃");
			System.out.println("0. 종료");

			int sel = sc.nextInt();

			switch (sel) {
				/* 예매 정보, 고객 정보 두 가지를 입력받아
				 * 객체 생성 후 CGV 리스트에 저장
				 */
				case 1:
					if (user instanceof User) { // 로그인되었을 때
						// CGV
					} else { // 로그인되지 않았을 때
						System.out.println("ID 입력: ");
						String inputId = sc.next();

						System.out.println("비밀번호 입력: ");
						String inputPw = sc.next();

					}

					System.out.println();
					String a;

					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					System.out.println("로그아웃합니다");
					user = null;
					break;

				case 0:
					return;

				default:
					System.out.println("잘못된 숫자를 입력했습니다");
					break;
			}
		}
	}
}
