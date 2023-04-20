package problem.a1;

import java.util.Arrays;
import java.util.Random;

public class SelectSortMain2 {
  public static int[] nums;
  public static Random ran = new Random();

  public static void main(String[] args) {
    // 가장 큰 값을 기준으로 뒤에서부터 정렬
    nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = ran.nextInt(20);
    }

    System.out.println("정렬 전");
    System.out.println(Arrays.toString(nums));


    // 1, 50, 2, 46
    for (int i = nums.length - 1; i >= 0; i--) {
      int maxIndex = i;

      for (int j = i - 1; j >= 0; j--) {
        if (nums[j] > nums[i]) {

        }
      }
    }

    System.out.println("정렬 후");
    System.out.println(Arrays.toString(nums));
  }
}
