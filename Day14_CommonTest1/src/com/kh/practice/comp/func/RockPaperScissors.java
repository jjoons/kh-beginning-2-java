package com.kh.practice.comp.func;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  private static void printGame(String myName, String me, String computer) {
    System.out.println("컴퓨터: " + computer);
    System.out.println(myName + ": " + me);
  }

  public void rps() {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    ArrayList<String> gameStrings = new ArrayList<>();
    gameStrings.add("가위");
    gameStrings.add("바위");
    gameStrings.add("보");

    System.out.println("당신의 이름을 입력해주세요: ");
    String name = sc.nextLine();

    int win = 0;
    int lose = 0;
    int draw = 0;
    boolean loopState = true;

    while (loopState) {
      int computerI = r.nextInt(3);
      String computerA = gameStrings.get(computerI);

      System.out.println("가위바위보: ");
      String in = sc.next();


      switch (in) {
        case "가위":
          printGame(name, in, computerA);

          if (computerA.equals("보")) {
            System.out.println("이겼습니다!");
            win++;
          } else if (computerA.equals("바위")) {
            System.out.println("졌습니다 ㅠㅠ");
            lose++;
          } else if (computerA.equals("가위")) {
            System.out.println("비겼습니다.");
            draw++;
          }
          break;

        case "바위":
          printGame(name, in, computerA);

          if (computerA.equals("가위")) {
            System.out.println("이겼습니다!");
            win++;
          } else if (computerA.equals("보")) {
            System.out.println("졌습니다 ㅠㅠ");
            lose++;
          } else if (computerA.equals("바위")) {
            System.out.println("비겼습니다.");
            draw++;
          }
          break;

        case "보":
          printGame(name, in, computerA);

          if (computerA.equals("바위")) {
            System.out.println("이겼습니다!");
            win++;
          } else if (computerA.equals("가위")) {
            System.out.println("졌습니다 ㅠㅠ");
            lose++;
          } else if (computerA.equals("보")) {
            System.out.println("비겼습니다.");
            draw++;
          }
          break;

        case "exit":
          int total = win + lose + draw;
          System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
          loopState = false;
          break;

        default:
          System.out.println("잘못 입력하셨습니다.");
          break;
      }
    }
  }
}
