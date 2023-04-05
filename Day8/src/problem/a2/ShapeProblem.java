package problem.a2;

class ShapeTriangle extends Shape {
  @Override
  public void draw() {
    System.out.println("정삼각형을 그린다");
  }
}

class ShapeSquare extends Shape {
  @Override
  public void draw() {
    System.out.println("정사각형을 그린다");
  }
}

class ShapeCircle extends Shape {
  @Override
  public void draw() {
    System.out.println("원을 그린다");
  }
}

class ShapeLine extends Shape {
  @Override
  public void draw() {
    System.out.println("선을 그린다");
  }
}

public class ShapeProblem {
  public static void main(String[] args) {
    new ShapeTriangle().draw();
    new ShapeSquare().draw();
    new ShapeCircle().draw();
    // new ShapeLine().draw();

    Shape shapeLine = new Shape() {
      @Override
      public void draw() {
        System.out.println("선을 그린다");
      }
    };

    shapeLine.draw();
  }
}
