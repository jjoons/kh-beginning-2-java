package swing;

import javax.swing.*;

class MyComboBox extends JFrame {
  String[] name = {"고양이", "강아지", "돼지"};
  JComboBox<String> obj1 = new JComboBox<>(name);
  JPanel panel = new JPanel();

  public MyComboBox() {
    this.setSize(500, 300);

    this.panel.add(obj1);
//    this.panel.add(obj2);
//    this.panel.add(obj3);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class ComboBoxMain {
  public static void main(String[] args) {
    // RadioButton
    //   - 여러 옵션 중에 하나를 선택할 수 있는 라디오 버튼
    //   - 한 번에 하나만 결과를 얻는다

    new MyComboBox();
  }
}


