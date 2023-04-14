package generics_extends;

import java.util.ArrayList;

class Unit {}


class Stu extends Unit implements Readable, Closeable1 {
  String name;
}


class Stu2 implements Closeable1 {
  String name;
}


// 타입 제한을 할 때 클래스랑 인터페이스가 같이 있으면 클래스명부터 작성
//   예) 클래스1 & 인터페이스1 & 인터페이스2 && ...
class School<T extends Unit & Readable & Closeable1> {}


// 계산기는 정수, 실수만 들어온다
// T 제네릭 타입을 정하고 제한을 주지 않으면 이상한 객체 타입으로 선언된다


class Calc<T extends Number> {
  public void add(T a, T b) {}

  public void min(T a, T b) {}

  public void mul(T a, T b) {}

  public void div(T a, T b) {}
}

// 와일드카드
//class Calc2<T super Number> {
//  public void add(T a, T b) {}
//
//  public void min(T a, T b) {}
//
//  public void mul(T a, T b) {}
//
//  public void div(T a, T b) {}
//}


public class GenericsExtendsMain {
  public static void main(String[] args) {
    // 타입 한정 키워드 extends
    // <> extends가 쓰이면 관련있는 타입들만 객체 타입으로 지정할 수 있다
    // Number 클래스를 상속받은 타입들은 객체 타입 지정이 가능하다

    Calc<Number> cal1 = new Calc<>();
    Calc<Integer> cal2 = new Calc<>();
    Calc<Double> cal3 = new Calc<>();
    // Calc<Stu> cal4 = new Calc<>(); // 에러
    // Calc<Object> cal5 = new Calc<>(); // 에러

    ArrayList<Stu> list = new ArrayList<>();
    list.add(new Stu());

    // Unit 클래스와 Readable 인터페이스를 상속받지 않아서 오류 발생
    // list.add(new Stu2());
  }
}
