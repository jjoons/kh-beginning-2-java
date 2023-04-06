package swing;

import javax.swing.*;

class MyText extends JFrame {
  // 글자 10만큼 크기로 생성
  JTextField obj1 = new JTextField(10);

  // 글자로 초기화
  JTextField obj2 = new JTextField("고양이");

  // 강아지로 초기화하고 글자 10개만큼 크기로 생성
  JTextField obj3 = new JTextField("강아지", 10);

  JPanel panel = new JPanel();

  public MyText() {
    this.setSize(500, 300);

    this.panel.add(obj1);
    this.panel.add(obj2);
    this.panel.add(obj3);

    this.add(panel);

    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

public class TextFieldMain {
  public static void main(String[] args) {
    // TextField
    //   - 한 줄짜리 텍스트를 입력하고 수정하는 기능
    //   - 편집을 할 수 있는 텍스트 구성 요소
    //     검색창, 아이디, 댓글창
    //     JTextField(글자수)

    new MyText();
  }
}


