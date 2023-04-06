package swing;

import javax.swing.*;

class MyPasswordField extends JFrame {
  JPasswordField obj1 = new JPasswordField(10);
  JPasswordField obj2 = new JPasswordField("댕댕이");
  JPasswordField obj3 = new JPasswordField("댕댕이", 10);
  JPanel panel = new JPanel();

  public MyPasswordField() {
    this.setSize(500, 300);

    this.panel.add(obj1);
    this.panel.add(obj2);
    this.panel.add(obj3);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class PasswordFieldMain {
  public static void main(String[] args) {
    // PasswordField
    //   - 비밀번호 입력에 특화된 메소드
    //   - 암호 기능을 처리하고 한 줄의 텍스트로 편집할 수 있다

    new MyPasswordField();
  }
}
