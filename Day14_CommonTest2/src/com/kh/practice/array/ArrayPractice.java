package com.kh.practice.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayPractice {
  public void practice1() {
    int[] arr = new int[10];

    for (int i = 1; i <= arr.length; i++) {
      arr[i - 1] = i;
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }

  public void practice2() {
    int[] arr = new int[10];

    for (int i = 10, j = 0; i >= 1; i--, j++) {
      arr[j] = i;
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }

  public void practice3() {
    Scanner sc = new Scanner(System.in);

    System.out.println("양의 정수: ");
    int input = sc.nextInt();

    int[] arr = new int[input];

    for (int i = 1; i <= arr.length; i++) {
      System.out.println(i);
    }
  }

  public void practice4() {
    String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};

    System.out.println(arr[1]);
  }

  public void practice5() {
    // TODO
    Scanner sc = new Scanner(System.in);

    System.out.println("문자열: ");
    int input = sc.nextInt();

    System.out.println("문자: ");
    int input2 = sc.nextInt();
  }

  public void practice6() {
    Scanner sc = new Scanner(System.in);
    String[] arr = {"월", "화", "수", "목", "금", "토", "일"};

    System.out.println("0 ~ 6 사이 숫자 입력: ");
    int in = sc.nextInt();

    if (in < 0 || in >= arr.length) {
      System.out.println("잘못 입력하셨습니다.");
    } else {
      System.out.println(arr[in] + "요일");
    }
  }

  public void practice7() {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수: ");
    int totalIndex = sc.nextInt();

    int[] arr = new int[totalIndex];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("배열 " + i + "번째 인덱스에 넣을 값: ");
      int in = sc.nextInt();
      arr[i] = in;
    }

    int total = 0;

    for (int i : arr) {
      System.out.print(i);
      total += i;
    }

    System.out.println("총 합: " + total);
  }

  public void practice8() {
    Scanner sc = new Scanner(System.in);
    OneParameterFunction<Integer, Boolean> isOdd = v -> v >= 3 && v % 2 == 1;
    int in;

    while (true) {
      System.out.println("정수: ");
      in = sc.nextInt();

      if (isOdd.run(in))
        break;
      else
        System.out.println("다시 입력하세요.");
    }

    int middleNumber = in / 2 + 1;
    int[] arr = new int[in];
    int idx;

    for (idx = 0; idx < middleNumber; idx++) {
      arr[idx] = idx + 1;
    }

    for (int i = middleNumber - 1; idx < arr.length; idx++, i--) {
      arr[idx] = i;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
    }
  }

  public void practice9() {
    Scanner sc = new Scanner(System.in);
    String[] arr = new String[] {"양념", "불닭", "마늘", "옛날"};
    boolean notFound = true;

    System.out.println("치킨 이름을 입력하세요");
    String inputValue = sc.next();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(inputValue)) {
        System.out.println(arr[i] + "치킨 배달 가능");
        notFound = false;
        break;
      }
    }

    if (notFound) {
      System.out.println(inputValue + "치킨은 없는 메뉴 입니다");
    }
  }

  public void practice10() {
    Scanner sc = new Scanner(System.in);

    System.out.println("주민등록번호(- 포함): ");
    String input = sc.next();

    String[] arr = input.split("-");
    char b = arr[1].charAt(0);
    int ba = arr[1].length() - 1;

    String c = "";
    for (int i = 0; i < ba; i++) {
      c += "*";
    }

    System.out.println(arr[0] + "-" + b + c);
  }

  public void practice11() {
    Random r = new Random();
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = r.nextInt(10) + 1;
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public void practice12() {
    Random r = new Random();
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = r.nextInt(10) + 1;
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }

    int min, max;

    Arrays.sort(arr);

    System.out.println();
    System.out.println("최대값: " + arr[arr.length - 1]);
    System.out.println("최소값: " + arr[0]);
  }

  public void practice13() {
    LinkedHashSet<Integer> arr = new LinkedHashSet<>();
    Random r = new Random();

    while (true) {
      arr.add(r.nextInt(10) + 1);

      if (arr.size() >= 10)
        break;
    }

    for (int integer : arr) {
      System.out.print(integer + " ");
    }
  }

  public void practice14() {
    // TODO
    TreeSet<Integer> arr = new TreeSet<>();
    Random r = new Random();
  }

  public void practice15() {
    Scanner sc = new Scanner(System.in);

    System.out.println("문자열: ");
    String input = sc.next();
    LinkedHashSet<Character> arr = new LinkedHashSet<>();

    for (int i = 0; i < input.length(); i++) {
      arr.add(input.charAt(i));
    }

    System.out.println("문자열에 있는 문자: ");

    for (Character character : arr) {
      System.out.print(character + ", ");
    }

    System.out.println("문자 개수: " + arr.size());
  }

  public void practice16() {
    Scanner sc = new Scanner(System.in);

    System.out.println("배열의 크기를 입력하세요: ");
    int in = sc.nextInt();
    sc.nextLine(); // 개행 제거

    String[] arr = new String[in];
    int index = 0;

    while (true) {
      for (; index < arr.length; index++) {
        System.out.println((index + 1) + "번째 문자열: ");
        String inputString = sc.nextLine();
        arr[index] = inputString;
      }

      System.out.println("더 값을 입력하시겠습니까?(Y/N): ");
      String select = sc.next();

      if (select.equalsIgnoreCase("y")) {
        System.out.println("더 입력하고 싶은 개수: ");
        int addCount = sc.nextInt();
        sc.nextLine();

        String[] temp = arr;
        String[] newArray = new String[temp.length + addCount];
        System.arraycopy(temp, 0, newArray, 0, temp.length);

        arr = newArray;
        temp = null;
      } else if (select.equalsIgnoreCase("n")) {
        break;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
