package problem.a2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GameRankProblem {
  public static void close(FileWriter fw, BufferedWriter bw) {
    try {
      //fw.close();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    FileWriter fw = null;
    BufferedWriter bw = null;
    int score = 100;

    try {
      fw = new FileWriter("scorelist.txt", true);
      bw = new BufferedWriter(fw);
    } catch (IOException e) {
      System.out.println(e);
    }

    int com = ran.nextInt(100) + 1;

    // 100점에서 정답을 맞출 때까지 5점 차감
    // scorelist.txt 파일을 만들어서 점수를 저장시키기
    // FileWriter("파일명", 추가 모드 true);

    while (true) {
      if (score <= 0) {
        System.out.println("0점이 되어 게임을 종료합니다");
        close(fw, bw);
        return;
      }

      System.out.println("숫자 입력[1~100] : ");
      int me = scan.nextInt();

      if (com > me) {
        System.out.println("Up!");
        score -= 5;
        System.out.println("남은 점수는 " + score + "점입니다");

      } else if (com < me) {
        System.out.println("Down!");
        score -= 5;
        System.out.println("남은 점수는 " + score + "점입니다");

      } else if (com == me) {
        System.out.println("Bingo!");

        try {
          bw.write(me + "\n");
        } catch (IOException e) {
          System.out.println(e);
        }

        break;
      }
    }

    System.out.println("정답 = " + com);

    close(fw, bw);
  }
}
