package set;

import java.util.HashSet;

public class SetMain2 {
  public static void main(String[] args) {
    HashSet<Person> list = new HashSet<>();
    System.out.println(list);

    Person p1 = new Person("이서희", 10);

    int hashCode1 = p1.hashCode();
    int hashCode2 = p1.hashCode();

    System.out.println(hashCode1);
    System.out.println(hashCode2);
    // 동일한 인스턴스 hashCode()를 여러 번 호출해도 반드시 동일한 값을 반환한다

    Person p2 = new Person("이서희", 10);

    boolean b = p1.equals(p2);

    hashCode1 = p1.hashCode();
    hashCode2 = p2.hashCode();

    System.out.println(hashCode1);
    System.out.println(hashCode2);
    // equals()로 비교한 결과가 false면
    // 두개의 hashCode() 값이 같을 수도 있다
    // 서로 다른 값을 반환하도록 재작성

  }
}
