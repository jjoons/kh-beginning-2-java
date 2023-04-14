package problem.a1_solution;

import java.util.Scanner;

public class MusicViewSolution { // 관리하는 클래스
  // 상속이 안 된다
  // 이 Scanner를 사용하려면 지금 생성된 주소값을 넘겨줘야한다
  private Scanner sc = new Scanner(System.in);

  // 실제 화면에서 입력한 것을 처리하는 부분
  private MusicControllerSolution mc = new MusicControllerSolution();

  // 이미 컨트롤러가 만들어 놓은 주소값을 가지고 주소값을 복사해서 저장해서 사용하기
  public void mainMenu() {
    // 메소드가 실행될 때 Scanner 주소값을 넘겨준다


    System.out.println("""
      ******* 메인 메뉴 *******
      1. 마지막 위치에 곡 추가
      2. 첫 위치에 곡 추가
      3. 전체 곡 목록 출력
      4. 특정 곡 검색
      5. 특정 곡 삭제
      6. 특정 곡 정보 수정
      7. 곡명 오름차순 정렬
      8. 가수명 내림차순 정렬
      9. 종료
      """);

    System.out.println("메뉴 입력: ");
    int sel = sc.nextInt();

    // 위에서 메뉴를 선택한 sel 변수가 들어간다
    switch (sel) {
      case 1:
        // 추가 메소드
        addList();

        // 1. 뷰 컨트롤러가 가지고 있는 ArrayList에 접근하기
        // 자신이 가지고 있는 mc 변수가 컨트롤러
//        System.out.println(mc.list.size());

        break;
    }
  }

  // 뷰가 가지고 있는 addList() 함수가 실행된다
  public void addList() {
    // 뮤직에 대한 입력을 받는다
    System.out.println("곡명: ");
    String name = sc.nextLine();

    // 위에서 입력을 받으면 엔터가 남아있다. 버퍼를 비우는 작업
    sc.nextLine();

    System.out.println("가수명: ");
    String sName = sc.nextLine();

    // Music 클래스를 만들어서 한꺼번에 넘겨준다
    MusicSolution temp = new MusicSolution(name, sName);

    // 실제 저장하는 것은 컨트롤러가 한다
    // 뷰 입장에서는 컨트롤러가 가지고 있는 list가 안 보인다
    // addList() 컨트롤러에 메소드를 만들어서 뮤직에 대한 객체의 주소값을 주겠다
    int res = mc.addList(temp); // 컨트롤러의 메소드가 실행되면 리턴값 1
    if (res == 1) {
      System.out.println("추가 완료");
    } else {
      System.out.println("에러");
    }
  }


}
