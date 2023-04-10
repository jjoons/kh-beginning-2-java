package thread_synchronized;

public class ThreadSynchronizedMain {
  public static void main(String[] args) {
    // 스레드 동기화
    //   - 멀티스레드 환경에서 여러 스레드가 하나의 공유 자원에
    //     동시 접근하지 못 하게 막는 것

    Washroom wr = new Washroom();

    FamilyThread father = new FamilyThread(wr, "아빠");
    FamilyThread mother = new FamilyThread(wr, "엄마");
    FamilyThread sister = new FamilyThread(wr, "여동생");
    FamilyThread me = new FamilyThread(wr, "나");

    father.start();
    mother.start();
    sister.start();
    me.start();
  }
}

// 계좌 개설
//   계좌의 주인이 있다

/*
 * 메소드 전체를 임계영역을 지정
 *   메소드 선언 시에 synchronized 키워드 추가,
 *   이 메소드가 호출되면 메소드를 가지고 있는
 *   객체에 대한 락을 획득하여 작업을 수행하다가
 *   메소드 종료되면 락을 반납합니다.
 *
 * 특정 영역만 임계영역을 지정
 *   synchronized 키워드로 시작하는 블록으로 지정,
 *   특정 객체를 지정하여 블록 내에서 객체에 대한
 *   락을 획득하고 블록을 벗어나면 락을 반납합니다.
 */
