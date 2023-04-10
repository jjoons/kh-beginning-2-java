
// 데몬 스레드
//   - main 스레드가 끝나면 나머지 스레드들도 모두 종료하게 만드는 기능(?)
//   setDaemon(boolean)
//     true: main 스레드가 종료되면 종료
//     false: main 스레드 상관없이 실행
//   ex) 게임 속 배경음악

class Music extends Thread {
  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("음악이 연주 중입니다");
    }
  }
}


public class ThreadDaemonMain {
  public static void main(String[] args) {
    Music m = new Music();

    // 데몬 스레드 설정은 무조건 start 메소드를 시작하기 전에 선언해야 함
    m.setDaemon(true);
    m.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("신나게 게임 중");

      if (i == 9) {
        System.out.println("앗! 엄마다!");
        System.out.println("게임을 종료합니다~!");
        break;
      }

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
