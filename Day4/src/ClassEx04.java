import java.util.ArrayList;

/*
 * 네이버 클래스
 * 
 * 고객들의 정보를 저장만 하는 클래스
 * 
 */

class Naver {
	// 필드 (정보)
	// 고객들의 겅보를 저장하는 타입 <>
	ArrayList<Account2> accList = new ArrayList<>();

}

class Account2 {
	String id;
	String pw;

	//public Account2() {} // 객체를 생성할 때 빈 객체로 저장

	// 생성자
	// 객체를 생성할 때 원하는 값으로 저장된다
	// 기본 생성자가 생기지 않는다. 빈 객체로 객체 생성 시 오류 발생
	public Account2(String _id, String _pw) {
		id = _id;
		pw = _pw;
	}
}

public class ClassEx04 {
	public static void main(String[] args) {
		// 네이버 회사 생성
		Naver com = new Naver();

		// 네이버에 회원가입
		// id: qwer  pw: love
		// Account2 acc2 = new Account2();
		Account2 acc1 = new Account2("qwer", "love");

		// acc1 -> 네이버 회의 고객정보 변수에 저장
		com.accList.add(acc1);

		System.out.println(com.accList.get(0).id);
	}
}
