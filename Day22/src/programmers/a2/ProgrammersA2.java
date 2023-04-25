package programmers.a2;

/* 
 * https://school.programmers.co.kr/learn/courses/30/lessons/181188
 */

public class ProgrammersA2 {
  public int solution(int[][] targets) {
    // TODO
    int answer = 0;

    for (int i = 0; i < targets.length; i++) {
      int[] s = targets[i];
      double average = 0;

      for (int j = 0; j < s.length; j++) {
        average += s[j];
      }

      average /= s.length;
    }

    return answer;
  }


  public static void main(String[] args) {
    int[][] arr = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
    int result = new ProgrammersA2().solution(arr);

    System.out.println("결과: " + result);
  }
}
