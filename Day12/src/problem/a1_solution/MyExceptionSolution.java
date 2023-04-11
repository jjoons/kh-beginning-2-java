package problem.a1_solution;

// 예외의 부모 클래스인 Exception을 상속받는다

public class MyExceptionSolution extends Exception {
  String msg;

  public MyExceptionSolution(String msg) {
    //    super(msg); // 부모 클래스가 객체를 생성할 때
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "예외 발생: " + this.msg;
  }
}
