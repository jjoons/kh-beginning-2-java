import javax.swing.JOptionPane;

class Time {
  int i;

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


public class ThreadMain {
  public static void main(String[] args) {
    Time t1 = new Time();
    t1.run();

    String msg = JOptionPane.showInputDialog("입력: ");
    System.out.println(msg);

    // 스레드
    //   - 프로세스
    //   - 실행 중인 프로그램의 최소 단위
    //   - 디스크에 있는 프로그램이 메모리에 적재되어 운영체제의 제어를 ...
    //   - 자신만의 자원을 가지기 때문에 프로세스끼리는 서로 독립적

    // 멀티태스킹
    //   - 두 가지 이상의 작업을 동시에 처리하는 것
    //   - 스마트폰, 카카오톡 (여러명과 각각 대화)

    // 스레드 생성하는 방법
    //   1. 상속
    //   2. 인터페이스

    // 자바 Main Thread
    //   - 모든 자바 main() 메소드를 실행하면서 시작된다

    /*
     * 멀티 스레드의 장점
     *   - CPU의 사용률을 향상시킨다
     *   - 자원을 보다 효울적으로 사용할 수 있다
     *   - 사용자에 대한 응답성이 향상된다
     *   - 작업이 분리되어 코드가 간결해진다
     */
  }
}
