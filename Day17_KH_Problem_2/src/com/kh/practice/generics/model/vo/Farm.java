package com.kh.practice.generics.model.vo;

public class Farm {
  private String kind;

  public Farm() {}

  public Farm(String kind) {
    this.kind = kind;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  @Override
  public String toString() {
    return "Farm toString(): " + this.kind;
  }

  @Override
  public int hashCode() {
    return this.kind.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj instanceof Farm f1) {
      return f1.getKind().equals(this.kind);
    }

    return false;
  }
}
