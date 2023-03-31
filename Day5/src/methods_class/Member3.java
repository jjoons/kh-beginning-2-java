package methods_class;

class Objection2 {
	String ob;
	int cost;

	public Objection2(String destination, int cost) {
		this.ob = destination;
		this.cost = cost;
	}
}

public class Member3 {
	public static void main(String[] args) {
		// 수원, 광주, 대전

		Objection2 h1 = new Objection2("수원", 3000);
		Objection2 h2 = new Objection2("광주", 35000);
		Objection2 h3 = new Objection2("대전", 25000);

		// 배열
		//   나란하게 선언 (접근이 쉽다. 인덱스 번호로 접근)

		// 내가 만든 클래스로 여러 개 저장
		// 배열은 클래스명[개수] 기본타입[개수] 만큼 변수를 묶었다 (똑같은 자료형만 묶을 수 있음)
		Objection2[] list = new Objection2[3];

		// h1 변수의 주소값을 list 배열의 0번 방에 저장
		list[0] = h1;

		// h1으로 접근을 했을 때 수원으로 나와야 하며
		// list[0] 접근을 했을 때도 수원으로 나와야 함
		System.out.println(h1.ob);
		System.out.println(list[0].ob);
		System.out.println(h1.equals(list[0]));

		// h2 -> list[1] 저장해서 ob 출력
		// h3 -> list[2]

		list[1] = h2;

		System.out.println(h2.ob);
		System.out.println(list[1].ob);

		list[2] = h3;

		System.out.println(h3.ob);
		System.out.println(list[2].ob);
	}
}

