package innerclass;

class Outer { // 외부 클래스
  private static int num = 0;

  public static class Nested1 { // 내부 클래스
    public void add(int n) {
      num += n;
    }
  }

  public static class Nested2 {
    public int get() {
      return num;
    }
  }
}


public class StaticInner2 {
  public static void main(String[] args) {
    // static
    Outer.Nested1 nst1 = new Outer.Nested1();
    nst1.add(5);

    Outer.Nested2 nst2 = new Outer.Nested2();
    int num = nst2.get();
    System.out.println(num);

    // 단 static은 static 제어자가 붙은 메소드, 변수, 클래스에서만
    // 객체 호출, 객체 수정 변경, 생성할 수 있다.
  }
}
