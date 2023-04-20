package util;

@FunctionalInterface
public interface IFunction1<T, R> {
  R run(T a);
}
