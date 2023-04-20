package sort;

public class BinarySearchMain {
  public static boolean bSearch(int[] arr, int key) {
    int left = 0;
    int right = arr.length - 1;
    int mid; // 반복하면 중간값 계속 변경

    while (left <= right) {
      mid = (left + right) / 2;

      // 중간값보다 크다
      if (arr[mid] < key) {
        left = mid + 1;
      } else if (arr[mid] > key) {
        right = mid - 1;
      } else {
        // 값을 찾았다
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    // 이진 탐색 (이분법)
    //   - 조건: 무조건 정렬이 되어있어야 함
    //   1. 인덱스의 길이를 반으로 나눈다.
    //   2. 중간 기준점을 찾는다.
    //   3. 중간을 기점으로 비교하는 값이 작으면 기준점보다 앞의 범위에서 찾는다
    //      기준점보다 크면 오른쪽 범위 검사

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    // 정렬들을 함수로 작성할 때 원하는 값으로 index 숫자
    boolean res = bSearch(arr, 15);

    if (res) {
      System.out.println("값이 있다");
    } else {
      System.out.println("값이 없다");
    }

    int res2 = 14;
    if (res2 != -1) {
      //      System.out.println(key + res2 + "번째에 있다");
    } else {
      System.out.println("해당 값이 없다");
    }
  }
}
