class Pokemon {
	// 포켓몬 정보
	String name; // 이름
	double weight; // 몸무게
	String charAct; // 특징

	// 생성자
	// 특징
	//   1. 리턴 타입이 없는 메소드
	//   2. 이름이 클래스명과 같다
	//   3. 

	// 기본 생성자
	public Pokemon() {}

	public Pokemon(String _name) {
		name = _name;
	}

	// 생성자
	public Pokemon(String _name, double _weight, String _charAct) {
		name = _name;
		weight = _weight;
		charAct = _charAct;
	}

	// 싸우는 기능
	void attack() {
		System.out.println(name + "의 펀치~!!!");
	}
}

public class ClassEx03 {

	public static void main(String[] args) {
		// 푸린
		Pokemon purin = new Pokemon(); // 객체 생성 후 purin이라는 변수에 연결
		// {
		//   name: null,
		//   weight: 0.0,
		//   charAct: null
		// }
		purin.charAct = "헤롱헤롱"; // { charAct: "헤롱헤롱", ... }
		purin.weight = 5.5;
		purin.name = "푸린";

		purin.attack(); // .attack() 기능 실행

		// 객체 생성과 동시에 초기화
		/*
		 * {
		 *   name: "피카츄",
		 *   weight: 3.5,
		 *   charAct: "백만볼트"
		 * }
		 */

		int num; // 기본생성자 Pokemon()
		num = 10;

		Pokemon pikachu = new Pokemon("피카츄", 3.5, "백만볼트");
		pikachu.attack();

		// new
		// 1. 메모리 공간 heap(힙 영역)
		// 2. 생성자 호출(시작)
		// 3. 괄호 안에 값이 있으면 원하는 값으로 초기화 진행
		//    괄호 안에 값이 없으면 기본값으로 진행
		// 4. 만들어진 객체가 어디있는지 주소값을 부여하고
		// 5. 그 주소값을 변수에 저장한다.

		// 전설의 포켓몬 (비밀스러움. 정보가 하나 밖에 없다)

		// 생성자
		//   - 객체를 만드는 특별한 메소드

		// 역할
		//   - 객체 생성 (객체를 만드는 것)
		//   - 객체의 필드(변수) 값을 설정하는 것

	}

}
