package generice;

// 제네릭 타입을 지정할 때는 객체를 생성할 때 타입 지정
// 미리 기본 자료형들을 선언할 수 없다
// 2개 이상 타입을 지정할 때 T1, T2
public class Person<T, E> {
  T id;
  E pw;

  //  String name;
  //  int age;
  //  T weight; // 정수
  //  T height; // 실수

}
