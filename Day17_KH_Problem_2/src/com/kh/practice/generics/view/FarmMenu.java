package com.kh.practice.generics.view;

import java.util.HashMap;
import java.util.Scanner;
import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
  private Scanner sc = new Scanner(System.in);
  private FarmController fc = new FarmController();

  public void mainMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("========== KH 마트 ==========");
      System.out.println("""
          ******* 메인 메뉴 *******
          1. 직원메뉴
          2. 손님 메뉴
          9. 종료
          """);

      System.out.println("메뉴 번호 선택: ");
      int sel = -1;
      try {
        sel = this.sc.nextInt();
      } catch (Exception e) {
        System.out.println();
      } finally {
        this.sc.nextLine();
      }

      switch (sel) {
        case 1 -> this.adminMenu();
        case 2 -> this.customerMenu();
        case 9 -> {
          System.out.println("프로그램 종료");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void adminMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("""
          ******* 직원 메뉴 *******
          1. 새 농산물 추가
          2. 종류 삭제
          3. 수량 수정
          4. 농산물 목록
          9. 메인으로 돌아가기
          """);

      System.out.println("메뉴 번호 선택: ");
      int sel = -1;
      try {
        sel = this.sc.nextInt();
      } catch (Exception e) {
        System.out.println();
      } finally {
        this.sc.nextLine();
      }

      switch (sel) {
        case 1 -> this.addNewKind();
        case 2 -> this.removeKind();
        case 3 -> this.changeAmount();
        case 4 -> this.printFarm();
        case 9 -> {
          System.out.println("프로그램 종료");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void customerMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("""
          ******* 고객 메뉴 *******
          1. 농산물 사기
          2. 농산물 빼기
          3. 구입한 농산물 보기
          9. 메인으로 돌아가기
          """);

      System.out.println("메뉴 번호 선택: ");
      int sel = -1;
      try {
        sel = this.sc.nextInt();
      } catch (Exception e) {
        System.out.println();
      } finally {
        this.sc.nextLine();
      }

      switch (sel) {
        case 1 -> this.buyFarm();
        case 2 -> this.removeFarm();
        case 3 -> this.printBuyFarm();
        case 9 -> {
          System.out.println("프로그램 종료");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void addNewKind() {
    int sel = -1;

    while (true) {
      System.out.println("1. 과일 / 2. 채소 / 3. 견과");
      System.out.println("추가할 종류 번호: ");

      try {
        sel = this.sc.nextInt();

        if (sel > 3 || sel < 1) {
          throw new Exception();
        }

        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    int amount = -1;
    while (true) {
      System.out.println("수량: ");
      try {
        amount = this.sc.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    Farm farm = switch (sel) {
      case 1 -> new Fruit("과일", name);
      case 2 -> new Vegetable("채소", name);
      case 3 -> new Nut("견과", name);
      default -> null;
    };

    if (farm != null && this.fc.addNewKind(farm, amount)) {
      System.out.println("새 농산물이 추가되었습니다.");
    } else {
      System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
    }
  }

  public void removeKind() {
    int sel = -1;

    while (true) {
      System.out.println("1. 과일 / 2. 채소 / 3. 견과");
      System.out.println("삭제할 종류 번호: ");

      try {
        sel = this.sc.nextInt();

        if (sel > 3 || sel < 1) {
          throw new Exception();
        }

        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    int amount = -1;
    while (true) {
      System.out.println("수량: ");
      try {
        amount = this.sc.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    Farm farm = switch (sel) {
      case 1 -> new Fruit("과일", name);
      case 2 -> new Vegetable("채소", name);
      case 3 -> new Nut("견과", name);
      default -> null;
    };

    if (farm != null && this.fc.removeKind(farm)) {
      System.out.println("농산물 삭제에 성공하였습니다.");
    } else {
      System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
    }
  }

  public void changeAmount() {
    int sel = -1;

    while (true) {
      System.out.println("1. 과일 / 2. 채소 / 3. 견과");
      System.out.println("수정할 종류 번호: ");

      try {
        sel = this.sc.nextInt();

        if (sel > 3 || sel < 1) {
          throw new Exception();
        }

        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    int amount = -1;
    while (true) {
      System.out.println("수정할 수량: ");
      try {
        amount = this.sc.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      } finally {
        this.sc.nextLine();
      }
    }

    Farm farm = switch (sel) {
      case 1 -> new Fruit("과일", name);
      case 2 -> new Vegetable("채소", name);
      case 3 -> new Nut("견과", name);
      default -> null;
    };

    if (farm != null && this.fc.changeAmount(farm, amount)) {
      System.out.println("농산물 수량이 수정되었습니다.");
    } else {
      System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
    }
  }

  public void printFarm() {
    // TODO
    HashMap<? extends Farm, Integer> farms = this.fc.printFarm();
    farms.keySet().forEach(t -> {
      System.out.println(t.getKind() + ": " + "(" + ")");
    });

  }

  public void buyFarm() {}

  public void removeFarm() {}

  public void printBuyFarm() {}


}
