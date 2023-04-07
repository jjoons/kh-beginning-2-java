package problem.a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelGameSolution extends JFrame implements MouseWheelListener {
  JPanel redPanel = new JPanel();
  JPanel greenPanel = new JPanel();
  JPanel bluePanel = new JPanel();

  // 각각의 RGB 색상을 저장하는 변수
  int r = 128, g = 128, b = 128;

  // 총 색상을 표현하는 패널
  JPanel colorPanel = new JPanel();

  // RGB 라벨
  // 각각 패널
  JLabel redLabel = new JLabel(r + "");
  JLabel greenLabel = new JLabel(g + "");
  JLabel blueLabel = new JLabel(b + "");


  public MouseWheelGameSolution() {
    // 3개의 색상을 한꺼번에 올려주는 패널
    // 패널 생성과 동시에 화면 배치까지 같이 설정
    JPanel controlPanel = new JPanel(new GridLayout(1, 3));

    this.setBounds(100, 100, 400, 600);
    this.setLayout(new GridLayout(2, 0));

    colorPanel.setBackground(new Color(r, g, b));

    // 각각 패널에 배경색 저장
    redPanel.setBackground(Color.RED);
    greenPanel.setBackground(Color.GREEN);
    bluePanel.setBackground(Color.BLUE);

    // 이벤트 설정
    redPanel.addMouseWheelListener(this);
    greenPanel.addMouseWheelListener(this);
    bluePanel.addMouseWheelListener(this);

    // 라벨 글씨 색상
    redLabel.setForeground(Color.WHITE);
    blueLabel.setForeground(Color.WHITE);

    // 각각 패널에 라벨 추가
    redPanel.add(redLabel);
    greenPanel.add(greenLabel);
    bluePanel.add(blueLabel);

    // 각각 패널을 컨트롤 패널에 추가
    controlPanel.add(redPanel);
    controlPanel.add(greenPanel);
    controlPanel.add(bluePanel);

    this.add(controlPanel);
    this.add(colorPanel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MouseWheelGameSolution();
  }

  @Override
  public void mouseWheelMoved(MouseWheelEvent e) {
    // 1. 휠을 앞으로 굴렸는지 뒤로 굴렸는지 확인
    int wheel = e.getWheelRotation();

    // 2. 어떤 객체에서 이벤트가 발생했는지 확인
    Object obj = e.getSource();
    JPanel pan = (JPanel) obj;

    if (pan == redPanel) {
      if (wheel == -1) {
        // r = Math.max(--r, 0)
        r = --r < 0 ? 0 : r;
      } else {
        // r = Math.min(++r, 255)
        r = ++r > 255 ? 255 : r;
      }

      redLabel.setText(r + "");
    } else if (pan == greenPanel) {
      if (wheel == -1) {
        g = --g < 0 ? 0 : g;
      } else {
        g = ++g > 255 ? 255 : g;
      }

      greenLabel.setText(g + "");
    } else if (pan == bluePanel) {
      if (wheel == -1) {
        b = --b < 0 ? 0 : b;
      } else {
        b = ++b > 255 ? 255 : b;
      }

      blueLabel.setText(b + "");
    }

    // RGB 값이 변경되었다. 그러면 다시 Color 객체 생성
    // 수정
    colorPanel.setBackground(new Color(r, g, b));
  }
}

