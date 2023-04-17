package com.kh.hw.person.model.vo;

public class Employee extends Person {
  /** 급여 */
  private int salary;
  /** 부서 */
  private String dept;

  public Employee() {}

  public Employee(String name, int age, double height, double weight, int salary, String dept) {
    super(name, age, height, weight);
    this.salary = salary;
    this.dept = dept;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  @Override
  public String toString() {
    return this.getName() + ", " + this.getAge() + ", " + this.getHeight() + ", "
        + this.getWeight();
  }
}
