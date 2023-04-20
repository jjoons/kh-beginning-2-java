package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;
import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;
import util.InputFromUser;

public class BookMenu {
  private Scanner sc = new Scanner(System.in);
  private BookController bc = new BookController();
  private final InputFromUser in = new InputFromUser(sc);

  public void mainMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("== Welcome KH Library ==");
      System.out.println("""
          =====***** 메인 메뉴 *****=====
          1. 새 도서 추가
          2. 도서 전체 조회
          3. 도서 검색 조회
          4. 도서 삭제
          5. 도서 명 오름차순 정렬
          9. 종료
          """);
      System.out.println("메뉴 번호 입력: ");
      Integer sel = this.in.integer();

      switch (sel) {
        case 1 -> this.insertBook();
        case 2 -> this.selectList();
        case 3 -> this.searchBook();
        case 4 -> this.deleteBook();
        case 5 -> this.ascBook();
        case 9 -> {
          System.out.println("프로그램 종료");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void insertBook() {
    System.out.println("===== 새 도서 추가 ====");
    System.out.println("책 정보를 입력해주세요.");
    System.out.println("도서명: ");
    String bookName = this.sc.nextLine();

    System.out.println("저자명: ");
    String authorName = this.sc.nextLine();

    int genre = in.integer("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타): ", sel -> sel > 4 || sel < 1);

    String category = switch (genre) {
      case 1 -> "인문";
      case 2 -> "과학";
      case 3 -> "외국어";
      case 4 -> "기타";
      default -> null;
    };

    int price = in.integer("가격: ");

    Book newBook = new Book(bookName, authorName, category, price);

    this.bc.insertBook(newBook);
  }

  public void selectList() {
    ArrayList<Book> bookList = this.bc.selectList();

    if (bookList.isEmpty()) {
      System.out.println("존재하는 도서가 없습니다.");
    } else {
      for (Book book : bookList) {
        System.out.println(book);
      }
    }
  }

  public void searchBook() {
    System.out.println("책 이름 입력: ");
    String bookName = this.sc.nextLine();

    ArrayList<Book> searchList = this.bc.searchBook(bookName);
    if (searchList.isEmpty()) {
      System.out.println("검색 결과가 없습니다.");
    } else {
      for (Book book : searchList) {
        System.out.println(book);
      }
    }
  }

  public void deleteBook() {
    System.out.println("도서명 입력: ");
    String bookName = this.sc.nextLine();

    System.out.println("저자명 입력: ");
    String author = this.sc.nextLine();

    Book remove = this.bc.deleteBook(bookName, author);

    if (remove != null) {
      System.out.println("성공적으로 삭제되었습니다.");
    } else {
      System.out.println("삭제할 도서를 찾지 못했습니다.");
    }
  }

  public void ascBook() {
    if (this.bc.ascBook() == 1) {
      System.out.println("정렬에 성공하였습니다.");
    } else {
      System.out.println("정렬에 실패하였습니다.");
    }
  }
}
