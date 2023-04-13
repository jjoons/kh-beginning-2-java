package com.kh.practice.array;

@FunctionalInterface
public interface OneParameterFunction<T, R> {
  R run(T a);
}
