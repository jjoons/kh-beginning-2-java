package com.kh.practice.book.view;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

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
      e.printStackTrace();
      throw new Exception(e.getMessage(), e);
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
    if (this.bc.isMaxCount()) {
      System.out.println("보관함이 가득 차서 추가로 저장할 수 없습니다");
      return;
    }

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
      } catch (ArrayIndexOutOfBoundsException e) {
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

    this.bArr[this.bc.increaseCount() - 1] = new Book(bookName, authorName, bookPrice, calendar, discountRate);

    try {
      this.bc.fileSave(bArr);
    } catch (IOException e) {
      System.out.println("저장에 실패했습니다.");
    }
  }

  public void fileRead() {
    Book[] books;

    try {
      books = this.bc.fileRead();
    } catch (ClassNotFoundException e) {
      System.out.println("클래스를 찾을 수 없습니다");
      return;
    } catch (IOException e) {
      System.out.println("IO 오류");
      return;
    }

    for (Book book : books) {
      if (book != null) {
        System.out.printf("%s\t%s\t%d\t%s\t%f", book.getTitle(), book.getAuthor(), book.getPrice(),
          book, book.getDiscount());
      }
    }

    System.out.println();
  }
}
