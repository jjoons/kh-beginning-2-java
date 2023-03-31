package methods;

public class ATM {
	// 내가 현재 가지고 있는 money, 입금 금액
	public static int 입금(int money, int addMoney) {
		money += addMoney;
		return money;
	}

	public static int 출금(int money, int recudeMoney) {
		return money;
	}

	public void ex1() {
		// main (나)
		int money = 10_000;

		// 입금
		int 입금후잔액 = 입금(money, 20_000);

		// 입금하고 난 총 잔액 확인. 종 잔액 30,000
		System.out.println(money);
	}

	public static void main(String[] args) {

	}
}
