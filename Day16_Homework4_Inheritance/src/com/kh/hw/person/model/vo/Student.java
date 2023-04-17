package com.kh.hw.person.model.vo;

public class Student extends Person {
  /** 학년 */
  private int grade;
  /** 전공 */
  private String major;

  public Student() {}

  public Student(String name, int age, double height, double weight, int grade, String major) {
    super(name, age, height, weight);
    this.grade = grade;
    this.major = major;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  @Override
  public String toString() {
    return this.getName() + ", " + this.getAge() + ", " + this.getHeight() + ", " + this.getWeight()
        + ", " + this.getGrade() + ", " + this.getMajor();
  }
}
