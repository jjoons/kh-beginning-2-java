package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
  // Exception은 콤마를 이용해서 여러 개를 적용할 수 있음
  public static void fn() throws ArithmeticException, InputMismatchException {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 1 입력: ");
    int num1 = sc.nextInt();

    System.out.println("정수 2 입력: ");
    int num2 = sc.nextInt();
  }

  public static void main(String[] args) {
    // 호출한 곳으로 예외를 던진다 (양도)
    try {
      fn();
    } catch (Exception e) {
      e.printStackTrace();
    }
    // 예외를 함수 안에 넣고 방복적으로 호출해서 처리하는 것 보다는
    // 한 곳에서 처리를 해 주는 것이 좋다
  }
}
