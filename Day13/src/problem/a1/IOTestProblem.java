package problem.a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTestProblem {
  public final String FILE_ADDRESS_1 = "problem_a1_result/test.txt";
  public final int MAX_LINE = 100;

  /*
   * 1. 파일명 "test.txt"로 저장, 폴더는 현재 기본 폴더
   *   출력
   *     1번 줄 출력했습니다.
   *     2번 줄 출력했습니다.
   *     ... 
   *     100번 줄 출력했습니다.
   *   위에 있는 내용을 문자만 저장
   */
  public void no1() {
    try (FileWriter fw = new FileWriter(this.FILE_ADDRESS_1);
        BufferedWriter bw = new BufferedWriter(fw)) {
      for (int i = 1; i <= this.MAX_LINE; i++) {
        bw.write(i + "번째 줄 출력했습니다.\n");
      }

      // bw.close(); // AutoCloseable이 구현되어 있어서 필요없음
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  /*
   * 2. 읽기 (반복문)
   */
  public void no2() {
    String text = "";

    try (FileReader fr = new FileReader(this.FILE_ADDRESS_1);
        BufferedReader br = new BufferedReader(fr)) {
      for (int i = 1; i <= this.MAX_LINE; i++) {
        text += br.readLine() + "\n";
      }

      System.out.println(text);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public final String FILE_ADDRESS_2 = "problem_a1_result/student.txt";

  /* 
   * 3. 배열을 이용해서 파일 저장
   *   파일명: student.txt
   *   저장할 내용
   *     김철수/20,이만수/30,이영희/40
   */
  public void no3() {
    String[] students = new String[] {"김철수", "이만수", "이영희"};
    int[] studentAges = new int[] {20, 30, 40};

    try (FileWriter fw = new FileWriter(this.FILE_ADDRESS_2);
        BufferedWriter bw = new BufferedWriter(fw)) {
      String saveText = "";

      for (int i = 0; i < students.length; i++) {
        saveText += students[i] + "/" + studentAges[i] + (i < students.length - 1 ? "," : "");
      }

      bw.write(saveText);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  /* 
   * 4. 읽기
   *   출력
   *     이름: 김철수
   *     나이: 20
   * 
   *     이름: 이만수
   *     나이: 30
   */
  public void no4() {
    try (FileReader fr = new FileReader(this.FILE_ADDRESS_2);
        BufferedReader br = new BufferedReader(fr)) {
      String text = br.readLine();
      String[] students = text.split(",");

      for (int i = 0; i < students.length; i++) {
        String student = students[i];
        String[] studen = student.split("/");

        String name = studen[0];
        String age = studen[1];

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    IOTestProblem t = new IOTestProblem();
    t.no1();
    t.no2();
    t.no3();
    t.no4();
  }
}
