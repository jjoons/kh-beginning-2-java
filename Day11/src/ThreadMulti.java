import javax.swing.JOptionPane;

public class ThreadMulti {
  public static void main(String[] args) {
    Thread m1 = new MyThread();

    // 실제 스레드를 정의해서 객체를 생성하면 start() 함수를 실행해야한다.
    // 자동적으로 run() 메소드가 호출되며 그 안에 있는 내용을 실행하게 된다.
    m1.start();

    String msg = JOptionPane.showInputDialog("입력: ");
    System.out.println(msg);

    System.out.println("main 스레드 끝");
  }
}
