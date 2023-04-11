package problem.a2;

public class AccountMain {
  public static void main(String[] args) {
    /*
     * Class명 : Account
     * 속성 : no(계좌), name(예금주), money(잔액)
     * 생성자(기본 생성자 – 매개변수 O )
     * no=x
     * name=y
     * money=z
     * 기능 : deposit() , withdraw()
     * deposit() : 매개변수만큼 예금(단위 만원)
     * withdraw() : 매개변수 만큼 출금(단위 만원)
     * 출금액이 부족하면 한도 초과로 예외 처리
     * 
     * check(): 비밀번호를 입력받는다
     *          계좌 등록 시 입력한 비밀번호 현재 입력 비밀번호 비교
     *          맞다면 출금 함수 호출
     *          예외적인 상황이 발생하면 "비밀번호가 맞지 않습니다 확인하세요"
     * 
     * 체크카드 발급
     *   카드번호, 카드 비밀번호: 외부에서 접근이 불가능하게 private으로 설정
     *   
     * Account 계좌의 내용을 체크카드가 상속하는 구조
     * pay() 메소드를 만들어서 결제할 카드 금액을 Acccount가 가지고 있는
     *   출금 메소드로 넘겨서 결과를 돌려받는다. 카드 금액만큼 결제되면 결제 완료!
     *   예외적인 상황이 발생하면 "한도 초과"
     * 
     * 카드로 결제를 합니다
     */

    Account a = new Account("1234-5678-90", "이준성", 1000000, 1234);
    CheckCard c = new CheckCard("1234-5678-90", "이준성", 1000000, 1234, "1234-5678-9012-3456", 2345);

    try {
      a.check();
      c.pay();
    } catch (Exception e) {
      System.out.println("오류 발생: " + e.getMessage());
    }
  }
}
