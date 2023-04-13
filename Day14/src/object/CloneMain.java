package object;

import problem.a3_solution.UserSolution;

public class CloneMain {
  public static void main(String[] args) {
    // clone(): 객체 복사
    //   객체를 복사해서 새로운 인스턴스(객체) 생성
    //   얇은 복사 / 깊은 복사

    // 일반적인 변수일 땐 값 그대로 복사할 수 있다
    // 참조 변수는 직접 값을 복사하는 것이 아니라 주소를 복사한다
    //   (같은 객체를 참조한다)

    UserSolution user1 = new UserSolution("love", "love");

    // 오버라이딩해서 접근 제어자를 변경하니
    // 누구나 접근할 수 있는 권한이 생겼다
    // Object로 반환
    // User 접근 권한이 생기지 않는다. 그렇기 때문에 형 변환을 해야 한다

    // clone()
    //   접근 제어자 변경하기
    //   인터페이스 Cloneable 구현하기
    //     구현하지 않으면 예외가 발생한다
    //   깊은 복사
    try {
      UserSolution copy = (UserSolution) user1.clone();

      System.out.println(copy.hashCode());
      System.out.println(user1.hashCode());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    Object p;
  }
}
