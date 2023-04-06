package swing;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
  public MyFrame() throws HeadlessException {
    this.setTitle("내가 만든 GUI");
    this.setSize(500, 300);

    JButton btn1 = new JButton("눌렀니?");
    JButton btn2 = new JButton("왜 눌렀냐니까??");

    // 창에 버튼 부착
    // btn1이 밑으로 내려가서 안 보인다
    // 화면 배치(레이아웃)

    this.add(btn1);
    this.add(btn2);

    this.setVisible(true);
  }
}

public class SwingMain {
  public static void main(String[] args) {
    MyFrame frame = new MyFrame();
  }

  void main1() {
    // 자바 GUI
    //   - 그래픽 이용, 사용자가 이해하기 쉬운 모양으로 정보 제공
    //   - 키보드나 마우스를 이용해 입력

    // 그래픽을 하기 위해서 필요한 프레임
    //   창 만드는 프레임

    JFrame window = new JFrame();

    // 프로그램 타이틀
    window.setTitle("내가 만든 GUI");

    // 창 크기 설정. setSize(너비, 높이)
    window.setSize(400, 200);

    // 윈도우 창을 표시 함
    // true: 보임, false: 숨김
    window.setVisible(true);
  }
}
