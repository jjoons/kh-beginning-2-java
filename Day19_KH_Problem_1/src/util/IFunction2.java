package util;

@FunctionalInterface
public interface IFunction2<T, U, R> {
  R run(T a, U b);
}
