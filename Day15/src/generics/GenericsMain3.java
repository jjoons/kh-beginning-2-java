package generics;

// 제네릭이 가장 많이 사용되는 람다 표현식의 함수형 인터페이스
interface IAdd<T> {
  public T add(T x, T y);
}


public class GenericsMain3 {
  public static void main(String[] args) {
    // 제네릭을 통해 람다 함수의 타입 결정
    // 매개 변수 x와 y, 그리고 반환형 타입이 int 형으로 설정된다
    // 일반 변수를 객체화 시켜주는 래퍼 클래스! 자동으로 포장한다

    IAdd<Integer> o = (x, y) -> x + y;

    int result = o.add(10, 20);

    // 결과값 콘솔에 보여줘라
    System.out.println(result);
  }
}
