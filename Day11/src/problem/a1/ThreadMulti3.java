package problem.a1;

public class ThreadMulti3 {
  public static void main(String[] args) {
    Thread oak = new Monster("오크", 2000);
    Thread oaka = new Monster("오크 전사", 5000);

    oaka.start();
    oak.start();
  }
}
