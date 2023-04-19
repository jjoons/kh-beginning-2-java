package com.kh.practice.book.controller;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

import java.io.File;
import java.io.IOException;

public class BookController {
  private BookDAO bd = new BookDAO();
  private File file = new File(BookDAO.BOOK_FILE_PATH);

  public void makeFile() throws IOException {
    this.file.createNewFile();
  }

  public void fileSave(Book[] bArr) throws IOException {
    this.bd.fileSave(bArr);
  }

  public Book[] fileRead() throws ClassNotFoundException, ClassCastException, IOException {
    return this.bd.fileRead();
  }

  public int getCount() {
    return this.bd.getCount();
  }

  public int increaseCount() {
    return this.bd.increaseCount();
  }

  public int decreaseCount() {
    return this.bd.decreaseCount();
  }

  public boolean isMaxCount() {
    return this.bd.isMaxCount();
  }
}
