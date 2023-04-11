package problem.a4;

import javax.swing.JOptionPane;

// static_inner 클래스 파일을 member2 클래스 파일로 만들고
// 똑같은 내용을 변경해서 똑같은 결과를 출력하세요
//   str = "1번째 멤버 클래스"
class StaticInnerToNonStaticInner {
  private int a = 1;

  public class Inner {
    public String inFun() {
      return a + "번째 static 내부 클래스";
    }
  }
}


public class StaticInnerToNonStaticInnerMain {
  public static void main(String[] args) {
    String str = "1";

    StaticInnerToNonStaticInner outer = new StaticInnerToNonStaticInner();
    StaticInnerToNonStaticInner.Inner inner = outer.new Inner();
    str = inner.inFun();

    JOptionPane.showMessageDialog(null, str);
  }
}
