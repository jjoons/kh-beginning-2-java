package account; // 폴더를 나눈다

// 접근 제어자
// private: Bank 객체 이외에 다른 클래스 접근 금지
// public
// protected
// () 
class Bank {
	private String accName;
	private String accNum;
	private String accPw;
	private int balance;

	public Bank() {}

	Bank(String accName, String accNum, String accPw, int balance) {
		this.accName = accName;
		this.accNum = accNum;
		this.accPw = accPw;
		this.balance = balance;
	}

	// 외부에서 입금할 수 있는 기능
	public int 입금(int money) {
		if (money <= 0) {
			System.out.println("0원 이하는 입금할 수 없습니다");
			return 0;
		}

		this.balance += money;
		System.out.println("현재 잔액: " + this.balance);
		return money;
	}

	// 외부에서 출금할 수 있는 기능
	public int 출금(int money) {
		// 내 통장 잔액 50만원인데 20만원 출금해줘

		if (this.balance < money) {
			System.out.println("한도초과");
			return 0;
		}

		this.balance -= money;
		return money;
	}

	public int getBalance() {
		return balance;
	}

	void info() {
		System.out.println("계좌명     : " + accName);
		System.out.println("계좌번호    : " + accNum);
		System.out.println("계좌비밀번호 : " + accPw);
		System.out.println("잔액      : " + balance + "원");
	}

}

public class Main {
	public void ex1() {
		Bank seohee = new Bank();

		//		seohee.balance = 100_000_000;
		//		// main 클래스 seohee 잔액에 직접 접근 가능
		//		System.out.println(seohee.balance);
		//
		//		// main 클래스가 내 돈을 출금해 갈 수 있다
		//		seohee.balance -= 500000;

	}

	public void ex1_1() {
		Bank seohee = new Bank();
		// 객체 변수에 직접 저장한 게 아니라
		// 함수를 이용해서 간접적으로 저장한다
		seohee.입금(500_000);

		// 출금
		int money = seohee.출금(200_000);
		System.out.println(money);
	}

	public static void main(String[] args) {
		new Main().ex1_1();
	}
}
