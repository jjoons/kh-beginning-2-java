package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsMain {
  public static void info(ArrayList<String> arr) {

  }

  public static void main(String[] args) {
    LinkedList<String> list2 = new LinkedList<>();

    // add(): 맨 마지막에 추가
    // 기존 데이터를 복사해서 새로운 배열을 만들어서 저장
    ArrayList<String> list = new ArrayList<>();
    list.add("이서희");
    list.add("강동원");
    list.add("이준기");

    System.out.println(list);

    // 메소드를 이용해서 안에 있는 데이터를 출력하는 메소드 작성
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for (String string : list) {
      System.out.println(string);
    }

    // 컬렉션: 여러 객체를 모아놓은 것
    // 프레임웍: 표준화, 정형화된 체계적인 프로그래밍 방식
    // 컬렉션 프레임워크
    //   - 다수의 객체를 다루기 위한 표준화된 프로그래밍 방식
    //   - 데이터를 쉽고 편하게 다룰 수 있도록 미리 만들어 놓은 자료형

    // 배열 타입의 자료 구조
    //   ArrayList 클래스

    // 컬렉션 (인터페이스로 나눠져 있다)
    //   - 아래 3개로 정리한 계열들의 공통적인 메소드를 모아놓은 인터페이스

    // List
    //   - 순서가 있는 데이터의 집합, 자료형 (인덱스 번호 부여됨)
    //   - 데이터 중복을 허용한다

    // Set
    //   - 순서가 없는 데이터의 집합, 자료형 (인덱스 번호가 부여되지 않음)
    //   - 로또! 중복적인 내용을 제거해야할 때 구현하는 것

    // Map
    //   - Key, Value를 이용해서 쌍(pair)으로 되어있는 데이터 집합, 자료형
    //   - 순서가 없으며, 키(리스트 인덱스)는 중복 불가, 값은 중복 허용

  }
}
