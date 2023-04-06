package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 이벤트를 듣고 있는 Listener 클래스 생성
class MyListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    // 이벤트 객체에서 getSource();
    //   이벤트 정보를 가지고 있다. (버튼, 목록, ...)
    //   Object로 모든 객체들을 받아서 돌려줄 수 있다

    JButton btn = (JButton) e.getSource();
    String text = btn.getText();
    boolean res = text.equals("왜 눌렀니??");

    btn.setText(res ? "아! 왜 눌렀냐니까!!" : "왜 눌렀니??");
//    System.out.println(btn.getText());
//    btn.setText("왜 눌렀니??");
  }
}

public class MyFrame extends JFrame implements ActionListener {
  public MyFrame() throws HeadlessException {
    this.setBounds(450, 450, 400, 300);

    Font font = new Font("궁서체", Font.BOLD,30);

    JPanel panel = new JPanel();
    this.add(panel);

    JButton btn1 = new JButton("버튼을 누르세요~");
    btn1.setFont(font);
    panel.add(btn1);

    // 버튼에 이벤트 설정(추가)
    // 객체 생성해서 사용 implements ActionListener
    //   구현해서 자기 자신을 참조하게 만들어도 된다.
    // btn1.addActionListener(new MyListener()); // 방법 1

    // MyFrame 클래스 안에 구현
    btn1.addActionListener(this); // 방법 2

    boolean[] a = {false};

    btn1.addActionListener(e -> {
      JButton btn = (JButton) e.getSource();
      String text = btn.getText();
      a[0] = text.equals("왜 눌렀니??");

      btn.setText(a[0] ? "아! 왜 눌렀냐니까!!" : "왜 눌렀니??");
    });

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton) e.getSource();
    String text = btn.getText();
    boolean res = text.equals("왜 눌렀니??");

    btn.setText(res ? "아! 왜 눌렀냐니까!!" : "왜 눌렀니??");
  }
}
