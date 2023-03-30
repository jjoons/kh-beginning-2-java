import java.util.ArrayList;

// 클래스명의 첫글자는 대문자로 시작해야 함
class Cat {
	// 필드(정보, 상태) 영역
	String name; // 이름
	String breed; // 품종
	double weight; // 몸무게

	// 메소드(동작, 기능) 영역
	void claw() {
		System.out.println("할퀴기");
	}

	void meow() {
		System.out.println("야옹");
	}

}

// 학생
// 필드 이름, 학번, 배열
class Student2 {
	// 학생의 정보 영역 (필드)
	String name;
	int studentID;
	// int[] scores = new int[3];
	ArrayList<Integer> scores = new ArrayList<>();

	// 학생의 동작 영역
	void info() {
		System.out.println(name);
		System.out.println(studentID);

		for (Integer score : scores) {
			System.out.println(score);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

/*
 * 객체 지향 프로그래밍
OOP라고 한다. 프로그램을 객체의 조립으로 만드는 방식이다.
OOP는 프로그램의 관리/재사용/확장에 좋다.

클래스 vs 객체
클래스는 객체를 만들기 위한 설계도이다.
객체의 또 다른 표현으로는 인스턴스(instance)가 있다.
때문에 클래스로 객체를 만드는 것을 “인스턴스화”라고 한다.

클래스 설계 및 구현
클래스는 필드(상태)와 메소드(동작)로 구성된다.
클래스를 도식화한 것을 “클래스 다이어그램”이라 한다.
클래스 다이어그램 보고 코드를 작성할 줄 알아야 한다.
 */

public class ClassEx02 {
	public void ex1() {
		// 프로젝트 폴더 안에 여러개의 자바 파일이 존재할 때
		// 클래스명은 중복되지 않음

		// 객체 생성
		//   생성 시 자동으로 초기화
		//   String: null, int: 0, double: 0.0, boolean: false
		Cat cat = new Cat();

		cat.name = "나비";
		cat.weight = 2.5;
		cat.breed = "먼치킨";

		System.out.println(cat.name);
		System.out.println(cat.weight);
	}

	public void ex2() {
		// 학생 객체 생성
		Student2 student1 = new Student2();
		student1.name = "이서희";
		student1.scores.add(10);

		// 이서희 학번: 1001 점수들: [10, 20, 30]
		student1.info(); // 서희 변수 안에 들어가서 함수(기능) 실행
		//		System.out.println(student1.name + " 학번: " + student1.studentID + " 점수들: "
		//				+ Arrays.toString(student1.scores));

		Student2 student2 = new Student2();
		student2.scores.add(25);

		student2.info();
	}

	public static void main(String[] args) {
		ClassEx02 c = new ClassEx02();
		c.ex2();
	}
}
