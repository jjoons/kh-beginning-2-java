package final_ex;

class Company {
//  static {
//    NAME = "as";
//  }

  static final String NAME = "KH회사";

  // static은 프로그램 시작 전에 이미 메모리에 생성이 되기 때문에
  // 상수(final)이라고 해도 값을 초기화하지 못 한다.

  // 인스턴스 변수
  // String name = "kh회사";

  public final void print() {
    // System.out.println(this.name);
  }

  public void setInfo(final int temp) {
    // 매개 변수 값 변경 불가
    // temp = 10;
  }
}

class Company_SBS extends Company {
  // 상속은 가능하지만 오버라이딩 불가능
  // public void print() {}
}

// 클래스에 final을 붙이면 상속이 불가능하다
// class Company_SBS extends Company {}

public class Main {
  public static void main(String[] args) {
    Company_SBS cs = new Company_SBS();
    cs.print();

    // final 객체
    final Company c = new Company();
    // c.name = "";

    // c = new Company();
    // 객체를 한번 생성해서 할당했으면 재성성 불가능
    // 객체 안에 있는 변수는 값을 변경할 수 있다.

    // static final 의 경우에는 값을 변경할 수 없음.
    // c.name = "m회사"
  }

  public void main1() {
    final int num = 10;
    // num = 1000;

    Tank a = new Tank(10);
    System.out.println(a);

    // 상수 (final)
    //   - 변수처럼 값을 저장하지만 한 번 값을 저장하면 변경할 수 없다.
    //   - 변수 생성과 동시에 초기화까지 진행해야 한다.
    //   - 상속을 했을 때 오버라이딩을 불가능하게 한다.
    //   - final class로 설정하면 클래스 상속이 불가능하다.

    // 클래스 안에 final 상수 값을 줄 때
    // 객체를 생성할 때마다 특정한 값으로 초기화
  }
}

class Person {
  final int hp = 100;
  final int age = 0;
}

class Tank {
  final int hp;

  public Tank(int hp) {
    this.hp = hp;
  }

  @Override
  public String toString() {
    return "탱크: " + this.hp;
  }
}
