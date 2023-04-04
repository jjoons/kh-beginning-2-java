package static_ex;

class SoCar {
  // 운전자명
  static String name;
}

class User {
  String name;

  public User(String name) {
    this.name = name;
  }
}

/*
 * 레퍼런스 변수
 * 레퍼런스 변수란, 객체를 가리키는 변수다.
 * 기본형 변수는 값을 직접 저장하나, 레퍼런스 변수는 객체의 위치를 가리킨다.
 * 
 * static 키워드
 * static 키워드는 필드와 메소드에 적용될 수 있다.
 * 
 * 클래스 변수
 * 클래스 변수란, 클래스 영역에 존재한다.
 * 
 * 인스턴스 변수
 * 인스턴스 변수란, 객체 내부에 존재한다.
 * 클래스 메소드란, 주체 객체가 없이 수행되는 메소드다.
 * 인스턴스 메소드란, 주체 객체가 실행하는 메소드다.
 */

// static 키워드
// 메모리 static 영역에 만들수있다.
// 프로그램 시작시 생성되며  단 한개만 생성된다. 
// new 를 했을때 생성되지않는다. 
// 아래 그림으로 설명

public class Main {
  public static void main(String[] args) {
    // 접근, 실행을 할 때 클래스명.변수명
    System.out.println("현재 count 값: " + Student.count);

    // 학생들을 관리하는 배열 선언
    // 배열 동일한 자료형으로 여러개 선언
    // 내가 만든 자료형 배열 선언
    Student[] stuList = new Student[5];

    // 첫번째 학생
    stuList[0] = new Student(Student.count++, "이서희");
    stuList[1] = new Student(Student.count++, "강동원");
    stuList[2] = new Student(Student.count++, "이준기");
    stuList[3] = new Student(Student.count++, "류승룡");
    stuList[4] = new Student(Student.count++, "이보영");

    for (Student student : stuList) {
      System.out.println(student.id);
    }

    System.out.println(Student.count);

    // static 생성
    SoCar.name = "이서희";

    User u2 = new User("김자바");
    User u3 = new User("김이썬");
    User u4 = new User("이스타일");

    // static (공유)
    //   클래스의 필드와 메소드에 적용할 수 있다.
    //   static 필드 -> 클래스 변수
    //   static 메소드 -> 클래스 메소드

    // 클래스 변수 (하나만)
    //   공유를 위한 객체 외부 변수

    // 인스턴스 변수 (각각)
    //   객체 내부에 존재하는 변수
  }
}
