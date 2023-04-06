package swing_layout;

import javax.swing.*;

class MyFlow extends JFrame {
  public JButton btn1 = new JButton("버튼1");
  public JButton btn2 = new JButton("버튼2");
  public JButton btn3 = new JButton("버튼3");
  public JButton btn4 = new JButton("버튼4");

  // 화면 클래스 정의
  // FlowLayout flow = new FlowLayout();

  JPanel panel = new JPanel();

  public MyFlow() {
    this.setSize(400, 200);

    // 화면 배치 설정
    this.panel.setLayout(new java.awt.FlowLayout());
    this.panel.add(btn1);
    this.panel.add(btn2);
    this.panel.add(btn3);
    this.panel.add(btn4);

    this.add(panel);

    this.setVisible(true);
  }
}

public class FlowLayout {
  public static void main(String[] args) {
    new MyFlow();
    // 왼쪽에서 오른쪽으로 한 줄에 차례대로 정렬하는 레이아웃
    // 왼쪽에서 실행할지 오른쪽에서 실행할지 결정할 수 있음

    // JFrame
    //   하나의 버튼만 올라갈 수 있고 여러 가지 표현
    //   여러 가지의 버튼, 게시물, 스크롤, ...

    // 보조 프레임 (패널) JPanel

  }
}
