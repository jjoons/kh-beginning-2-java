package interface_ex;

interface Fly {
  void fly();
}

interface Walk {
  void walk();
}

interface Cry {
  void cry();
}

class Dog implements Walk, Cry {
  @Override
  public void walk() {}

  @Override
  public void cry() {}
}

abstract public class Bird implements Fly, Walk, Cry {
  @Override
  public void fly() {}

  @Override
  public void walk() {}

  @Override
  public void cry() {}
}

class Chicken implements Walk, Fly {
  @Override
  public void fly() {}

  @Override
  public void walk() {}
}
