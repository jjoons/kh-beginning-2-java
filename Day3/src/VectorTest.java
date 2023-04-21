import java.util.Scanner;

class VectorTestC {
  public void problem1() {
    // TODO
    Scanner sc = new Scanner(System.in);

    // 이름을 저장하는 배열 (백터 구조)
    // 학번을 저장하는 배열, 정수를 저장하는 배열
    int[] studentID = null;
    int[] scores = null;

    int count = 0;

    while (true) {
      System.out.println();
      System.out.println("1. 학번 및 점수 추가");
      System.out.println("2. 학번 및 점수 삭제");
      System.out.println("3. 학번 및 점수 조회");
      System.out.println("4. 학번 및 점수 파일 저장");
      System.out.println("0. 종료");
      int select = sc.nextInt();

      switch (select) {
        case 1: // 추가
          if (count == 0) {
            studentID = new int[1];
            scores = new int[1];
          } else {
            int[] oldStudentIDs = studentID;
            int[] oldScores = scores;

            // 새로운 값을 넣기 위해서 count + 1로 새 공간을 만듦
            int[] newStudentIDs = new int[count + 1];
            int[] newScores = new int[count + 1];

            for (int i = 0; i < scores.length; i++) {
              newStudentIDs[i] = oldStudentIDs[i];
              newScores[i] = oldScores[i];
            }

            System.out.println("새로운 학생 학번 입력");
            newStudentIDs[count] = sc.nextInt();

            System.out.println("새로운 학생 점수 입력");
            newScores[count] = sc.nextInt();

            // 값이 추가되었으니 count의 값을 올림
            count++;
          }

          System.out.println("학번 입력: ");
          studentID[studentID.length - 1] = sc.nextInt();
          System.out.println("점수 입력: ");
          scores[scores.length - 1] = sc.nextInt();

          count++;

          break;

        case 2: // 삭제

          break;

        case 3: // 조회

          break;

        case 4: // 파일 저장

          break;

        case 0: // 종료
          return;

        default: // 지정되지 않은 번호 입력
          System.out.println("1~4, 0번 중 올바른 번호를 눌러주시기 바랍니다");
          break;
      }

      // 2, 3번은 학번 기준
      // 학번 조회하면
      // 1. 전체출력 2. 조회하는 학번 내용

    }
  }

  public void problem1Solution() {

  }
}


public class VectorTest {
  public static void main(String[] args) {
    VectorTestC c = new VectorTestC();

  }
}
