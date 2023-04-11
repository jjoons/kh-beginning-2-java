package innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

interface A {
  void show();
}


public class AnonymousMain extends JFrame {
  public AnonymousMain() {
    this.setBounds(0, 0, 400, 300);
    JButton btn = new JButton("눌렀니?");
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        btn.setText("놀랐네~");
      }
    });

    // Lambda
    // btn.addActionListener(e -> btn.setText("놀랐네~"));

    this.add(btn);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    // 내부 클래스 익명 클래스
    //   - 클래스를 정의함과 동시에 객체를 생성할 때 만들어지는 클래스
    //   - 1회용 클래스
    // 추상 클래스, 인터페이스 객체 생성 X
    // 이벤트할 때나 GUI 그래픽할 때 많이 사용한다

    new AnonymousMain();

    A a1 = new A() {
      @Override
      public void show() {
        System.out.println("딱 한 번 실행하는 메소드");
      }
    };

    a1.show();

    Runnable r = () -> System.out.println();
    r.run();
  }
}
