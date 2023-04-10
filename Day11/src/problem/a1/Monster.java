package problem.a1;

// 몬스터의 이름, 몇 초마다 한 번씩 출몰한다
// 오크: 2초마다 한 번씩 출몰한다
// 오크 전사: 5초마다 한 번씩 출몰한다
public class Monster extends Thread {
  String mobName;
  int delay;

  public Monster(String mobName, int delay) {
    this.mobName = mobName;
    this.delay = delay;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(this.delay);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(this.mobName + " 몬스터가 출몰합니다");
    }
  }
}
