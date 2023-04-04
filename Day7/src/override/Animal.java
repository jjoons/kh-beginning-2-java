package override;

public class Animal {
  // 모든 동물
  public void cry() {
    System.out.println();
  }
}

class Cat extends Animal {
  @Override
  public void cry() {
    System.out.println("야옹야옹!");
  }
}

class Dog extends Animal {
  @Override
  public void cry() {
    System.out.println("멍멍");
  }
}
