package sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSortMain {
  public static int[] nums;
  public static Random ran = new Random();

  public static void main(String[] args) {
    nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = ran.nextInt(20);
    }

    System.out.println("정렬 전");
    System.out.println(Arrays.toString(nums));

    for (int i = 1; i < nums.length; i++) {
      // 현재 선택된 원소의 값을 임시 변수에 저장한다
      int temp = nums[i];

      // 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index 변수
      int prev = i - 1;

      // 현재 선택된 원소가 이전 원소보다 작은 경우까지만 반복
      while (prev >= 0 && nums[prev] > temp) {
        // 현재 선택된 원소가 현재 탐색 중인 원소보다 작으면
        // 해당 원소는 다음 인덱스로 밀어버린다
        nums[prev + 1] = nums[prev];

        // 다음 원소 탐색
        prev--;
      }

      // 탐색이 종료된 지점에 현재 선택되어 있던 변수의 값을 삽입해 준다
      nums[prev + 1] = temp;

      System.out.println(Arrays.toString(nums));
    }

    System.out.println("정렬 후");
    System.out.println(Arrays.toString(nums));

    // 삽입 정렬
    //   - 값을 하나하나 비교해서 앞의 데이터와 비교해서
    //     작으면 왼쪽으로, 크면 오른쪽으로
    //   - 초기에는 정렬되어 있지 않다
    //   - 가장 첫번째 원소는 정렬되어있는 상태라고 가정한 뒤 시작
    //   - 자료 배열의 모든 요소를 차례대로 이미 정렬된 배열의 부분과 비교하여 자신의 위치를 찾아서 삽입함

    // 기본 정렬
    //   삽입 정렬, 선택 정렬, 버블 정렬

    // 고급 정렬
    //   퀵 정렬, 병합 정렬, 셀 정렬, 힙 정렬

  }
}
