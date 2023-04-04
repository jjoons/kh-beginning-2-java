package override;

public class OverrideEx {
  public static void main(String[] args) {
    // 마법사
    Wizard w1 = new Wizard();
    w1.fireball();

    // 전직한 마법사
    GreatWizard g1 = new GreatWizard();
    g1.fireball();

    // 동물
    Animal a1 = new Animal();
    a1.cry();

    Cat c1 = new Cat();
    c1.cry();

    Dog d1 = new Dog();
    d1.cry();

    Point p2 = new Point();
    p2.info();
    System.out.println(p2);

    // toString()
    //   특별한 메소드
    //   함수를 호출하지 않아도 System.out.println()
    //   호출하면 자동적으로 toString() 이 호출되도록 약속되어있다.

    // 메소드 오버라이딩
    //   - 부모 클래스의 메소드를 자식 클래스가 재정의
    //   - 부모 클래스 메소드 이름을 자식 클래스가 똑같이 만들어서 사용하는 것!

    // 오버라이딩
    //   - 함수 이름이 똑같아야 됨
    //   - 매개 변수의 개수도 똑같아야 한다.
    //   - 리턴 타입도 똑같아야 한다.

    // 메소드 오버로딩
    //   - 함수 이름 여러개 사용하는 기능!
  }
}
