package problem.a6;

class Galaxy {
  // 필드: 일련 번호 (인스턴스 변수)
  String serialNum; // 일련번호

  /* 1. 해당 필드를 클래스 변수화 하세요. */
  static int count = 0;

  // 생성자
  Galaxy() {
    count++;
    char c = randomAlphabet(); // A ~ Z 중 택1
    serialNum = String.format("%c-%d", c, count);
  }

  // 메소드
  char randomAlphabet() {
    return (char) ('A' + Math.random() * 26); // A to Z
  }

  void print() {
    System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
  }
}

public class GalaxyTest {
  public static void main(String[] args) {
    // 스마트폰 일련 번호
    Galaxy[] galaxys = new Galaxy[5];

    for (int i = 0; i < galaxys.length; i++) {
      galaxys[i] = new Galaxy();
    }

    for (Galaxy galaxy : galaxys) {
      galaxy.print();
    }

    System.out.println("Galaxy 객체의 개수: " + Galaxy.count);
  }
}
