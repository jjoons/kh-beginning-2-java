package swing_layout;

import javax.swing.*;
import java.awt.*;

class MyGrid extends JFrame {
  public JButton btn1 = new JButton("버튼1");
  public JButton btn2 = new JButton("버튼2");
  public JButton btn3 = new JButton("버튼3");
  public JButton btn4 = new JButton("버튼4");
  public JButton btn5 = new JButton("버튼5");

  JPanel panel = new JPanel();

  public MyGrid() {
    this.setSize(400, 200);

    // 화면 배치 설정
    this.panel.setLayout(new GridLayout(3, 2));

    // 보조 프레임에 여러 개의 버튼 먼저 추가한다
    this.panel.add(btn1);
    this.panel.add(btn2);
    this.panel.add(btn3);
    this.panel.add(btn4);
    this.panel.add(btn5);

    this.add(panel);

    this.setVisible(true);
  }
}

public class GridLayoutMain {
  public static void main(String[] args) {
    new MyGrid();

    // GridLayout
    //   - 행과 열을 만들어 격자 형태로 정렬하는 레이아웃
    //   - 모든 컴포넌트들이 동일한 크기를 가지고 프레임에 배치된다
    //   - 예) 엑셀, 바둑판

  }
}
