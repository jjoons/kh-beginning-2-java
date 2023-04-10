package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements Runnable {
  Dimension dimen; // 너비랑 높이를 저장하는 클래스
  int x;
  int y;

  public MyFrame() {
    this.setTitle("제목 없는 윈도우");
    this.setBounds(this.x, this.y, 400, 300);

    // 화면의 해상도를 받아와서 Dimension 객체에 저장한다
    dimen = Toolkit.getDefaultToolkit().getScreenSize();

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void run() {
    while (true) {
      // 윈도우 창을 오른쪽으로 움직일 것
      this.x++;

      // 자바 프로그램 창을 넘어간다
      // 넘어가지 않게 멈춘다
      if (this.x >= this.dimen.width - this.getWidth()) {
        break;
      }

      // 너무 빠르게 실행되서 보이지 않기 때문에 지연을 시킨다
      // 일정 시간마다 멈추고 동작을 보여줄 수 있게
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      this.setLocation(this.x, this.y);
      // 창의 위치만 변경하고 싶을 경우에는 setLocation(좌우, 상하)
      // 오른쪽으로 가면 증가 (+), 왼쪽으로 가면 감소 (-)
    }
  }
}
