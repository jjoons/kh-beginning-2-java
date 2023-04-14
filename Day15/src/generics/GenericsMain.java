package generics;

class Sample<T> {
  public void method() {
    //    T t = new T(); // new 연산자 뒤에 제네릭 타입 파라미터가 올 수 없다
  }

  // static 멤버는 클래스가 동일하게 공유하는 변수로서
  // 제네릭 객체가 생성되기 전에 이미 자료 타입이 정해져 있어야한다
  // public static T addAge(int n) {}
}


public class GenericsMain {
  public static void main(String[] args) {
    // 제네릭으로 배열 선언
    //   기본적으로 제네릭 클래스 자체를 배열로 만들 수 없다
    // Sample<Integer>[] arr1 = new Sample<>[10];

    // 제네릭 배열을 선언하고 저장하고 싶다
    Sample<Integer>[] list = new Sample[10];

    list[0] = new Sample<Integer>();
    list[1] = new Sample<>();

    // 제네릭은 타입을 지정한 것임
    // 그 외 타입이 들어오면 당연히 에러가 발생함
    //    list[2] = new Sample<String>();
  }
}
