import java.text.DecimalFormat;

/*
 *   클래스명: Bank 
 *   은행의 정보 
 *     계좌명     
 *     계좌번호 
 *     계좌비밀번호
 *     잔액  
 * 
 *   생성자를 이용해서 만들기 
 *   기본생성자 하나 
 *   생성자 (멤버필드 모두 다 받는 생성자)
 * 
 * 	 void info()  함수만들기 
 *               출력 형태 
			 * 	   계좌명     : 서희의저축통장  
			 *     계좌번호    : 3333-323213-112
			 *     계좌비밀번호 : 1234
			 *     잔액       : 10원 
			 *     
			 *     위에 처럼 출력하기 
			 *     
			 *     본인 계좌 정보로 객체 생성해서 출력하기 
 * 
 * 
 * 
 */
class Bank {
	private String name;
	private String number;
	private String pw;
	private int balance;

	public Bank(String name, String number, String pw, int balance)
			throws Exception {
		this.name = name;
		this.number = number;
		this.setPw(pw);
		this.balance = balance;
	}

	public void setPw(String pw) throws Exception {
		if (pw.length() != 4) {
			throw new Exception("비밀번호는 4자리여야합니다.");
		}
	}

	public String getBalanceComma() {
		return new DecimalFormat("#,###").format(balance);
	}

	public void info() {
		System.out.println("계좌명: " + this.name);
		System.out.println("계좌번호: " + this.number);
		System.out.println("계좌비밀번호: " + this.pw);
		System.out.println("잔액: " + this.getBalanceComma() + "원");
	}
}

public class ClassEx04Problem3 {
	public static void main(String[] args) {
		try {
			Bank bank = new Bank("ㅇㅇ은행 일반계좌", "1234-4567-7890", "9876", 10_000_000);
			bank.info();
		} catch (Exception e) {}
	}
}
