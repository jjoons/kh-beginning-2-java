package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;
import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

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
}
