package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
  public void practice1() {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 입력: ");
    int inputValue = sc.nextInt();

    if (inputValue < 1) {
      System.out.println("양수가 아닙니다");
    } else {
      for (int i = 0; i < inputValue; i++) {
        System.out.print(i % 2 == 0 ? "박" : "수");
        System.out.println();
      }
    }
  }

  public void practice2() {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("정수 입력: ");
      int inputValue = sc.nextInt();

      if (inputValue < 1) {
        System.out.println("양수가 아닙니다");
      } else {
        for (int i = 0; i < inputValue; i++) {
          System.out.print(i % 2 == 0 ? "박" : "수");
        }

        System.out.println();

        break;
      }
    }
  }

  public void practice3() {
    Scanner sc = new Scanner(System.in);

    System.out.println("문자열: ");
    String inputString = sc.nextLine();

    System.out.println("문자: ");
    String input = sc.nextLine();

    int count = 0;

    String result = inputString.replace(input, "");
    count = inputString.length() - result.length();

    System.out.println(inputString + " 안에 포함된 " + input + " 개수: " + count);
  }

  public void practice4() {
    Scanner sc = new Scanner(System.in);

    boolean loopState = true;

    while (loopState) {
      System.out.println("문자열: ");
      String inputString = sc.nextLine();

      System.out.println("문자: ");
      String input = sc.nextLine();

      int count = 0;

      String result = inputString.replace(input, "");
      count = inputString.length() - result.length();

      System.out.println(inputString + " 안에 포함된 " + input + " 개수: " + count);

      while (true) {
        System.out.println("더 하시겠습니까? (y/n)");
        String in = sc.nextLine();

        if (in.toLowerCase().equals("y"))
          break;
        else if (in.toLowerCase().equals("n")) {
          loopState = false;
          break;
        } else {
          System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
        }
      }
    }
  }
}
