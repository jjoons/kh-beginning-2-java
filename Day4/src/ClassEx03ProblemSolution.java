class Member2 {
	// 정보
	String id, name, email, pw, pw_check;

	String gen, me, jo, age;

	public Member2(String id, String name, String email, String pw,
			String pw_check) {
		// 인스턴스 변수
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
	}

	public Member2(String id, String name, String email, String pw,
			String pw_check, String gen) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
		this.gen = gen;
	}

}

public class ClassEx03ProblemSolution {
	public static void main(String[] args) {

	}
}
