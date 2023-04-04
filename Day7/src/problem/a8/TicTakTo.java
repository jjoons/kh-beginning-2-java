package problem.a8;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

class Ex10 {
  String[][] game = new String[3][3];

  int turn = 0;
  int win = 0;

  public void start() {

  }
}

public class TicTakTo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Ex10 game = new Ex10();
    int sel;

    while (true) {
      System.out.println("");
      sel = sc.nextInt();

      int a = 7 / 3; // 행
      int b = 7 % 3; // 열
      // game.game[][];
    }
  }
}
