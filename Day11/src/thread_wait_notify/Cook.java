package thread_wait_notify;

public class Cook implements Runnable {
  private final Dish dish; // 객체 생성할 때 생성과 동시에 저장

  // 기본 생성자가 생기지 않는다
  // final 변수를 초기화하지 않은 상태에서 기본 생성자를 만들 수 없다

  // 매개 변수가 있는 생성자
  public Cook(Dish dish) {
    this.dish = dish;
  }

  // 주방장 고유 권한
  private void cook(int i) throws InterruptedException {
    synchronized (dish) {
      while (!dish.isEmpty()) {
        dish.wait(); // 음식을 먹을 때까지 기다린다
      }

      dish.setEmpty(false);
      System.out.println(i + "번째 음식이 준비되었습니다");
      dish.notify();
    }
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        this.cook(i);
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
