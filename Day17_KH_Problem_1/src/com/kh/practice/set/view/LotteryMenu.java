package com.kh.practice.set.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
  private Scanner sc = new Scanner(System.in);
  private LotteryController lc = new LotteryController();

  public void mainMenu() {
    while (true) {
      System.out.println("""
          ========== KH 추첨 프로그램 ==========
          ******* 메인 메뉴 *******
          1. 추첨 대상 추가
          2. 추첨 대상 삭제
          3. 당첨 대상 확인
          4. 정렬된 당첨 대상 확인
          5. 당첨 대상 검색
          9. 종료
          """);
      System.out.println("메뉴 번호 선택: ");
      int sel = -1;
      try {
        sel = this.sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해 주세요");
      } finally {
        this.sc.nextLine();
      }

      switch (sel) {
        case 1 -> this.insertObject();
        case 2 -> this.deleteObject();
        case 3 -> this.winObject();
        case 4 -> this.sortedWinObject();
        case 5 -> this.searchWinner();
        case 9 -> {
          System.out.println("프로그램 종료.");
          return;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void insertObject() {
    int count = -1;
    try {
      System.out.println("추가할 추첨 대상 수: ");
      count = this.sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("다시 입력해 주세요");
    } finally {
      this.sc.nextLine();
    }

    for (int i = 1; i <= count; i++) {
      System.out.println("이름: ");
      String name = this.sc.nextLine();

      System.out.println("핸드폰 번호('-'빼고): ");
      String phone = this.sc.next();
      this.sc.nextLine();

      Lottery newLottery = new Lottery(name, phone);

      if (this.lc.insertObject(newLottery)) {
        System.out.println(count + "명 추가 완료되었습니다");
        break;
      } else {
        System.out.println("중복된 대상입니다. 다시 입력하세요.");
      }
    }
  }

  public void deleteObject() {
    System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    System.out.println("핸드폰 번호('-'빼고): ");
    String phone = this.sc.next();
    this.sc.nextLine();

    Lottery l = new Lottery(name, phone);

    if (this.lc.deleteObject(l)) {
      System.out.println("삭제 완료 되었습니다.");
    } else {
      System.out.println("존재하지 않는 대상입니다.");
    }
  }

  public void winObject() {
    System.out.println(this.lc.winObject());
  }

  public void sortedWinObject() {
    this.lc.sortedWinObject().forEach(v -> System.out.println(v));

    //    for (Lottery l : this.lc.sortedWinObject()) {
    //      System.out.println(l);
    //    }

    //    Iterator<Lottery> iterator = this.lc.sortedWinObject().iterator();
    //    while (iterator.hasNext()) {
    //      System.out.println(iterator.next());
    //    }
  }

  public void searchWinner() {
    System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    System.out.println("핸드폰 번호('-'빼고): ");
    String phone = this.sc.next();
    this.sc.nextLine();

    Lottery l = new Lottery(name, phone);

    if (this.lc.searchWinner(l)) {
      System.out.println("축하합니다. 당첨 목록에 존재합니다.");
    } else {
      System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
    }
  }
}
