package generice;

class Calc<T> { // 계산기를 만드는 클래스
  // 두 수를 입력해서 계산하는 계산기
  T x;
  T y;
}


public class GenericMain {
  void main2() {
    // 박스 생성 (사과만 담는 박스)
    //   new 생성자로 메모리에다가 생성하겠다
    //   박스라는 클래스를 이용해서 Apple 타입만 저장하겠다
    Box appleBox = new Box<Apple>();
    appleBox.obj = new Apple[30];

    // 사과 박스에 신발을 저장한다
    // appleBox.obj[0] = new Shoes(); // 왠지 모르겠지만 이클립스에서 오류를 뿜어내지 않는다.
  }

  public static void main(String[] args) {
    // 제네릭 <>
    //   - <> 꺽쇠 안에 타입명을 기재한다
    //   - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
    //   - 객체 자료형(타입)을 지정하여 지정된 타입만 객체를 저장하는 기능
    //   - 클래시 정의 시 클래스명<타입>
    //   - 기본 자료형을 받지 않는다. 객체 타입으로 생성됨

    // 컵 하나 생성
    Cup c1 = new Cup();

    // 컵에 첫번째 담을 음료는 커피
    c1.obj = new Coffee();

    // 컵에 물을 담는다
    c1.obj = new Water();

    // 컵에 우유를 담는다
    c1.obj = new Milk();

    // 위의 내용이 다형성

    // 컵인데 너는 무조건 커피만 담아라
    // Coffee 클래스를 상속받거나 관련이 있는 클래스들은 객체를 생성할 수 있다
    // instanceof로 타입 검사를 할 필요가 없다
    // 인터페이스 타입도 지정할 수 있다
    Cup<Coffee> cup1 = new Cup<Coffee>();

    // 컵에 내용물을 저장한다
    cup1.obj = new Coffee();
    cup1.obj = new Americano();
    cup1.obj = new CafeLatte();
    cup1.obj = new CafeMocha();
    //     cup1.obj = new Water();

    // 매개 변수의 타입
    //   E: 원소 (Element)
    //   K: Key
    //   N: 숫자 (Number)
    //   T: 타입 (Type)
    //   V: 값 (Value)

    // 타입 매개변수 (타입 파라미터)
    //   - 제네릭을 이용한 클래스나 메소드를 설계할 때 사용한다

    // 제네릭이 있으면 타입을 검사하는 과정을 생략할 수 있다
    // 객체들의 다형성을 할 때 강제 형 변환을 한다
    // 오류를 줄일 수 있고 클래스의 개수도 줄일 수 있다

    // 물을 담아먹는다
    //    cup1.obj = new Water();

    // 무조건 정수 타입의 데이터만 저장할 수 있다
    //    Calc<Integer> calc1 = new Calc<>();

    // 무조건 더블 타입의 데이터만 저장할 수 있다
    //    Calc<Double> calc2 = new Calc<>();

  }
}

