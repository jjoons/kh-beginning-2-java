package problem.a3;

public class AccountMain {
  public static void main(String[] args) {
    //    Account myAccount = new Account("계좌", 1234);
    //
    //    ATM motherAtm = new ATM(myAccount, "엄마");
    //    ATM fatherAtm = new ATM(myAccount, "아빠");
    //    ATM myAtm = new ATM(myAccount, "나");
    //
    //    motherAtm.withdraw();
    //
    //    myAccount.start();

    Account2 myAccount2 = new Account2();

    ATM2 motherAtm2 = new ATM2(myAccount2, "엄마");
    ATM2 fatherAtm2 = new ATM2(myAccount2, "아빠");
    ATM2 myAtm2 = new ATM2(myAccount2, "나");

    motherAtm2.start();
    fatherAtm2.start();
    myAtm2.start();
  }
}
