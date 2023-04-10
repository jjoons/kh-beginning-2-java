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

    // 멀티 실행 (배열 Thread, char)
    marioThread.start();
    marigeeThread.start();
    prinThread.start();
    kinoThread.start();
  }
}
