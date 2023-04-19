package com.kh.practice.book.model.dao;

import com.kh.practice.book.model.vo.Book;

import java.io.*;

public class BookDAO {
  public static final int MAX_COUNT = 10;
  public static final String BOOK_FILE_PATH = "./io/book.txt";
  private Book[] bArr = new Book[MAX_COUNT];
  private int count;

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

    try (ObjectInputStream ois = new ObjectInputStream(fis)) {
      for (int i = 0; i < bArr.length; i++) {
        this.bArr[i] = (Book) ois.readObject();
      }
    } catch (EOFException e) {}

    return this.bArr;
  }

  public int getCount() {
    return count;
  }

  public int increaseCount() {
    return ++this.count;
  }

  public int decreaseCount() {
    return --this.count;
  }

  public boolean isMaxCount() {
    return this.count >= MAX_COUNT;
  }
}
