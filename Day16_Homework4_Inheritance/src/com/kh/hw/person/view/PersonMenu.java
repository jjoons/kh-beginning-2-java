package com.kh.hw.person.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
  private Scanner sc = new Scanner(System.in);
  private PersonController pc = new PersonController();

  public void mainMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("학생은 최대 " + this.pc.MAX_STUDENT_COUNT + "명까지 저장할 수 있습니다.");
      System.out.println("현재 저장된 학생은 " + this.pc.personCount()[0] + "명입니다.");
      System.out.println("사원은 최대 " + this.pc.MAX_EMPLOYEE_COUNT + "명까지 저장할 수 있습니다.");
      System.out.println("현재 저장된 사원은 " + this.pc.personCount()[1] + "명입니다.");

      System.out.println("1. 학생 메뉴");
      System.out.println("2. 사원 메뉴");
      System.out.println("9. 끝내기");
      int sel = this.sc.nextInt();
      this.sc.nextLine();

      switch (sel) {
        case 1 -> studentMenu();
        case 2 -> employeeMenu();
        case 9 -> {
          System.out.println("종료합니다.");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
      }
    }
  }

  public void studentMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("1. 학생 추가");
      System.out.println("2. 학생 보기");
      System.out.println("9. 메인으로");

      if (this.pc.isStudentFull()) {
        System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 " + "더 이상 활성화 되지 않습니다.");
      }

      System.out.println("메뉴 번호: ");
      int sel = this.sc.nextInt();
      this.sc.nextLine();

      switch (sel) {
        case 9:
          System.out.println("메인으로 돌아갑니다.");
          loopState = false;
          break;

        case 2:
          printStudent();
          break;

        case 1:
          if (!this.pc.isStudentFull()) {
            insertStudent();
            break;
          }

        default:
          System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
          break;
      }
    }
  }

  public void employeeMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("1. 사원 추가");
      System.out.println("2. 사원 보기");
      System.out.println("9. 메인으로");

      if (this.pc.isEmployeeFull()) {
        System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 " + "더 이상 활성화 되지 않습니다.");
      }

      System.out.println("메뉴 번호: ");
      int sel = this.sc.nextInt();
      this.sc.nextLine();

      switch (sel) {
        case 9:
          System.out.println("메인으로 돌아갑니다.");
          loopState = false;
          break;

        case 2:
          printEmployee();
          break;

        case 1:
          if (!this.pc.isEmployeeFull()) {
            insertEmployee();
            break;
          }

        default:
          System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
          break;
      }
    }
  }

  public void insertStudent() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("학생 이름: ");
      String name = this.sc.nextLine();

      int age = 0;
      try {
        System.out.println("학생 나이: ");
        age = this.sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }


      double height = 0;
      try {
        System.out.println("학생 키: ");
        height = this.sc.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }


      double weight = 0;
      try {
        System.out.println("학생 몸무게: ");
        weight = this.sc.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }


      int grade = 0;
      try {
        System.out.println("학생 학년: ");
        grade = this.sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }

      System.out.println("학생 전공: ");
      String major = this.sc.nextLine();

      this.pc.insertStudent(name, age, height, weight, grade, major);

      if (!this.pc.isStudentFull()) {
        System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
        String yn = this.sc.nextLine();

        if (yn.equalsIgnoreCase("n")) {
          loopState = false;
        }
      } else {
        System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 " + "학생 메뉴로 돌아갑니다.");
        loopState = false;
      }
    }
  }

  public void printStudent() {
    for (Student s : this.pc.printStudent()) {
      if (s != null)
        System.out.println(s);
    }
  }

  public void insertEmployee() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("사원 이름: ");
      String name = this.sc.nextLine();

      int age = 0;
      try {
        System.out.println("사원 나이: ");
        age = this.sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }

      double height = 0;
      try {
        System.out.println("사원 키: ");
        height = this.sc.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }

      double weight = 0;
      try {
        System.out.println("사원 몸무게: ");
        weight = this.sc.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("다시 입력해주시기 바랍니다");
      } finally {
        this.sc.nextLine();
      }

      int salary = 0;
      try {
        System.out.println("사원 급여: ");
        salary = this.sc.nextInt();
      } catch (InputMismatchException e) {

      } finally {
        this.sc.nextLine();
      }

      System.out.println("사원 부서: ");
      String dept = this.sc.nextLine();

      this.pc.insertEmployee(name, age, height, weight, salary, dept);

      if (!this.pc.isEmployeeFull()) {
        System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
        String yn = this.sc.nextLine();

        if (yn.equalsIgnoreCase("n")) {
          loopState = false;
        }
      } else {
        System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 " + "사원 메뉴로 돌아갑니다.");
        loopState = false;
      }
    }
  }

  public void printEmployee() {
    for (Employee s : this.pc.printEmployee()) {
      if (s != null)
        System.out.println(s);
    }
  }
}
