package methods_class;

public class MemberProblem {
	public static void trainPrint(Objection objection) {
		System.out.println("----- 예매 정보 -----");
		System.out.println("목적지: " + objection.getDestination());
		System.out.println("운임비: " + objection.getCost());
	}

	public static void main(String[] args) {
		// Objection 클래스(목적지 클래스) 생성
		// String 목적지, int 운임비

		// 대구 25000
		// 부산 40000

		// 두 개의 새로운 변수를 만들어서 함수에 출력
		// 함수명: trainPrint
		// 매개 변수로는 Objection 타입의 변수 저장
		// return void (없다)

		// 출력
		//   ----- 예매 정보 -----
		//   목적지: 대구
		//   운임비: 25000
		//
		// ...
		//
		//   ----- 예매 정보 -----
		//   목적지: 부산
		//   운임비: 40000
		Objection obj1 = new Objection();
		obj1.setDestination("대구");
		obj1.setCost(25000);
		trainPrint(obj1);

		Objection obj2 = new Objection();
		obj2.setDestination("부산");
		obj2.setCost(40000);
		trainPrint(obj2);
	}
}
