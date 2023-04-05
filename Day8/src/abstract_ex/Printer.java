package abstract_ex;

// 프린터 기능 print를 꼭 구현해야 한다
// 강제성만 준다.
// 추상 메소드: 구현부가 없는 메소드 (비정상적 메소드)
// 추상 클래스: 추상 메소드가 하나라도 있으면 절대 정상적인 클래스가 될 수 없음
abstract public class Printer {
  // 기능 print
  abstract public void print();
}

class LGPrinter extends Printer {
  @Override
  public void print() {System.out.println("LG 프린터");}
}

class SamsungPrinter extends Printer {
  // 1. 오버라이딩
  @Override
  public void print() {System.out.println("삼성프린터");}

  // 2. 비정상적인 메소드를 가지고 있기 때문에 추상 클래스가 되어야 한다.
}
