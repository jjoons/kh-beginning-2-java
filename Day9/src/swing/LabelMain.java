package swing;

import javax.swing.*;

class MyLabel extends JFrame {
  ImageIcon catIcon = new ImageIcon("cat.png");
  JLabel obj2 = new JLabel("고양이");
  JLabel obj3 = new JLabel(catIcon);
  JLabel obj4 = new JLabel("고양이", catIcon, JLabel.RIGHT);
  JPanel panel = new JPanel();

  public MyLabel() {
    this.setSize(500, 300);

    this.panel.add(obj2);
    this.panel.add(obj3);
    this.panel.add(obj4);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class LabelMain {
  public static void main(String[] args) {
    // Label
    //   - 고정된 텍스트값 표현
    //   - 읽기 전용 한 줄 표시

    new MyLabel();
  }
}


