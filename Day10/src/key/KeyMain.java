package key;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMain extends JFrame implements KeyListener {
  public KeyMain() {
    // Adapter 클래스
    //   - 여러 개의 인터페이스를 오버라이딩할 때 실제 사용되는 메소드 1 or 2
    //     원하는 인터페이스만 오버라이딩해서 사용할 수 있게 만든 Adapter 클래스
    //   - 인터페이스의 메소드가 하나인 경우에는 어댑터 클래스가 없다
    this.setTitle("키 어댑터");
    this.setSize(400, 200);

    JLabel l = new JLabel("키 어댑터", JLabel.CENTER);
    JTextField t = new JTextField(10);

    // BorderLayout.add("위치", 컴포넌트);
    //   "North" 문자열로 주고 앞글자는 대문자

    this.add("North", t);
    this.add("Center", l);

    t.addKeyListener(new MyAdapter(l, t));

//    this.addKeyListener(this);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  // Key 이벤트
  //   사용자가 키를 입력할 때 발생하는 이벤트
  public static void main(String[] args) {
    new KeyMain();
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // System.out.println("타이핑: " + e.getKeyChar());
  }

  @Override
  public void keyPressed(KeyEvent e) {
    // getKeyChar()
    //   ASCII 코드 값을 기점으로 문자 표시. 특수 기호가 나오지 않는다
    System.out.println("키 누름: " + e.getKeyChar() + " / " + e.getKeyCode());
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // System.out.println("키 땜: " + e.getKeyChar());
  }

  // 내부 클래스
  //   클래스가 클래스 안으로 들어간다
  //   멤버 변수, 멤버 메소드
  class MyAdapter extends KeyAdapter {
    JLabel l = null;
    JTextField t = null;

    public MyAdapter(JLabel l, JTextField t) {
      this.l = l;
      this.t = t;
    }

    @Override
    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        l.setText(t.getText());
      }
    }
  }
}
