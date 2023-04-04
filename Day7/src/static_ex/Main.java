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
