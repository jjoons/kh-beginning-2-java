package mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseMain extends JFrame implements MouseListener {
  JPanel pan;

  public MouseMain() {
    this.setTitle("마우스 이벤트");
    this.setSize(400, 200);

    pan = new JPanel();

    // 실제 메인 프레임 이벤트 설정
    this.addMouseListener(this);
    this.add(pan);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MouseMain();
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // 마우스 클릭할 때
    pan.setBackground(Color.GREEN);
  }

  @Override
  public void mousePressed(MouseEvent e) {
    // 마우스 누를 때
    pan.setBackground(Color.CYAN);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // 마우스 뗄 때
    pan.setBackground(Color.ORANGE);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // 마우스가 프레임 안쪽으로 들어왔을 때
    pan.setBackground(Color.YELLOW);
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // 마우스가 프레임을 나갔을 때
    pan.setBackground(Color.GRAY);
  }
}
