package problem.a2;

class Shape {
  String name;
  double calculatedValue;

  public double area() {
    return .0;
  }

  @Override
  public String toString() {
    return this.name + "의 넓이 -> " + this.calculatedValue;
  }
}

class Square extends Shape {
  double lengthOfOneLine;

  public Square() {
    this.name = "정사각형";
  }

  @Override
  public double area() {
    return this.calculatedValue = lengthOfOneLine * lengthOfOneLine;
  }
}

class Triangle extends Shape {
  double 밑변;
  double height;

  public Triangle() {
    this.name = "삼각형";
  }

  @Override
  public double area() {
    return this.calculatedValue = 밑변 * height * 0.5;
  }
}

class Circle extends Shape {
  double 반지름;

  public Circle() {
    this.name = "원";
  }

  @Override
  public double area() {
    return this.calculatedValue = 반지름 * 반지름 * 3.14;
  }
}

public class OverrideProblem2 {
  public static void main(String[] args) {
    // 클래스 shape
    // 멤버변수 name 
    // 멤버메서드 area 
    //    return double 
    // 클래스로 사용!

    // 정사각형은 도형 shape
    // 클래스 이름:square
    //  멤버 변수 :한변의 길이 변수명
    //  area 오버라이딩해서 넓이 구하시오!

    // 삼각형 도형 
    // triangle
    // 밑변,높이 멤버변수 
    //  area 오버라이딩해서 넓이 구하시오!

    // 원 도형
    // Circle 
    // 반지름 멤버변수 
    // area 오버라이딩해서 넓이 구하시오!

    // 위에있는 아이들의 그룹(업캐스팅)
    // 반복문과 배열을 이용해서 
    // 코드의줄을 4줄 안쪽으로 작성해보세요! (취소)

    Square s1 = new Square();
    s1.lengthOfOneLine = 4;
    s1.area();
    System.out.println(s1);

    Triangle t1 = new Triangle();
    t1.height = 10;
    t1.밑변 = 5;
    t1.area();
    System.out.println(t1);

    Circle c1 = new Circle();
    c1.반지름 = 5;
    c1.area();
    System.out.println(c1);

  }

}
