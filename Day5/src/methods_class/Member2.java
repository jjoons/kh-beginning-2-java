package methods_class;

import java.util.Scanner;

public class Member2 {
	public static Objection objectInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("목적지 입력: ");
		String ob = scanner.next();

		System.out.println("운임비 입력: ");
		int pay = scanner.nextInt();

		Objection o = new Objection();
		// 클래스 변수 안 destination 변수에 내가 입력받은 destination 변수 저장
		o.setDestination(ob);
		o.setCost(pay);
		return o;
	}

	public static void main(String[] args) {
		// 함수를 실행하면 목적지 객체가 생성되어 온다
		Objection o1 = objectInput();
		System.out.println(o1);

		// 열차 정보를 출력하는 함수
		MemberProblem.trainPrint(o1);
	}
}
