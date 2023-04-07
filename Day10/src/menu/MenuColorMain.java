package menu;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenuColorMain extends JFrame {
  public MenuColorMain() {
    this.setTitle("메뉴 만들기");
    this.setSize(400, 200);

    this.init();

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void init() {
    // 나모닉키
    //   마우스를 사용하지 않고 단축키 메뉴에 접근할 수 있도록 설정해 주는 것
    // setMnemonic("니모닉 키에 설정하는 문자");

    JMenuBar menuBar = new JMenuBar();

    JMenu menu1 = new JMenu("File");
    // Alt + F
    menu1.setMnemonic(KeyEvent.VK_F);
    menuBar.add(menu1);

    JMenuItem fileMenuExit = new JMenuItem("Exit");
    fileMenuExit.addActionListener(e -> System.exit(0));
    menu1.add(fileMenuExit);

    JMenu menu2 = new JMenu("Color");
    // Alt + C
    // menu2.setMnemonic(KeyEvent.VK_C);

    menuBar.add(menu2);

    JMenuItem item1 = new JMenuItem("파란색");
    menu2.add(item1);

    JMenuItem item2 = new JMenuItem("빨간색");
    menu2.add(item2);

    JMenuItem item3 = new JMenuItem("노란색");
    menu2.add(item3);

    this.setJMenuBar(menuBar);
  }

  public static void main(String[] args) {
    new MenuColorMain();
  }
}
