package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
  public void upDown() {
    Scanner sc = new Scanner(System.in);

    Random r = new Random();
    int randomValue = r.nextInt(100) + 1;
    int count = 0;

    while (true) {
      System.out.println("1~100 사이의 임의의 난수를 맞춰보세요: ");
      int input = sc.nextInt();

      if (input > 100 || input < 1) {
        System.out.println("1~100 사이의 숫자를 입력해주세요.");
      } else if (input > randomValue) {
        System.out.println("DOWN !");
        count++;
      } else if (input < randomValue) {
        System.out.println("UP !");
        count++;
      } else if (input == randomValue) {
        System.out.println("정답입니다!!");
        System.out.println(count + "회만에 맞추셨습니다.");
        break;
      }
    }

  }
}
