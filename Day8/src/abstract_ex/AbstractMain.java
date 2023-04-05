package abstract_ex;

abstract class AbstractEx {
  abstract int getNumber(int a);
}

class AbstractExA extends AbstractEx {
  @Override
  int getNumber(int a) {
    return a;
  }
}

public class AbstractMain {
  public static void main(String[] args) {
    // 비정상적인 클래스이기 때문에 객체 생성이 안된다.
    // Printer p = new Printer();

    // 추상화
    //   - 부모 클래스에서 상속받은 자식 클래스에
    //     특정 메소드를 강제적으로 만들도록 하는 것
    //   - 몸체가 구현되지 않은 메소드

    /*
     * 리턴타입 함수명 (매개변수타입) -> 선언부
     * 구현부가 없음
     */
  }
}
