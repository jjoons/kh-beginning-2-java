import java.util.Scanner;

public class AdministrationProblem {

  public static void main(String[] args) {
    int[][] apt = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}};

    int[][] pay = {{1000, 2100, 1300}, {4100, 2000, 1000}, {3000, 1600, 800}};

    // 문제 1) 각층별 관리비 합 출력
    // 정답 1) 4400, 7100, 5400

    for (int i = 0; i < pay.length; i++) {
      int administrationTotal = 0;

      for (int j = 0; j < pay[i].length; j++) {
        administrationTotal += pay[i][j];
      }

      System.out.print(administrationTotal + (pay.length - 1 > i ? ", " : ""));
    }

    System.out.println();

    // 문제 2) 호를 입력하면 관리비 출력
    // 예    2) 입력 : 202	관리비 출력 : 2000
    Scanner sc = new Scanner(System.in);
    System.out.println("호수 입력: ");
    int inputValue = sc.nextInt();

    for (int i = 0; i < apt.length; i++) {
      for (int j = 0; j < apt[i].length; j++) {
        if (apt[i][j] == inputValue) {
          System.out.println(pay[i][j]);
        }
      }
    }

    // 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
    // TODO
    // 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)

    // 문제 4) 호 2개를 입력하면 관리비 교체
  }

}
