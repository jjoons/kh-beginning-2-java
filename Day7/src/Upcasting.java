// class Animal {
//   String name;
// }

// class Cat extends Animal {
//   int age;
//   int wei;
// }

// class Dog extends Animal {
// }

// class Horse extends Animal {
// }

public class Upcasting {
  public static void main(String[] args) {
    // 업캐스팅
    // - 자식 객체를 부모 타입으로 해석하는 것

    // 고양이 객체 생성
    // 부모 + 자식 변수들 멤버 다 사용 가능
    Cat c = new Cat();
    c.age = 2;
    c.name = "냥냥이";
    // c.wei = 1;

    // 고양이는 동물이다.
    Animal a = c; // 고양이 객체는 동물로 해석

    System.out.println(a.name);
    // System.out.println(a.age);

    // 부모가 자식을 참조하고 (자식의 주소값 저장)
    // 부모가 물려준 변수, 메소드에만 접근이 가능하다.

    if (a instanceof Cat) {
      Cat z = (Cat) a;
    }

    // 자식이 부모를 참조
    Animal b = new Animal();

    // 동물은 고양이다..?
    // Cat cc = b; // 자식이 부모 타입을 참조할 수 없음

  }
}
