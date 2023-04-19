package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.kh.practice.book.model.vo.Book;

public class BookDAO {
  private Book[] bArr = new Book[10];
  public static final String BOOK_FILE_PATH = "./io/book.txt";

  public void fileSave(Book[] bArr) throws IOException {
    FileOutputStream fos = new FileOutputStream(BOOK_FILE_PATH);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    for (Book book : bArr) {
      oos.writeObject(book);
    }

    fos.close();
  }

  public Book[] fileRead() throws IOException, ClassNotFoundException, ClassCastException {
    FileInputStream fis = new FileInputStream(BOOK_FILE_PATH);
    ObjectInputStream ois = new ObjectInputStream(fis);

    try {
      for (int i = 0; i < bArr.length; i++) {
        this.bArr[i] = (Book) ois.readObject();
      }
    } catch (EOFException e) {}

    fis.close();

    return this.bArr;
  }
}
