import java.awt.Image;

// 주민등록증의 자료형을 만든다고 하면
// 
class 주민등록증 { // 틀을 만듦 new int[6]
	String 이름;
	String 주민번호;
	String 주소;
	String 발급기관;
	int 발급일자;
	Image 사진;

}

class 카드 {
	String 카드번호;
	String 카드명;
	String 소유자;
	int cvc;
	String 브랜드;

}

class Account {
	String email;
	String password;
	String verifyPassword;
	String name;
}

/*
 * # 클래스
 * 1. 정의(설계도)
 * 	1) class	: 키워드
 * 	2) Ex01		: 클래스명
 * 	3) {}		: 자료형의 영역(기본 자료형을 조합해 생성)
 * 2. 선언
 * 	1) 자료형	 변수명  = new 자료형();	
 *  2) Ex01  e    = new Ex01(); 
 */

public class ClassEx01 {

	public static void main(String[] args) {
		// 사용자 정의 자료형
		//   기본자료형 int, float, double, char

		// 프로그래머가 프로그램에 맞게 다양한 기존 자료형으로
		// 새로운 자료형을 만든다.
		//   - 타입이 다른 자료형을 묶는다.

		// 배열은 동일한 자료형(Data type) 여러개를 선언할 수 있음
		// 클래스는 다른 자료형으로 여러개를 선언

		// 객체
		//   - 클래스를 통해 만들어진 프로그램의 구성 요소

		// 클래스 멤버
		//   - 필드 (정보/상태)
		//   - 메소드 (기능/동작)

		// 객체 지향 프로그래밍
		//   - 조립식 프로그래밍
		// ex) 자전거 (프로그램) = 몸체(객체) + 바퀴 + 핸들

		// 조립식 프로그램 장점
		//   - 재활용성이 높다 (재사용)
		//   - 확장성
		//   - 관리가 쉽다

	}

}
