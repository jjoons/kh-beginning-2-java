package set;

import java.util.HashSet;

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person))
      return false;

    Person temp = (Person) obj;

    return this.name.equals(temp.name) && this.age == temp.age;
  }

  @Override
  public int hashCode() {
    return (name + age).hashCode();
  }
}


public class SetMain {
  public static void main(String[] args) {
    // Set
    //   - 순서 없음, 중복 제거

    // HashSet
    //   - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
    //   - 순서를 유지하고 싶을 때는 LinkedHashSet 클래스 사용
    HashSet<Integer> set = new HashSet<>();

    // 추가
    //   set.add() 함수를 실행하고 나면 결과가 true / false 로 반환됨
    set.add(4);
    set.add(2);
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println(set);

    set.remove(3);
    System.out.println(set);

    // Set 계열은 인덱스 번호가 없기 때문에 중간에 삽입하는 것이 불가능하다

    set.clear();
    System.out.println(set);

    HashSet<Person> list = new HashSet<>();

    // 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
    list.add(new Person("이서희", 30));
    list.add(new Person("이지희", 5));
    list.add(new Person("이정희", 14));
    list.add(new Person("이준성", 20));

    System.out.println(list);

    // TreeSet
    //   - 범위 검색 및 정렬에 유리한 클래스
    //   - HashSet 보다 데이터 추가나 삭제하는 시간이 더 걸림

  }
}
