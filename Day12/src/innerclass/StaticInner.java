package innerclass;

import javax.swing.JOptionPane;

// 클래스 안에 클래스를 작성하는 공간
// 멤버 변수

class Out {
  static int a = 1; // 컴파일하는 동안 static 영역에 메모리 할당

  static class In {
    String inFun() {
      return a + "번째 static 내부 클래스";
    }
  }
}


public class StaticInner {
  public static void main(String[] args) {
    String str = "";

    // 외부 클래스 이름을 적은 다음 내부 클래스의 이름을 적으면 된다
    Out.In obj = new Out.In();
    str = obj.inFun();

    JOptionPane.showMessageDialog(null, str);
  }
}
