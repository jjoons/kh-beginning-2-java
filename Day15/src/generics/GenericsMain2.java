package generics;

// 인터페이스 추상 메소드들의 제네릭 타입 지정
// 인터페이스는 객체 생성이 안 됨
// 1회용 익명 클래스 (내부 클래스 중에)

interface ISample<T> {
  public void addElement(T t, int index);

  public T getElement(int index);
}


class Sample2<T> implements ISample<T> {
  private T[] array;

  public Sample2() {
    this.array = (T[]) new Object[10];
  }

  // T 타입으로 들어온 객체의 주소를 저장한다
  // index 변수의 숫자를 이용해서 방 번호에 저장한다
  @Override
  public void addElement(T t, int index) {
    array[index] = t;
  }

  @Override
  public T getElement(int index) {
    return array[index];

    // return으로 Main이든 내가 호출한 메소드든
    // 그걸 콘솔에 보여주려면 println()에 넣어야 함
    // 저장만 하려면 변수에 저장
    // 객체 주소 -> 참조 변수
  }
}


public class GenericsMain2 {
  public static void main(String[] args) {
    // 객체 생성
    Sample2<String> sa = new Sample2<>();
    sa.addElement("This is string", 5);
    String res = sa.getElement(5);
    System.out.println(res);
  }
}
