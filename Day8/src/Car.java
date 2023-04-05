// 상속은 물려주기만 한다.
// 강제성이 없다

public class Car { // 세상에 존재하는 자동차
  String color;
  int door;

  public void drive() {
    System.out.println("운전하는 기능");
  }

  public void stop() {
    System.out.println("멈추는 기능");
  }
}

class FireEngine extends Car {
  // default 제어자
  //   생략이 가능하다.
  //   같은 패키지에서만 접근할 수 있다. (값 변경, 객체 생성, 메소드 호출 등)

  void water() {
    System.out.println("와이퍼 작동");
  }

  @Override
  public void drive() {
    water();
  }
}

class Ambulance extends Car {
  public void siren() {
    System.out.println("환자 이송");
  }

  @Override
  public void stop() {
    System.out.println("부모 접근 가능");
  }
}
