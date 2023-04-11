package innerclass;

interface A {
  void show();
}


public class AnonymousMain2 {
  public static void main(String[] args) {
    // 내부 클래스 익명 클래스
    //   - 클래스를 정의함과 동시에 객체를 생성할 때 만들어지는 클래스
    //   - 1회용 클래스
    // 추상 클래스, 인터페이스 객체 생성 X
    // 이벤트

    A a1 = new A() {
      @Override
      public void show() {
        System.out.println("딱 한 번 실행하는 메소드");
      }
    };

    a1.show();

    Runnable r = () -> System.out.println();
    r.run();
  }
}
