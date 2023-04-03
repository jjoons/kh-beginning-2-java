package inheritance;

class A {
  int num;

  // 생성자 부모 클래스의 변수 초기화
  public A(int num) {
    this.num = num;
    System.out.println("A클");
  }
}


// 부모 클래스에서 생성자가 생기면
// 부모의 변수를 초기화해서 자식 클래스에 줘야 한다
class B extends A {
  public B(int num) {
    super(num);
    System.out.println("B클");
  }
}


class Person2 {
  String name;
  int age;

  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }
}


class Teacher extends Person2 {
  public Teacher(String name, int age) {
    super(name, age);
  }

  public void lecture() {
    System.out.println("강의한다");
  }
}


class Student extends Person2 {
  public Student(String name, int age) {
    super(name, age);
  }

  public void study() {
    System.out.println("공부한다");
  }
}


// super(): 부모 클래스의 생성자를 호출한다
//          무조건 생성자 함수가 시작하는 첫번째 줄에
//          선언되야된다. 안 그러면 에러가 난다.

// 상속
//   - 다중 상속 X  ->  인터페이스


public class InheritanceEx02 {
  public static void main(String[] args) {
    // 상속받은 자식 클래스 객체 생성
    B b1 = new B(123);

    System.out.println(b1.num);
    // 상속받은 부모 클래스 객체 먼저 생성

  }
}

