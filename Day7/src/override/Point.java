package override;

public class Point {
  int x;
  int y;

  // 좌표를 출력하는 메소드
  public void info() {
    System.out.println("x: " + x + ", y: " + y);
  }

  // 기존 toString()
  // 기본값은 "클래스명@주소값"
  // 단, 안에 있는 내용은 자식 클래스에 맞게 변경하겠다
  @Override
  public String toString() {
    return "x: " + x + ", y: " + y;
  }
}

class Point3D extends Point {
  int z;

  @Override
  public void info() {
    System.out.println("x: " + x + ", y: " + y + ", z: " + z);
  }
}
