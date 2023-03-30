import java.util.Scanner;

/*
 * 회원가입 member 클래스
 *   꼭 받아야하는 데이터
 *   id, name, email, password, passwordCheck
 *   
 * 선택 사항 (입력하면 입력한 값으로 저장)
 *   성별  m/f
 *   취미
 *   직업
 *   결혼 여부  기혼: true, 미혼: false
 *   
 * 클래스 생성자 이용해서 객체 생성
 * 본인 데이터 저장
 */

class Member {
	// 필수 사항
	String id;
	String name;
	String email;
	String password;
	String passwordCheck;

	// 선택 사항
	String gender; // 성별
	String hobby; // 취미
	String job; // 직업
	boolean isMerried; // 결혼 여부

	public Member(String id, String name, String email, String password,
			String passwordCheck) throws Exception {
		this.id = id;
		this.name = name;
		this.email = email;

		this.setPassword(password, passwordCheck);
	}

	public void setPassword(String password, String passwordCheck)
			throws Exception {
		if (password != passwordCheck) {
			throw new Exception("비밀번호가 일치하지 않습니다");
		}

		this.password = password;
	}

	public void setGender(String gender) throws Exception {
		if (gender != "m" || gender != "f") {
			throw new Exception("성별은 m, f만 입력할 수 있습니다");
		}

		this.gender = gender;
	}

}

public class ClassEx03Problem {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Member js = new Member("leejs", "이준성", "jjoons@jjoons.com", "asdf", "asdf");

		try {
			js.setGender("m");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("성별이 입력되지 않았습니다");

			while (true) {
				System.out.println("성별 입력: ");
				String inputValue = sc.next();
				js.setGender(inputValue);
				break;
			}
		}

		// 선택 사항
		js.hobby = "유튭 시청";
		js.job = "무직";
		js.isMerried = false;
	}
}
