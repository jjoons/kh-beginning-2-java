
public class ThreadMulti2 {
  public static void main(String[] args) {
    Thread m1 = new MyThread();
    Car c1 = new Car("소나타", 1000);
    Car c2 = new Car("그랜저", 3000);

    // 스레드 시작점 (start()) 호출
    m1.start();
    c1.start();
    c2.start();

    System.out.println("main 스레드 끝");
  }
}
