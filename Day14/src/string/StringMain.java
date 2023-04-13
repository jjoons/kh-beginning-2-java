package string;

public class StringMain {
  public static void main(String[] args) {
    // String 클래스 (데이터 char[]) + 메소드 (문자열 관련)
    //   - 문자 배열로 이루어진 클래스
    //   - 참조형 변수로 분류
    //   - 스택 영역이 아닌 객체와 Heap(힙)에서 문자열 데이터가 생성되고 다뤄진다

    int num = 35;
    String name = "홍길동";

    // String 불변 (Immutable)
    //   기본으로 객체의 값을 변경하지 못 하게 해놓았다

    String name2 = "홍길동";

    // hashcode() 메소드를 이용해 실제 변수가 가지고 있는 주소값을 찍어보면 알 수 있다
    // 객체 메모리 번지를 이용해서 해시코드(주소)를 만들어서 리턴하는 메소드
    // 상수만 저장하는 영역에 문자 상수가 올라가면 똑같은 내용은 저장되지 않는다.
    // 그래서 가지고 있는 문자를 공유해서 주소값을 준다.

    // 문자열 리터럴(상수)은 프로그램 실행 시 자동으로 생성된다
    // constant pool에 저장됨

    // 멀티 스레드의 동기화 문제를 발생시키지 않기 위해서
    String a = "123";

    System.out.println(name.hashCode());
    System.out.println(name2.hashCode());

    String str = "hello";
    System.out.println(str.hashCode());

    str += "World";
    System.out.println(str.hashCode());
    System.out.println(str);

    // 문자 리터널(Literal) (상수: 고정된 값)
    final int num2 = 1;

    // JVM 가상 머신 메모리 내부에서는 큰 차이가 난다
    String str7 = "";
    String str8 = "";
    String str9 = "";

    // String 클래스
    //   객체를 new로 생성해서 새로운 주소값을 할당한다
    String str3 = new String("");
    String str4 = new String("");
    String str5 = new String("");
  }
}
