package problem.a3;

import java.util.Scanner;

public class KakaoBankMain {
  public static void main(String[] args) {
    // 카카오뱅크 (인터페이스, 상속)
    //   카카오뱅크에서 계좌를 관리하는 List (private static)
    //   insert(): 등록하는 함수
    // 
    //   1. 고객 계좌 등록
    //      (입력받아서 Account 객체 생성한 후 고객 관리 리스트에 저장한다)
    //   2. 고객 조회
    //      고객 계좌 번호로 찾을건지
    //      맞는 계좌번호가 있다면 고객의 정보를 출력하는 메소드 이용
    //      없으면 "찾는 고객이 없습니다"
    //   3. 고객 정렬
    //      버블 정렬을 이용해서 정렬. 안에 있는 내용들 출력
    //      고객 ID 추가(문자, 숫자). ID를 기준으로 해서 정렬
    //   0. 종료

    // 예외 처리
    //   메뉴번호 입력할 때 0~3 사이 숫자가 아니면 오류 메시지 출력

    Scanner sc = new Scanner(System.in);
    boolean loopState = true;

    KakaoBank bank = new KakaoBank();

    while (loopState) {
      System.out.println("""
          === 카카오뱅크 ===
          1. 고객 계좌 등록
          2. 고객 조회
          3. 고객 정렬
          0. 종료
          """);
      int inputValue = sc.nextInt();

      switch (inputValue) {
        case 1 -> {
          try {
            bank.insert();
          } catch (KakaoBankException e) {
            System.out.println(e.getMessage());
          }
          break;
        }
        case 2 -> {
          try {
            bank.findWithAccountNumber();
          } catch (KakaoBankException e) {
            System.out.println(e.getMessage());
          }
        }
        case 0 -> {
          loopState = false;
          break;
        }
        default -> {
          try {
            throw new Exception("메뉴 번호를 잘못 입력했습니다");
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }
      }
    }
  }
}
