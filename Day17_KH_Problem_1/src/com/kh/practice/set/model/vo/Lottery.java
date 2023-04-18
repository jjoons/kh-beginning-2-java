package com.kh.practice.set.model.vo;

public class Lottery {
  private String name;
  private String phone;

  public Lottery() {}

  public Lottery(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return this.name + "(" + this.phone + ")";
  }

  @Override
  public int hashCode() {
    return (this.name + this.phone).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    else if (obj instanceof Lottery l) {
      return l.getName().equals(this.name) && l.getPhone().equals(this.phone);
    }

    return false;
  }
}
