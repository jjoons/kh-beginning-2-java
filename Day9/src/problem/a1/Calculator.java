package problem.a1;

import javax.swing.*;
import java.awt.*;

// 너비 500, 높이 400
// 텍스트 필드 2개
// 더하기 결과 버튼, 빼기 결과 버튼
// 콘솔에 합 출력
public class Calculator extends JFrame {
  public Calculator() {
    this.setLayout(new FlowLayout());
    this.setSize(500, 500);

    JPanel mainPanel = new JPanel();
    mainPanel.setBounds(0, 0, 500, 500);

    JPanel textPanel = new JPanel();
    textPanel.setBounds(0, 0, 300, 200);

    JPanel functionPanel = new JPanel();
    functionPanel.setBounds(0, 300, 300, 200);


    JTextField textField1 = new JTextField(10);
    textPanel.add(textField1);

    JTextField textField2 = new JTextField(10);
    textPanel.add(textField2);


    JButton plusButton = new JButton("+");
    functionPanel.add(plusButton);
    plusButton.addActionListener(e -> {
      String text1 = textField1.getText();
      String text2 = textField2.getText();
      int result = 0;

      try {
        result = Integer.parseInt(text1);
        result += Integer.parseInt(text2);
        System.out.println("더하기 결과: " + result);
      } catch (NumberFormatException err) {
        System.out.println("숫자가 아닌 문자를 입력했습니다");
      }
    });

    JButton minusButton = new JButton("-");
    functionPanel.add(minusButton);
    minusButton.addActionListener(e -> {
      String text1 = textField1.getText();
      String text2 = textField2.getText();
      int result = 0;

      try {
        result = Integer.parseInt(text1);
        result -= Integer.parseInt(text2);
        System.out.println("빼기 결과: " + result);
      } catch (NumberFormatException err) {
        System.out.println("숫자가 아닌 문자를 입력했습니다");
      }
    });

    mainPanel.add(textPanel);
    mainPanel.add(functionPanel);

    this.add(mainPanel);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
