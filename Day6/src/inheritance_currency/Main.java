package inheritance_currency;

public class Main {
  int x;
  int y;

  @Override
  public String toString() {
    return "x: " + this.x + ", y: " + this.y;
  }


  public static void main(String[] args) {
    //    Main m = new Main();
    //    System.out.println(m);

    KRW krw = new KRW(1500.00, "원");
    System.out.println(krw);

    /*
     * Object 클래스
     *   - 자바는 어떤 클래스던지 Object를 자동적으로 상속함
     *   - 모든 클래스의 부모 클래스
     *   
     * toString()
     *   - 객체가 가지고 있는 정보나 값들을 문자열로 리턴하는 메소드
     *   - 기본은 "클래스이름@주소값"
     */
  }
}
