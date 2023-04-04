package problem.a9;

import java.util.Arrays;
import java.util.Random;

/*
 * 주사위를 100번 던질 것!
 * 1~6 사이에 숫자가 몇 번씩 나왔는지 출력
 *
 * 배열
 *
 * 100번을 던지고 나면
 * 1의 개수: 2
 * 2의 개수: 0
 * 3의 개수: 50
 * 4의 개수: 10
 * 5의 개수: 28
 * 6의 개수: 10
 */
public class Dice {
  public static void main(String[] args) {
    Random r = new Random();
    int[] randomValues = new int[100];
    int[] diceResults = new int[6];

    for (int i = 0; i < randomValues.length; i++) {
      randomValues[i] = r.nextInt(6) + 1;

      switch (randomValues[i]) {
        case 1 -> diceResults[0]++;
        case 2 -> diceResults[1]++;
        case 3 -> diceResults[2]++;
        case 4 -> diceResults[3]++;
        case 5 -> diceResults[4]++;
        case 6 -> diceResults[5]++;
        default -> System.out.println("알 수 없는 숫자: " + diceResults[i]);
      }
    }

    System.out.println("랜덤 값 배열: ");
    System.out.println(Arrays.toString(randomValues));
    System.out.println("1부터 6까지 나온 개수들: ");
    System.out.println(Arrays.toString(diceResults));
  }
}
