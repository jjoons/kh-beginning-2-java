package sort;

public class RecursionMain {
  public static void function(int num) throws StackOverflowError {
    System.out.println("반갑습니다");

    if (num == 0) {
      return;
    }

    function(num - 1);
  }

  // 1부터 5까지 합을 구하는 재귀 함수 작성
  public static int function2(int num) {
    if (num == 1) {
      // 함수가 끝나면 마지막 1도 더해야 한다
      return 1;
    }

    return num + function2(num - 1);
  }

  public static void main(String[] args) {
    // 재귀 함수
    //   - 자기 자신을 다시 호출해 문제를 해결하는 함수
    //   - 무한 호출로 StackOverflowError가 발생하는 것을 막기 위해서 끝내는 조건을 줘야 한다
    //   - 새로운 함수를 계속해서 

    try {
      function(5);
      int res = function2(5);
      System.out.println(res);

      // 1부터 n까지의 합 구하기
      // 피보나치수열 구하기
    } catch (StackOverflowError e) {
      System.out.println("재귀 함수 예외 발생: 조건 작성하기");
    }
  }
}
