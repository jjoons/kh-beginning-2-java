package mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;

public class MouseWheelMain extends JFrame implements MouseWheelListener {
  JLabel label = new JLabel("안녕하세요");
  JPanel pan = new JPanel();
  int fontSize = 30;
  Random r = new Random();

  public MouseWheelMain() {
    this.setTitle("마우스 휠 이벤트");
    this.setSize(400, 200);

    label.setFont(new Font("굴림체", Font.PLAIN, this.fontSize));
    pan.add(label);

    this.add(pan);

    this.addMouseWheelListener(this);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MouseWheelMain();
  }

  @Override
  public void mouseWheelMoved(MouseWheelEvent e) {
    // 휠을 움직일 때 이벤트 발생
    // 마우스가 앞으로 움직이면(위로 스크롤하면) "-1"
    // 마우스가 뒤로 움직이면(아래로 스크롤하면) "1"
    // System.out.println(e.getWheelRotation());

    int result = e.getWheelRotation();

    // RGB 랜덤 값 0 ~ 255
    int red = r.nextInt(256);
    int blue = r.nextInt(256);
    int green = r.nextInt(256);

    this.pan.setBackground(new Color(red, blue, green));

    if (result == -1) {
      // 휠을 앞으로 움직였을 때
      fontSize--;
    } else {
      // 휠을 뒤로 움직였을 때
      fontSize++;
    }

    label.setFont(new Font("궁서체", Font.BOLD, this.fontSize));
  }
}
