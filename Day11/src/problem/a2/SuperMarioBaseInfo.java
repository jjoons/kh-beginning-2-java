package problem.a2;

public class SuperMarioBaseInfo {
  protected String name;
  protected int hp;
  protected int level;
  protected String attackName;
  protected int damage;
  protected double attackDelay;

  public SuperMarioBaseInfo() {}

  public void attack(SuperMarioBaseInfo ch) {
    System.out.println(this.name + "(이)가 ");
  }
}
