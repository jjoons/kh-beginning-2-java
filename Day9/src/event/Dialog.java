package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// 너비 500, 높이 400
public class Dialog extends JFrame implements ActionListener {
  ArrayList<JButton> buttonList = new ArrayList<>();
  String[] buttonNameList = new String[]{"에러", "정보", "경고", "질문"};

  public Dialog() throws HeadlessException {
    this.setBounds(100, 100, 500, 400);
    this.setLayout(new GridLayout());

    JPanel panel = new JPanel();
    panel.setBounds(0, 0, 500, 400);

    for (int i = 0; i < buttonNameList.length; i++) {
      JButton button = new JButton(buttonNameList[i]);
      button.addActionListener(this);
      buttonList.add(button);
      panel.add(button);
    }

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Dialog();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();

    if (obj == buttonList.get(0)) {
      // 팝업창(JOptionPane) 클래스 static 선언이 되어있다
      // JOptionPane.showInputDialog(this, "이름을 입력하세요");
      JOptionPane.showMessageDialog(this, "팝업창 대화상자", "에러", JOptionPane.ERROR_MESSAGE);
      buttonList.get(0).setBackground(Color.PINK);
    } else if (obj == buttonList.get(1)) {
      JOptionPane.showMessageDialog(this, "팝업창 대화상자", buttonList.get(1).getText(), JOptionPane.INFORMATION_MESSAGE);
    } else if (obj == buttonList.get(2)) {
      JOptionPane.showMessageDialog(this, "팝업창 대화상자", buttonList.get(2).getText(), JOptionPane.WARNING_MESSAGE);
    } else if (obj == buttonList.get(3)) {
      JOptionPane.showMessageDialog(this, "팝업창 대화상자", buttonList.get(3).getText(), JOptionPane.QUESTION_MESSAGE);
    }
  }
}
