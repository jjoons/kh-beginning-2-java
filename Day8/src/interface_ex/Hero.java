package interface_ex;

// static "인터페이스명.상수"에 접근할 수 있다.

public interface Hero {
  // 체력
  int MAX_HP = 100; // public static final

  // 공격력
  void attack();

  void heal(int potion);
}
