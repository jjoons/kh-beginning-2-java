package problem.a9;

import java.util.Random;

public class DiceSolution {
  public static void main(String[] args) {
    Random r = new Random();

    // 배열
    int[] d = new int[6];

    for (int i = 0; i < 100; i++) {
      int index = r.nextInt(6) + 1;
      // 2 -> 1 카운트
      // d[index - 1]++;
    }
  }
}
