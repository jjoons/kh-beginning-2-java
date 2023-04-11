package problem.a5;

public class MemberTestMain {
  public static void main(String[] args) {
    MemberAccount a = new MemberAccount("1234-5678-90", "이준성", 1000000, 1234);
    MemberAccount.CheckCard c =
        a.new CheckCard("1234-5678-90", "이준성", 1000000, 1234, "1234-5678-9012-3456", 2345);

    try {
      a.check();
      c.pay();
    } catch (Exception e) {
      System.out.println("오류 발생: " + e.getMessage());
    }
  }
}
