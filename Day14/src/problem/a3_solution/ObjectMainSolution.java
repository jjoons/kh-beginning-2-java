package problem.a3_solution;

public class ObjectMainSolution {
  public static void main(String[] args) {
    UserSolution a = new UserSolution("qwer", "qwer");

    // getClass()
    //   자신이 속한 클래스의 객체를 반환하는 메소드
    //   모든 정보를 담고 있는 클래스
    //   클래스 당 1개만 존재
    //   자바 파일 -> .class -> 객체를 생성할 때 생성(?)

    System.out.println(a.getClass());
    System.out.println(a.getClass().getName());

    // 자바 Reflection API
    //   자바에서 타입을 모르더라도 "getClass().다양한기능"으로 사용 가능
  }
}
