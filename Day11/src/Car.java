
public class Car extends Thread {
  String name;
  int time;

  public Car(String name, int time) {
    this.name = name;
    this.time = time;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      // 프로그램을 지연시키는 함수
      try {
        // 1000ms = 1s
        Thread.sleep(this.time);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(this.name + " 돌격합니다!");
    }
  }
}
