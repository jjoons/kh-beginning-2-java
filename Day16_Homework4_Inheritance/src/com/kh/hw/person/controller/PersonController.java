package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
  public final int MAX_STUDENT_COUNT = 3;
  public final int MAX_EMPLOYEE_COUNT = 10;
  private Student[] s = new Student[MAX_STUDENT_COUNT];
  private Employee[] e = new Employee[MAX_EMPLOYEE_COUNT];
  private int studentCount = 0;
  private int employeeCount = 0;

  public int[] personCount() {
    return new int[] {this.studentCount, this.employeeCount};
  }

  public void insertStudent(String name, int age, double height, double weight, int grade,
      String major) {
    this.s[this.studentCount++] = new Student(name, age, height, weight, grade, major);
  }

  public Student[] printStudent() {
    return this.s;
  }

  public void insertEmployee(String name, int age, double height, double weight, int salary,
      String dept) {
    this.e[this.employeeCount++] = new Employee(name, age, height, weight, salary, dept);
  }

  public Employee[] printEmployee() {
    return this.e;
  }

  public boolean isStudentFull() {
    return this.studentCount >= this.MAX_STUDENT_COUNT;
  }

  public boolean isEmployeeFull() {
    return this.employeeCount >= this.MAX_EMPLOYEE_COUNT;
  }
}
