package inheritance_car;

public class MainSolution {
  public static void main(String[] args) {
    아반떼Solution a1 = new 아반떼Solution();

    System.out.println(a1.brandName);
    a1.color = "흰색";
    a1.maxSpeed = 200;
    a1.model = "아반떼";
    a1.ranked = "소형";

    그랜저Solution g1 = new 그랜저Solution();
    System.out.println(g1.brandName);

    g1.color = "";
    g1.model = "";
    g1.ranked = "";
    g1.maxSpeed = 260;

    // 부모 클래스에서 상속해 준 변수 메소드
    // 이미 자식 클래스 안에 만들어져 있다.
    // 자식은 부모 클래스 안에 있는 내용을
    // 언제든지 가져다가 쓸 수 있다.

  }
}
