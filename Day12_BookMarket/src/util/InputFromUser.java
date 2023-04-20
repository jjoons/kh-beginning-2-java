package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromUser {
  private Scanner sc = null;
  private String integerMismatchMessage = "숫자만 입력할 수 있습니다";
  private String retryMessage = "다시 입력해 주시기 바랍니다";
  private boolean enterThrow = false;
  private String throwMessage = integerMismatchMessage;

  public InputFromUser() {}

  public InputFromUser(Scanner sc) {
    this.sc = sc;
  }

  public Integer integer() {
    return this.integer(Integer.MAX_VALUE, null, null);
  }

  public Integer integer(String message) {
    return this.integer(Integer.MAX_VALUE, message, null);
  }

  public Integer integer(IFunction1<Integer, Boolean> limitComputed) {
    return this.integer(Integer.MAX_VALUE, null, limitComputed);
  }

  public Integer integer(String message, IFunction1<Integer, Boolean> limitComputed) {
    return this.integer(Integer.MAX_VALUE, message, limitComputed);
  }

  public Integer integer(int repeatCount, boolean enterThrow, IFunction1<Integer, Boolean> limitComputed) {
    boolean beforeValue = this.enterThrow;
    this.enterThrow = enterThrow;
    Integer returnValue = this.integer(Integer.MAX_VALUE, null, limitComputed);
    this.enterThrow = beforeValue;

    return returnValue;
  }

  public Integer integer(int repeatCount, String message, IFunction1<Integer, Boolean> limitComputed) {
    Integer sel = null;

    for (int i = 1; i <= repeatCount; i++) {
      if (message != null && !message.isEmpty()) {
        System.out.println(message);
      }

      try {
        sel = this.sc.nextInt();

        if (limitComputed != null && limitComputed.run(sel)) {
          throw new InputMismatchException(this.throwMessage);
        }

        break;
      } catch (InputMismatchException e) {
        sel = null;

        if (integerMismatchMessage != null && !integerMismatchMessage.isEmpty()) {
          System.out.println(this.integerMismatchMessage);
        }

        if (this.enterThrow) throw new InputMismatchException();

        if (retryMessage != null && !retryMessage.isEmpty() && i < repeatCount) {
          System.out.println(this.retryMessage);
        }
      } finally {
        this.sc.nextLine();
      }
    }

    return sel;
  }

  public String getIntegerMismatchMessage() {
    return integerMismatchMessage;
  }

  public void setIntegerMismatchMessage(String integerMismatchMessage) {
    this.integerMismatchMessage = integerMismatchMessage;
  }

  public String getRetryMessage() {
    return retryMessage;
  }

  public void setRetryMessage(String retryMessage) {
    this.retryMessage = retryMessage;
  }

  public String getThrowMessage() {
    return throwMessage;
  }

  public void setThrowMessage(String throwMessage) {
    this.throwMessage = throwMessage;
  }
}
