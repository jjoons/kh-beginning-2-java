package inheritance;

class Person {
  String name;
  int age;
  double height;
  double weight;
  String bloodType;

  public void 먹는다() {}

  public void 논다() {}

  public void 잔다() {}
}


class Hero extends Person {
}


class Captain extends Hero {
  public void 방패공격() {}
}


class IronMan extends Hero {
  public void 한손공격() {}
}


class Hulk extends Hero {
  public void 초록공격() {}
}


class Widow extends Hero {
  public void 암살() {}
}


public class InheritanceEx01Problem {
  public static void main(String[] args) {
    // 히어로 클래스 상속
    //
    // 메소드
    // 캡틴 -> 방패공격()
    // 아이언맨 -> 한손공격()
    // 헐크 -> 초록공격()
    // 위도우 -> 암살()

    // Person 클래스
    //   이름, 나이, 키, 몸무게, 혈액형
    //   먹다, 놀다, 잔다

  }
}
