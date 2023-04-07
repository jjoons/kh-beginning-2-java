package menu;

import javax.swing.*;

public class MenuMain extends JFrame {
  public MenuMain() {
    this.setTitle("메뉴 만들기");
    this.setSize(400, 200);

    // 메뉴들에 관한 명령문을 저장하는 메소드
    this.init();

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);


  }

  public void init() {
    // 1. 메뉴바 만들기
    JMenuBar menuBar = new JMenuBar();

    // 2. 메뉴
    JMenu menu1 = new JMenu("File");
    menuBar.add(menu1);

    JMenu menu2 = new JMenu("Edit");
    menuBar.add(menu2);

    JMenu menu3 = new JMenu("Help");
    menuBar.add(menu3);

    // 3. 항목 만들기
    JMenuItem menu1Item1 = new JMenuItem("New");
    menu1Item1.addActionListener(e -> {
      JMenuItem menu = (JMenuItem) e.getSource();
      menu.setText("아무 것도 없다");
      // JOptionPane.showMessageDialog(this, "파일 새로 만들기");
    });
    // File 메뉴에 붙인다(추가한다) .add();
    menu1.add(menu1Item1);

    JMenuItem menu1Item2 = new JMenuItem("Open");
    menu1.add(menu1Item2);

    // 프레임에 메뉴 설정 setJMenuBar(메뉴바객체)
    this.setJMenuBar(menuBar);
  }

  public static void main(String[] args) {
    new MenuMain();
  }
}
