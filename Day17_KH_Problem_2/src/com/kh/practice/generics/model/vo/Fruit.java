package com.kh.practice.generics.model.vo;

public class Fruit extends Farm {
  private String name;

  public Fruit() {}

  public Fruit(String kind, String name) {
    super(kind);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int hashCode() {
    return (this.getKind() + this.name).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj instanceof Fruit f1) {
      return f1.getKind().equals(this.getKind()) && f1.getName().equals(this.getName());
    }

    return false;
  }
}
