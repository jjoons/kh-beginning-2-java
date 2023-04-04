package problem.a3;

import java.util.Scanner;

public class CoffeeHome { // 커피 가게
  // 주문서 (여러 개의 객체를 관리하는 배열)

  Drink[] drinks = new Drink[3];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CoffeeHome cafe = new CoffeeHome();

    Coffee coffee = new Coffee("아메리카노", 5000);
    cafe.drinks[0] = coffee;

    Tea tea = new Tea("율무차", 4000);
    cafe.drinks[1] = tea;

    Juice juice = new Juice("오렌지주스", 6000);
    cafe.drinks[2] = juice;
  }
}

// Drink클래스 
// 밑에 중복되는 내용들을 정리해서 
// 상속 구조 만들고 오버라이딩해서 출력 
// ordered

class Drink {
  String name;
  int price;

  public Drink() {
  }

  public Drink(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public void ordered() {
    System.out.println("드링크가 주문되었습니다");
  }
}

// 커피클래스
// 멤버 name , price
// 메서드 ordered()
//    name 커피가 주문되었습니다.

class Coffee extends Drink {
  public Coffee() {
  }

  public Coffee(String name, int price) {
    super(name, price);
  }

  @Override
  public void ordered() {
    System.out.println(this.name + " 커피가 주문되었습니다");
  }
}

// 티클래스 
// 멤버 name, price 
//메서드 ordered()
//name 티(name)가 주문되었습니다.

class Tea extends Drink {
  public Tea() {
  }

  public Tea(String name, int price) {
    super(name, price);
  }

  @Override
  public void ordered() {
    System.out.println("티(" + this.name + ")가 주문되었습니다");
  }
}

// 주스클래스 
// 멤버 name,price 
//메서드 ordered()
//name 티(name)가 주문되었습니다.

class Juice extends Drink {
  public Juice() {
  }

  public Juice(String name, int price) {
    super(name, price);
  }

  @Override
  public void ordered() {
    System.out.println("주스(" + this.name + ")가 주문되었습니다");
  }
}
