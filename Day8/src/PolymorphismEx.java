public class PolymorphismEx {
  public static void main(String[] args) {
    // 레퍼런스 변수
    Car c1 = new Car();

    // 레퍼런스 변수
    FireEngine f1 = new FireEngine();
    Ambulance a1 = new Ambulance();

    // 부모 클래스인 Car
    // 참조는 주소값을 가리킨다
    // 부모 클래스를 참조하고 있으면 부모가 물려 준 변수, 메소드만 접근할 수 있다.

    // 자식 클래스에 있는 내용을 접근하고 싶을 경우에는 오버라이딩
    Car c2 = f1;
    c2.drive();

    Car c3 = a1;
    c3.stop();

    // Object 클래스
    //   모든 클래스의 최상위 부모. 자동 상속이 이루어진다
    Object o1 = new Car();
    Object o2 = new FireEngine();
    Object o3 = new Ambulance();

    boolean res = o1 instanceof Car;
    System.out.println(res);

    res = c3 instanceof Ambulance;
    System.out.println(res);

    String str = "이서희";
    res = str instanceof String;
    System.out.println(res);

    res = str instanceof Object;
    System.out.println(res);
  }

  public void main1() {
    // ==문제==
    // 참조 변수의 개수
    // Ambulance 자기 자신의 주소값 저장. Car, Object 3개

    // instanceof 연산자
    // 참조 변수가 참조하는 인스턴스의 실제 타입 확인
    // 연관성이 없으면 false

    // 객체 변수 instanceof 클래스명

    // 다형성
    //   - 업캐스팅과 똑같은 내용
    //   - 하나의 참조 변수로 여러 타입의 객체를 참조할 수 있는 것!
    //   - 서로 상속 관계에 있어야지 가능
    //   - 형 변환
    //   - 부모는 자식을 참조할 수 있다
    //   - 자식은 부모를 참조할 수 없다. 참조할 수 있게 하는 것을 인터페이스라고 함
  }
}
