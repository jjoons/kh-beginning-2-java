package problem.a3;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class NotePad extends JFrame {
  JMenuBar menuBar = new JMenuBar();

  JTextArea textArea = new JTextArea();
  JScrollPane scrollPane = new JScrollPane(this.textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

  boolean isAutoLine = false;

  public NotePad() {
    this.setSize(600, 400);
    this.setTitle("메모장");

    this.initFileMenu();
    this.initFormMenu();
    this.initHelpMenu();
    this.setJMenuBar(this.menuBar);

    this.initTextField();

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void initFileMenu() {
    JMenu file = new JMenu("파일(F)");
    file.setMnemonic(KeyEvent.VK_F);

//    JMenuItem fileNew = new JMenuItem("새로 만들기");
//    file.add(fileNew);
//
//    JMenuItem fileNewWindow = new JMenuItem("새 창");
//    file.add(fileNewWindow);
//
//    JMenuItem fileOpen = new JMenuItem("열기");
//    file.add(fileOpen);
//
//    JMenuItem fileSave = new JMenuItem("저장");
//    file.add(fileSave);
//
//    JMenuItem fileSaveOtherName = new JMenuItem("다른 이름으로 저장");
//    file.add(fileSaveOtherName);
//
//    JSeparator fileSeparator1 = new JSeparator();
//    file.add(fileSeparator1);
//
//    JMenuItem filePageSettings = new JMenuItem("페이지 설정");
//    file.add(filePageSettings);
//
//    JMenuItem filePrint = new JMenuItem("인쇄");
//    file.add(filePrint);
//
//    JSeparator fileSeparator2 = new JSeparator();
//    file.add(fileSeparator2);

    JMenuItem fileExit = new JMenuItem("끝내기");
    fileExit.addActionListener(e -> System.exit(0));
    file.add(fileExit);

    this.menuBar.add(file);
  }

  public void initFormMenu() {
    JMenu form = new JMenu("서식(O)");
    form.setMnemonic(KeyEvent.VK_O);

    JCheckBoxMenuItem formAutoLine = new JCheckBoxMenuItem("자동 줄 바꿈", false);
    formAutoLine.addActionListener(e -> {
      formAutoLine.setSelected(this.isAutoLine = !this.isAutoLine);
      textArea.setLineWrap(this.isAutoLine);
      this.scrollPane.setHorizontalScrollBarPolicy(this.isAutoLine ? ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER : ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    });
    form.add(formAutoLine);

//    JMenuItem font = new JMenuItem("글꼴");
//    font.addActionListener(e -> {
//      // textArea.setFont(selectedFont);
//    });
//    form.add(font);

    this.menuBar.add(form);
  }

  public void initHelpMenu() {
    JMenu help = new JMenu("도움말(H)");
    help.setMnemonic(KeyEvent.VK_H);

//    JMenuItem helpViewHelp = new JMenuItem("도움말 보기");
//    help.add(helpViewHelp);
//
//    JMenuItem helpSendFeedback = new JMenuItem("피드백 보내기");
//    help.add(helpSendFeedback);
//
//    JSeparator separator1 = new JSeparator();
//    help.add(separator1);

    JMenuItem helpNotepadInfo = new JMenuItem("메모장 정보");
    helpNotepadInfo.addActionListener(e -> {
      String textMessage = """
        메모장

        불러오기나 저장 기능없는 허접한 메모장..

        Made by JS
        Version: 20230407 1
        """;
      JOptionPane.showMessageDialog(null, textMessage, "메모장 정보", JOptionPane.INFORMATION_MESSAGE);
    });
    help.add(helpNotepadInfo);

    this.menuBar.add(help);
  }

  public void initTextField() {
    // this.textArea.setAutoscrolls(true);
    // this.textArea.setLineWrap(true); // 줄 바꿈
    // textArea.setWrapStyleWord(true); // 문장 단위

    this.add(scrollPane);
  }
}
