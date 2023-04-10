public class MyThread extends Thread {
  // 스레드를 상속받아서 실행하는 실행문을 작성하는 곳
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      // 프로그램을 지연시키는 함수
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(i + "초");
    }
  }
}