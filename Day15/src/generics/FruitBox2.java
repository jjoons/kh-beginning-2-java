package generics;

public class FruitBox2<T, U> {
  public <T, U> void printBox(T x, U y) {
    System.out.println(x.getClass());
    System.out.println(y.getClass());
  }
}
