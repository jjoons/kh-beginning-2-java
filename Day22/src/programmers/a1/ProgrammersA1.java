package programmers.a1;

import java.util.Scanner;

/* 
 * https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */

public class ProgrammersA1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("문자 입력: ");
    String str = sc.next();

    if (str.length() <= 10 && str.length() >= 1) {
      char[] arr = str.toCharArray();

      for (char z : arr) {
        System.out.println(z);
      }
    } else {
      System.out.println("문자열이 1글자 미만이거나 10글자가 넘습니다");
    }
  }
}
