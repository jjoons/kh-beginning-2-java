package innerclass;

class Student {
  String name;
  int math, eng, kor;

  public Student(String name, int math, int eng, int kor) {
    this.name = name;
    this.math = math;
    this.eng = eng;
    this.kor = kor;
  }

  public void score() {
    int total = 3;

    class Avg {
      int sum = math + eng + kor;

      public void grade() {
        // 메소드 안에 클래스 함수에서 메소드 지역 변수의 값 변경은 불가능 (상수 취급)
        // total = 4;
        System.out.println(sum / total);
      }
    }

    Avg a1 = new Avg();
    a1.grade();
  }
}


public class LocalClassMain {
  public static void main(String[] args) {
    Student s1 = new Student("이준성", 60, 70, 80);
    s1.score();

    // 로컬 클래스
    //   - 특정 메소드 내에 내부 클래스 선언
    //   - 해당 메소드가 호출 시 생성, 수행 종료 시 소멸 (지역 변수)
    //   - 내부 클래스가 접근할 수 있는 지역 변수 final 변수만 가능하다
  }
}
