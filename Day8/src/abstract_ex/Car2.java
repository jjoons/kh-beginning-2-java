package abstract_ex;

abstract public class Car2 {
  String color;
  int door;

  abstract public void drive();

  abstract public void stop();

  abstract public void 와이퍼();

  // 비강제성. 오버라이딩을 해도 되고 안 해도 됨
  public void 썬루프() {}

  public void 블루투스() {}

  public void 엉따() {}
}

class FireEngine2 extends Car2 {
  void water() {
    System.out.println("와이퍼 작동");
  }

  @Override
  public void drive() {
    water();
  }

  @Override
  public void stop() {
    
  }

  @Override
  public void 와이퍼() {

  }
}

class Ambulance2 extends Car2 {
  public void siren() {
    System.out.println("환자 이송");
  }

  @Override
  public void drive() {

  }

  @Override
  public void stop() {
    System.out.println("부모 접근 가능");
  }

  @Override
  public void 와이퍼() {

  }
}
