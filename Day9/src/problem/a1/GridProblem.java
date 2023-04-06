package problem.a1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class MyGridProblem extends JFrame {
  public ArrayList<JButton> buttons = new ArrayList<>();
  public JPanel panel = new JPanel();
  public GridLayout gridLayout;
  public int count;

  public GraphicsEnvironment ge;
  public GraphicsDevice gd;
  public DisplayMode displayMode;

  public MyGridProblem(int count) {
    this.count = count;

    // 디스플레이 크기 불러오기
    this.ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    this.gd = ge.getDefaultScreenDevice();
    this.displayMode = gd.getDisplayMode();

    this.gridLayout = new GridLayout(this.count, this.count);
    this.panel.setLayout(gridLayout);

    for (int i = 1; i <= count * count; i++) {
      buttons.add(new JButton(i + ""));
      this.panel.add(buttons.get(i - 1));
    }

    this.add(panel);

    int width = Math.min(count * 60, displayMode.getWidth());
    int height = Math.min(count * 60, displayMode.getHeight());

    this.setSize(width, height);
    this.setVisible(true);

    // X(닫기) 눌렀을 때 메인 프레임과 자바 프로그램 자체 종료
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class GridProblem {
  // 배열, 반복문을 이용해서 생성 및 배치
  public static void main(String[] args) {
    MyGridProblem myGrid = new MyGridProblem(10);
    // myGrid.setSize(600, 600);
  }
}
