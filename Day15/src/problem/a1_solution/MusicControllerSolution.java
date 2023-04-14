package problem.a1_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicControllerSolution {
  // 전역 변수
  Scanner sc;

  // 컨트롤러 안에 list를 생성한다
  private ArrayList<MusicSolution> list = new ArrayList<>();

  public MusicControllerSolution() {}

  // 스캐너 만들지 않고 뷰가 가지고 있는 스캐너 사용
  public MusicControllerSolution(Scanner sc) {
    this.sc = sc;
  }

  // 리스트에 추가하는 addList(뮤직객체)
  public int addList(MusicSolution temp) {
    // 뷰 addList()에서 입력받아서 만든 뮤직 클래스의 객체
    // 실제 컨트롤러에 있는 ArrayList에 추가한다 add(뮤직클래스의 객체)
    boolean res = list.add(temp);

    if (res) {
      return 1; // 정상적으로 저장됐다. 이 값은 뷰 -> addList()
    } else {
      return 0; // 비정상적으로 종료 (저장 X)
    }
  }
}
