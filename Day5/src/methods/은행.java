package methods;

public class 은행 {
	public static String 은행원(String 어떤업무, String 신분증) {
		System.out.println("고객님의 정보 조회 중");
		System.out.println(어떤업무 + " 필요한 서류가 있습니다");

		return "필요한 서류를 안내한다";
	}

	public void ex1() {
		// 대출 업무
		// 은행원

		String 서류저장 = 은행원("대출", "신분증 제출");
		System.out.println("서류 준비 완료");

	}

	public static void main(String[] args) {

	}
}
