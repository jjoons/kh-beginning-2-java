package util;

@FunctionalInterface
public interface OneParameterFunction<T, U extends T, R> {
  R run(U a);
}
