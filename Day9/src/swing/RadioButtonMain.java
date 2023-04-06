package swing;

import javax.swing.*;

class MyRadioButton extends JFrame {
  JRadioButton obj1 = new JRadioButton();
  JRadioButton obj2 = new JRadioButton("강아지");
  JRadioButton obj3 = new JRadioButton("고양이", true);
  JPanel panel = new JPanel();

  public MyRadioButton() {
    this.setSize(500, 300);

    this.panel.add(obj1);
    this.panel.add(obj2);
    this.panel.add(obj3);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class RadioButtonMain {
  public static void main(String[] args) {
    // RadioButton
    //   - 여러 옵션 중에 하나를 선택할 수 있는 라디오 버튼
    //   - 한 번에 하나만 결과를 얻는다

    new MyRadioButton();
  }
}


