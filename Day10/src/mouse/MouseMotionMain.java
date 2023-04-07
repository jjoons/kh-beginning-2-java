package mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionMain extends JFrame implements MouseMotionListener {
  JPanel pan;
  JLabel label;

  public MouseMotionMain() {
    this.setTitle("마우스 이벤트");
    this.setSize(400, 200);

    pan = new JPanel();
    label = new JLabel("움직이는 레이블");
    label.setForeground(Color.CYAN);

    pan.addMouseMotionListener(this);
    pan.add(label);

    this.add(pan);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MouseMotionMain();
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    // 마우스 클릭한 상태에서 드래그할 때
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    // 마우스가 움직일 때

    // e 변수가 가지고 있는 정보 사용
    label.setLocation(e.getX() - 20, e.getY() - 20);
  }
}
