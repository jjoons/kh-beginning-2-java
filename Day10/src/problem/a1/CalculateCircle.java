package problem.a1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculateCircle extends JFrame {
  public CalculateCircle() {
    this.initConstructor();
    this.setSize(270, 210);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void initConstructor() {
    this.setLayout(null);

    JPanel panel1 = new JPanel();
    panel1.setBounds(30, 0, 200, 30);

    JLabel textField1Label = new JLabel("원의 반지름");
    panel1.add(textField1Label);

    JTextField textField1 = new JTextField(10);
    panel1.add(textField1);

    this.add(panel1);

    JPanel panel2 = new JPanel();
    panel2.setBounds(30, 30, 200, 30);

    JLabel textField2Label = new JLabel("원의 넓이");
    panel2.add(textField2Label);

    JTextField textField2 = new JTextField(10);
    panel2.add(textField2);

    this.add(panel2);

    JPanel panel3 = new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.setBounds(30, 70, 200, 50);

    JTextArea textArea = new JTextArea(20, 3);
    panel3.add(textArea);

    this.add(panel3);

    JPanel panel4 = new JPanel();
    panel4.setBounds(30, 130, 200, 50);

    JButton calcButton = new JButton("계산");
    panel4.add(calcButton);

    JComboBox<String> textColorBox = new JComboBox<>();
    textColorBox.addItem("Red");
    textColorBox.addItem("Blue");
    textColorBox.addItemListener(e -> {
      JComboBox comboBox = (JComboBox) e.getSource();
      switch ((String) comboBox.getSelectedItem()) {
        case "Red":
          System.out.println("Red");
          break;
        case "Blue":
          System.out.println("Blue");
          break;
      }
    });
    panel4.add(textColorBox);

    JButton resetButton = new JButton("리셋");
    panel4.add(resetButton);

    this.add(panel4);
  }

  public static void main(String[] args) {
    // TODO
    new CalculateCircle();
  }
}


