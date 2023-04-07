package a1_solution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculateCircleSolution extends JFrame implements ActionListener, ItemListener, KeyListener {
  // 필드 2개
  JTextField t1, t2;
  // 여러 줄을 입력할 수 있는 클래스
  JTextArea area;
  // 버튼 계산과 리셋
  JButton cal, reset;
  // 드롭다운 메뉴 클래스
  JComboBox cb;

  // JFrame 클래스 기본적으로 BorderLayout
  // 동서남북 가운데. 기본 가운데
  // 생성자 메인 프레임 설정
  public CalculateCircleSolution() {
    this.setTitle("원 넓이 구하기");
    this.setLayout(new BorderLayout(10, 10)); // 여백
    this.setSize(400, 300);

    this.showNorth();
    this.showCenter();
    this.showSouth();

    // 전역 변수 생성자 안에 EventListener 추가
    cal.addActionListener(this);
    reset.addActionListener(this);
    cb.addItemListener(this);

    // 화면 보이기는 무조건 이벤트, 창 크기, 컴포넌트들을 생성한 후 맨 마지막에 넣기
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void showNorth() {
    JPanel pan1 = new JPanel(); // 반지름 필드
    JPanel pan2 = new JPanel(); // 원의 넓이 필드
    JPanel panel = new JPanel(new GridLayout(2, 0));

    JLabel l1 = new JLabel("원의 반지름");
    JLabel l2 = new JLabel("원의 넓이");

    t1 = new JTextField(10);
    t2 = new JTextField(10);

    t1.addKeyListener(this);

    // 보이긴 하지만 비활성화
    // 활성화: true
    t2.setEnabled(false);

    pan1.add(l1);
    pan1.add(t1);

    pan2.add(l2);
    pan2.add(t2);

    // 두 개를 묶어주는 panel 추가
    panel.add(pan1); // Grid 0번째
    panel.add(pan2); //      1번째

    // 메인 패널에 부착
    this.add(panel, BorderLayout.NORTH);
  }

  public void showCenter() {
    // 여러 줄을 입력받는 공간
    JPanel panel = new JPanel();
    // panel.setBackground(Color.WHITE); // println();
    area = new JTextArea(10, 20); // 행, 열
    area.setText("이 영역은 원의 넓이를\n계산하는 과정");
    area.setEditable(false); // 편집 가능 여부
    area.setForeground(Color.RED);

    panel.add(area);
    this.add(panel);
  }

  public void showSouth() {
    String[] color = {"Red", "Blue"};
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

    cal = new JButton("계산");
    cb = new JComboBox<>(color);
    reset = new JButton("리셋");

    // 이벤트 추가
    // cal.addActionListener(this);

    panel.add(cal);
    panel.add(cb);
    panel.add(reset);

    this.add(panel, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    new CalculateCircleSolution();
  }

  void calculate() {
    if (t1.getText().isEmpty()) {
      area.setText("반지름을 입력하세요");
      return;
    }

    String s = t1.getText();

    double radius = Double.parseDouble(s);
    double result = radius * radius * 3.14;

    t2.setText(result + "");
    area.setText(radius + " * " + radius + " * " + 3.14 + " = " + result);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // 이벤트 정보를 가지고 온다. 하지만 어떤 객체인지 모름
    // 최상위 클래스인 Object 타입으로 참조 (다형성)
    Object obj = e.getSource();

    if (obj == cal) {
      // t1 값이 있는지 없는지 확인
      //   1. getText()로 값을 가져옴
      //   2. isEmpty() 비어있다: true, 값이 있다: false
      //     비어있다면 "반지름을 입력하세요"
      //     area에 수정해서 위의 내용 출력
      if (t1.getText().isEmpty()) {
        area.setText("반지름을 입력하세요");
        return;
      }

      // 1. 텍스트 필드에서 값을 가지고 온다.
      String s = t1.getText();

      // 2. String을 실수값으로 변환
      double radius = Double.parseDouble(s);
      double result = radius * radius * 3.14;

      // 3. 계산된 결과를 텍스트 필드에 결과로 수정
      t2.setText(result + "");
      area.setText(radius + " * " + radius + " * " + 3.14 + " = " + result);

      // 텍스트 필드가 비어있으면 실행 X

    } else if (obj == reset) {
      t1.setText("");
      t2.setText("");
      area.setText("이 영역은 원의 넓이를\n계산하는 과정");
    }
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    // 아이템을 배열로 저장했다
    // 인덱스 (방번호)
    // getSelectedIndex() 선택된 index 번호를 가져온다

    int index = cb.getSelectedIndex();

    if (index == 0) {
      area.setForeground(Color.RED);
    } else if (index == 1) {
      area.setForeground(Color.BLUE);
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getSource() == t1 && e.getKeyCode() == 10) {
      this.calculate();
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
}
