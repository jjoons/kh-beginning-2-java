package java_api;

import java.util.Random;

/*
 * 자바 API란
 * 자바 API란 미리 만들어진 도구(클래스)이다.
 * 자바 API는 패키지를 통해 제공된다.
 *
 * 패키지
 * 패키지란, 소스코드를 담는 디렉터리이다.
 * 패키지는 관련 코드를 묶거나, 같은 이름의 코드를 구분하기 위해 사용한다.
 *
 * 자바 API 사용 예
 * 자바 API 문서 또는 구글링을 통해 API를 검색한다.
 * 학습 시 많이 사용하는 API로 Math, Random, ArrayList 등이 있다.
 */

public class APIEx {
  public static void main(String[] args) {
    new a.Main();
    new b.Main();

    // 자바 API
    //   - 프로그램을 만들기 위한 도구
    //   - 이를 사용하면 더 편리한 프로그래밍이 가능하다
    //   - 자바 API 패키지로 제공된다

    // 패키지
    //   - 디렉토리 (폴더)
    //   - 중복적인 메소드, 변수, 클래스명

    // import
    //   객체의 위치를 컴파일러에게 알려준다

    // 패키지 역할
    //   - 관련 코드를 하나로 묶어서 관리를 수월하게 한다

    // Math 클래스

    double r1 = Math.random(); // 0 ~ 1 사이의 난수 출력
    System.out.println(r1);

    // 절대값
    double a = Math.abs(-9.81);
    System.out.println(a);

    // max, min
    double m = Math.max(3.14, 12.7);
    System.out.println(m);

    double m2 = Math.min(3.14, 12.7);
    System.out.println(m2);

    // 랜덤
    Random r = new Random();
    int a1 = r.nextInt(); // -(2 ^ 32) - 1 ~ 2 ^ 32 - 1
    double a2 = r.nextDouble(); // Math.random();
    boolean a3 = r.nextBoolean();

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

//    Scanner sc = new Scanner();
//    sc.nextInt();

    // 랜덤
//    Random r = new Random();
  }
}
