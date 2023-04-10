package problem.a4_solution;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MoveWindowFrameSolution extends JFrame implements Runnable {
  Dimension dimen; //너비랑 높이를 저장하고 있는 클래스
  int x;
  int y;

  public MoveWindowFrameSolution() {
    setTitle("제목 없는 윈도우");
    setBounds(x, y, 400, 300);

    // 화면의 해상도를 얻어온다. 자동으로 Dimension객체에 저장한다.
    dimen = Toolkit.getDefaultToolkit().getScreenSize();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  @Override
  public void run() {
    int xt = 1;
    int yt = 1;

    boolean res = true; // 왼쪽에서 오른쪽으로 움직일때.
                        // 오른쪽에서 왼쪽으로 움직일때.
                        //false 위에서 아래 아래 위로 !
    while (true) {

      if (res) {
        x += xt;
        if ((x >= dimen.width - 400) || (x <= 0)) {
          xt *= -1;
          res = false;
        }

      } else {
        y += yt;
        if ((y >= dimen.width - 300) || (y <= 0)) {
          yt *= -1;
          res = true;
        }

      }
      setLocation(x, y);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
      }
    }
  }
}
