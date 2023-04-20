package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;
import com.kh.practice.list.library.model.vo.Book;

public class BookController {
  List<Book> list = new ArrayList<>();

  public BookController() {
    list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
    list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
    list.add(new Book("대화의 기술", "강보람", "인문", 17500));
    list.add(new Book("암 정복기", "박신우", "의료", 21000));
  }

  public void insertBook(Book bk) {
    this.list.add(bk);
  }

  public ArrayList<Book> selectList() {
    return (ArrayList<Book>) this.list;
  }

  public ArrayList<Book> searchBook(String keyword) {
    ArrayList<Book> searchList = new ArrayList<>();

    for (Book book : this.list) {
      if (book.getTitle().equals(keyword)) {
        searchList.add(book);
      }
    }

    return searchList;
  }

  public Book deleteBook(String title, String author) {
    Book removeBook = null;

    for (Book book : list) {
      if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
        list.remove(removeBook = book);
        break;
      }
    }

    return removeBook;
  }

  public int ascBook() {
    this.list.sort((o1, o2) -> {
      if (o1 instanceof Book book1 && o2 instanceof Book book2) {
        return book1.compareTo(book2);
      }

      return 0;
    });

    return 1;
  }
}
