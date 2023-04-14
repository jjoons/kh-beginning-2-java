package programmers.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java
 */
public class ArrayProblem1 {
  public int[] solution(int[] arr) {

    if (arr.length > 1_000_000)
      return arr;

    ArrayList<Integer> arrList = new ArrayList<>();
    int temp = -1;

    for (int i = 0; i < arr.length; i++) {
      if (temp != arr[i] && arr[i] >= 0 && arr[i] <= 9) {
        arrList.add(arr[i]);
      }

      temp = arr[i];
    }

    Iterator<Integer> iter = arrList.iterator();
    int idx = 0;
    arr = new int[arrList.size()];
    while (iter.hasNext()) {
      arr[idx] = iter.next();
      idx++;
    }

    return arr;
  }

  public static void main(String[] args) {
    ArrayProblem1 ap = new ArrayProblem1();
    Random r = new Random();
    int randomValue = r.nextInt(3) + 4;
    int[] answer = new int[] {1, 1, 3, 3, 0, 1, 1};
    // answer = new int[] {4, 4, 4, 3, 3};
    // answer = new int[] {1, 1, 5, 3, 3, 3, 3, 3, 6, 7, 7};
    answer = new int[] {-1, -1, -1, 3, 3, 4, 1, 10, 10, 15, 2, 2, 10};
    //    int[] answer = new int[randomValue];

    System.out.println(Arrays.toString(answer));

    //    for (int i = 0; i < answer.length; i++) {
    //      answer[i] = r.nextInt(10);
    //    }

    System.out.println(Arrays.toString(answer));

    int[] a = ap.solution(answer);
    System.out.println(Arrays.toString(a));
  }
}
