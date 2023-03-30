package account;

/*
 * 지갑 클래스
 *   멤버 변수 private money
 * 
 * 1. 지갑 생성 (50,000)
 * 2. 지갑에서 돈을 꺼낼 것
 * 
 * Main 클래스에서 지갑에 있는 돈 5만원 출력
 * getMoney() 함수를 이용할 것
 */

class Wallet {
	private int money;

	public Wallet(int balance) {
		this.money = balance;
	}

	public int withdraw(int money) {
		if (this.money < money) {
			System.out.println("출금하려는 금액은 잔액보다 클 수 없습니다");
			return 0;
		}

		this.money -= money;
		return money;
	}

	public int getMoney() {
		return this.money;
	}
}

public class MainProblem1 {
	public static void main(String[] args) {
		Wallet w = new Wallet(50_000);
		w.withdraw(20_000);
		System.out.println("남은 잔액은 " + w.getMoney() + "원입니다");
	}
}
