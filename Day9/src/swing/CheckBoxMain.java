package swing;

import javax.swing.*;

class MyCheckBox extends JFrame {
  JCheckBox obj1 = new JCheckBox();
  JCheckBox obj2 = new JCheckBox("고양이");
  JCheckBox obj3 = new JCheckBox("강아지", true);
  JPanel panel = new JPanel();

  public MyCheckBox() {
    this.setSize(500, 300);

    this.panel.add(obj1);
    this.panel.add(obj2);
    this.panel.add(obj3);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class CheckBoxMain {
  public static void main(String[] args) {
    // CheckBox
    //   선택하거나 선택을 해제할 수 있음
    //   한꺼번에 여러 개의 답을 얻을 수 있다

    new MyCheckBox();
  }
}


