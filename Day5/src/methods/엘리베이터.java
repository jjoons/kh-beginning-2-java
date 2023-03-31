package methods;

public class 엘리베이터 {
	// 객체를 1층으로 고정된 값이 저장된다
	static int 현재층 = 1; // 엘리베이터가 기억

//	public 엘리베이터(int 시작하는층) {
//		this.현재층 = 시작하는층;
//	}

	public static void 올라간다(boolean 버튼, int 가고싶은층) {
		// 1층부터 내가 가고싶은 층 증가, 현재 층 다시 저장
		while (현재층 <= 가고싶은층) {
			System.out.println(현재층);
			현재층++;
		}
	}

	public static void 내려간다(boolean 버튼, int 가고싶은층) {
		// 현재 츨에서 가고싶은 층 내여하는 명령문
		// 7층에서 1층으로
		while (현재층 >= 가고싶은층) {
			System.out.println(현재층);
			현재층--;
		}
	}

	public void ex1() {
		// 엘리베이터 이용
		엘리베이터 Elevator = new 엘리베이터();

		// 1층에서 4층으로 올라가고 싶다
		올라간다(true, 4);
		내려간다(true, 1);

	}

	public static void main(String[] args) {
		new 엘리베이터().ex1();
	}
}
