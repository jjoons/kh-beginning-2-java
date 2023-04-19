package com.kh.practice.book.view;

import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
  private Scanner sc = new Scanner(System.in);
  private BookController bc = new BookController();
  private Book[] bArr;

  public BookMenu() throws Exception {
    try {
      this.bc.makeFile();
    } catch (IOException e) {
      throw new Exception("파일 생성에 실패했습니다.", e);
    }

    try {
      this.bArr = this.bc.fileRead();
    } catch (ClassNotFoundException e) {
      throw new Exception("클래스를 찾지 못 했습니다", e);
    } catch (ClassCastException e) {
      throw new Exception("형 변환 실패", e);
    } catch (IOException e) {
      throw new Exception("IO Error", e);
    }
  }

  public void mainMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("""
          1. 도서 추가 저장
          2. 저장 도서 출력
          9. 프로그램 끝내기
          """);

      int sel = -1;
      while (true) {
        try {
          System.out.println("메뉴 번호: ");
          sel = this.sc.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("숫자만 입력할 수 있습니다");
        } finally {
          this.sc.nextLine();
        }
      }

      switch (sel) {
        case 1 -> this.fileSave();
        case 2 -> this.fileRead();
        case 9 -> {
          System.out.println("프로그램 종료");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      }
    }
  }

  public void fileSave() {
    System.out.println("도서명: ");
    String bookName = this.sc.nextLine();

    System.out.println("저자명: ");
    String authorName = this.sc.nextLine();

    int bookPrice = -1;
    while (true) {
      System.out.println("도서가격: ");
      try {
        bookPrice = this.sc.nextInt();
        break;
      } catch (InputMismatchException e) {
        System.out.println("정수만 입력할 수 있습니다");
      } finally {
        this.sc.nextLine();
      }
    }

    Calendar calendar = null;

    while (true) {
      System.out.println("출판 날짜(yyyy-mm-dd): ");
      String date = this.sc.next();
      this.sc.nextLine();

      try {
        String[] splitedDate = date.split("-");
        calendar = Calendar.getInstance();

        int year = Integer.parseInt(splitedDate[0]);
        int month = Integer.parseInt(splitedDate[1]);
        int day = Integer.parseInt(splitedDate[2]);

        calendar.set(year, month, day);
        break;
      } catch (PatternSyntaxException e) {
        System.out.println("\"-\"를 붙여서 입력해주세요");
      } catch (NumberFormatException e) {
        System.out.println("연월일은 숫자만 입력할 수 있습니다");
      }
    }

    double discountRate = -0.1;
    while (true) {
      System.out.println("할인율: ");
      try {
        discountRate = this.sc.nextDouble();
        break;
      } catch (InputMismatchException e) {
        System.out.println("실수만 입력할 수 있습니다");
      } finally {
        this.sc.nextLine();
      }
    }

    Book book = new Book(bookName, authorName, bookPrice, calendar, discountRate);


    try {
      this.bc.fileSave(bArr);
    } catch (IOException e) {
      System.out.println("저장에 실패했습니다.");
    }
  }

  public void fileRead() {

  }
}
