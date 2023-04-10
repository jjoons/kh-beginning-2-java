package problem.a3;

public class ATM2 extends Thread {
  Account2 acc;
  int pinNumber;
  String name;

  public ATM2(Account2 acc, String name) {
    this.acc = acc;
    this.name = name;
  }

  public void setPinNumber(int pinNumber) {
    this.pinNumber = pinNumber;
  }

  @Override
  public void run() {
    acc.withdraw(this.name, this.pinNumber);
  }
}
