package a;

// 클래스의 접근 제어자가 기본값으로 설정됨
//   default -> 같은 폴더에서만 객체 생성 가능하며 다른 폴더에서는 객체 생성 불가능

class A_Default {}

class B extends Main {}

public class Main {
  public int a;
  private int b;

  // Default. 생략할 수 있으며 같은 패키지(폴더) 내에서만 접근 가능
  int c;

  // 접근성이 private함.
  // 접근 조건은 부모 클래스에서 상속받아 객체를 생성하면 접근할 수 있다. (자식 클래스에서 접근 가능)
  protected int d;

  // 접근 제어자
  //   기본값(default): 같은 폴더(패키지)에서만 접근이 가능하다. 접근 제어자를 입력할 필요가 없음.
  public static void main(String[] args) {}
}
