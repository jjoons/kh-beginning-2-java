package generics;

public class GenericsMain4 {
  public static void main(String[] args) {
    // public static 객체 생성 클래스명으로 접근
    FruitBox.addBoxStatic(1, 2);

    // 매개 변수의 데이터형을 보고 타입 추론

    FruitBox2<Integer, Long> box1 = new FruitBox2<>();

    // 인스턴스화에 지정된 타입 파라미터
    box1.printBox(1, 1);

    // 제네릭 메소드에서 다른 타입으로 정의
    box1.<String, Double>printBox("hello", 5.55);
    box1.printBox("hello", 5.55); // 상위 버전에서는 생략이 가능하다
  }
}
