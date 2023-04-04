import java.util.ArrayList;

// 강사가 고양이를 키운다. (가정)
// 동물병원 대기 순서표
// 고양이, 강아지, 도끼
class AnimalHospital {
  // 대기표
  Animal[] 대기표 = new Animal[50];

}

class Animal {
  String name;
  int age;
}

class Cat extends Animal {
}

class Dog extends Animal {
}

class Horse extends Animal {
}

class Rabbit extends Animal {
}

public class Upcasting2 {
  public static void main(String[] args) {
    // 동물병원 생성
    AnimalHospital ah = new AnimalHospital();

    // 강아지, 고양이, 토끼
    // 첫번째
    ah.대기표[0] = new Dog();
    ah.대기표[1] = new Cat();
    ah.대기표[2] = new Rabbit();

    // 다양한 객체들을 부모의 타입으로 관리할 수 있다.
  }
}
