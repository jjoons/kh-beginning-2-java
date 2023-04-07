package problem.a2;

import javax.swing.*;
import java.awt.*;

// 1. 메인 패널을 만듬 (가로 500, 세로 800)
// 2. BorderLayout을 사용해서 2개의 패널을 만듬
//    가운데 하나
//      GridLayout을 이용해서 RGB 패널 3개 만들기
//        Red, Green, Blue
//    밑에 하나
//      마우스로 위로 스크롤할 때 옅게 만들기, 아래로 스크롤할 때 진하게 만들기
public class MouseWheelGame extends JFrame {
  JPanel mainPanel = new JPanel();
  JPanel northPanel = new JPanel();
  JPanel southPanel = new JPanel();
  JPanel redPanel = new JPanel();
  JPanel greenPanel = new JPanel();
  JPanel bluePanel = new JPanel();
  Color southPanelColor = Color.CYAN;
  int redValue = southPanelColor.getRed();
  int greenValue = southPanelColor.getGreen();
  int blueValue = southPanelColor.getBlue();

  public MouseWheelGame() {
    this.setSize(600, 900);

    this.initConstructor();

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void initConstructor() {
    mainPanel.setLayout(new GridLayout(2, 0));

    redPanel.setBackground(Color.RED);
    greenPanel.setBackground(Color.GREEN);
    bluePanel.setBackground(Color.BLUE);

    northPanel.setLayout(new GridLayout(0, 3));
    northPanel.add(redPanel);
    northPanel.add(greenPanel);
    northPanel.add(bluePanel);
    mainPanel.add(northPanel, BorderLayout.NORTH);

    southPanel.setBackground(this.southPanelColor);
    southPanel.addMouseWheelListener(e -> {


      if (e.getWheelRotation() == -1) {
        redValue = this.redValue - 1 >= 255 ? 255 : this.redValue - 1 <= 0 ? 0 : --this.redValue;
        greenValue = this.greenValue - 1 >= 255 ? 255 : this.greenValue - 1 <= 0 ? 0 : --this.greenValue;
        blueValue = this.blueValue - 1 >= 255 ? 255 : this.blueValue - 1 <= 0 ? 0 : --this.blueValue;

        southPanel.setBackground(new Color(redValue, greenValue, blueValue));
      } else {
        redValue = this.redValue + 1 >= 255 ? 255 : this.redValue + 1 <= 0 ? 0 : ++this.redValue;
        greenValue = this.greenValue + 1 >= 255 ? 255 : this.greenValue + 1 <= 0 ? 0 : ++this.greenValue;
        blueValue = this.blueValue + 1 >= 255 ? 255 : this.blueValue + 1 <= 0 ? 0 : ++this.blueValue;

        southPanel.setBackground(new Color(redValue, greenValue, blueValue));
      }
    });
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    mainPanel.setSize(500, 800);

    this.add(mainPanel);
  }

  public static void main(String[] args) {
    new MouseWheelGame();
  }
}

