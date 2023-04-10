package thread_synchronized;

// 집에 화장실이 하나 밖에 없다
public class FamilyThread extends Thread {
  private Washroom wr;
  private String who;

  public FamilyThread(Washroom wr, String who) {
    this.wr = wr;
    this.who = who;
  }

  @Override
  public void run() {
    wr.openDoor(who);
  }
}
