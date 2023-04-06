package swing_layout;

import javax.swing.*;
import java.awt.*;

class MyBorder extends JFrame {
  public JButton btn1 = new JButton("버튼1");
  public JButton btn2 = new JButton("버튼2");
  public JButton btn3 = new JButton("버튼3");
  public JButton btn4 = new JButton("버튼4");
  public JButton btn5 = new JButton("버튼5");

  JPanel panel = new JPanel();

  public MyBorder() {
    this.setSize(400, 200);

    // 화면 배치 설정
    this.panel.setLayout(new java.awt.BorderLayout());

    // 보조 프레임에 여러 개의 버튼 먼저 추가한다
    this.panel.add(btn1, BorderLayout.NORTH);
    this.panel.add(btn2, BorderLayout.WEST);
    this.panel.add(btn3, BorderLayout.EAST);
    this.panel.add(btn4, BorderLayout.SOUTH);
    this.panel.add(btn5, BorderLayout.CENTER);

    this.add(panel);

    this.setVisible(true);
  }
}

public class BorderLayoutMain {
  public static void main(String[] args) {
    // BorderLayout
    //   동서남북 중앙 / 상하좌우 가운데

    // 기본적으로 JFrame 화면 배치 BorderLayout
    // 기본적으로 가운데 정렬
    // 각 영역당 하나의 컴포넌트 (버튼, 스크롤, 체크박스, 라디오박스)

    new MyBorder();
  }
}
