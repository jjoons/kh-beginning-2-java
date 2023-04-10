package problem.a2_solution;

public class SuperMarioMainSolution {
  public static void main(String[] args) {
    Mario mario = new Mario("마리오", "펀치", 1000);
    Marigee marigee = new Marigee("마리지", "폭탄", 500);
    PeachPrincess prin = new PeachPrincess("피치공주", "물건 던지기", 1000);
    Kino kino = new Kino("버섯돌이", "펀치 공격", 1500);

    // Thread 클래스의 도움
    //   다른 상속을 받은 캘래스들은 Thread에게 객체 생성 시
    //   인터페이스로 구현한 run() 메소드가 들어있는 객체를 넘겨준다
    Thread marioThread = new Thread(mario); // 다형성
    Thread marigeeThread = new Thread(marigee);
    Thread prinThread = new Thread(prin);
    Thread kinoThread = new Thread(kino);

    // 쿠파 체력이 0 이하여서 죽었다
    // 하지만 마리오랑 마리지, 피치공주는 계속 공격을 하고 있다
    // 각각 무한 반복하는 위의 주인공들을 setDaemon() 메소드를 이용해서
    // main 함수가 종료되면 나머지 주인공들도 종료될 수 있도록 설정하는 문제
    marioThread.setDaemon(true);
    marigeeThread.setDaemon(true);
    prinThread.setDaemon(true);
    kinoThread.setDaemon(true);

    // 멀티 실행 (배열 Thread, char)
    marioThread.start();
    marigeeThread.start();
    prinThread.start();
    kinoThread.start();

    while (Coopa.hp > 0) {
      try {
        System.out.println("쿠파 남은 체력: " + Coopa.hp);
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
