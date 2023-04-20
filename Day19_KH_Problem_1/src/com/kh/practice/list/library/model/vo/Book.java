package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Object> {
  private String title;
  private String author;
  private String category;
  private int price;

  public Book() {}

  public Book(String title, String author, String category, int price) {
    this.title = title;
    this.author = author;
    this.category = category;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("(%s/%s/%s/%d)", this.title, this.author, this.category, this.price);
  }

  @Override
  public int hashCode() {
    return (this.title + this.author + this.category + this.price).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj instanceof Book book) {
      return this.title.equals(book.getTitle()) && this.author.equals(book.getAuthor())
          && this.category.equals(book.getCategory()) && this.price == book.getPrice();
    }

    return false;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Book book) {
      return this.title.compareTo(book.getTitle());
    }

    return 0;
  }
}
