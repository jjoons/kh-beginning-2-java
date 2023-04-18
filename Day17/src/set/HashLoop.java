package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashLoop {
  public static void main(String[] args) {
    // 여러개 동시에 추가
    HashSet<String> hashSet1 = new HashSet<>();

    hashSet1.add("로봇");
    hashSet1.add("신발");
    hashSet1.add("농구공");

    System.out.println(hashSet1);

    HashSet<String> hashSet2 = new HashSet<>();
    hashSet2.add("야구공");
    hashSet2.add("나나나");
    hashSet2.addAll(hashSet1);

    System.out.println(hashSet2);

    // 컬렉션에서 순서가 없는 데이터를 뽑아서 반복시키는 반복자
    // iterator()
    //   - 컬렉션에서 요소들을 읽어오는 방법
    //   hasNext(): 다음 데이터가 있으면 true, 없으면 false
    //   next(): 데이터 반환
    //   remove(): next() 메소드로 읽어온 데이터 삭제

    // 반복자 사용하기
    // 인터페이스로 구현되어 있다
    // iterator() 메소드 안에서 반복자에 대한 객체를 생성해서 iter1 변수에 저장한다
    Iterator<String> iter1 = hashSet1.iterator();

    while (iter1.hasNext()) {
      System.out.println(iter1.next());
    }

    // forEach
    for (String s : hashSet2) {
      System.out.println(s);
    }
  }
}

