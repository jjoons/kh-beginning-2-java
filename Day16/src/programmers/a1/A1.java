package programmers.a1;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */

public class A1 {
  public static int[] solution(int[] array, int[][] commands) throws IndexOutOfBoundsException {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int start = commands[i][0] - 1; // 1
      int end = commands[i][1] - 1; // 4
      int count = end - start + 1;
      int targetIndex = commands[i][2] - 1; // 2
      int[] arr = new int[count];

      for (int j = 0, k = start; j < arr.length; j++, k++) {
        arr[j] = array[k];
      }

      Arrays.sort(arr);

      answer[i] = arr[targetIndex];
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {4, 6, 2}};

    int[] result = solution(array, commands);
    System.out.println(Arrays.toString(result));
  }
}
