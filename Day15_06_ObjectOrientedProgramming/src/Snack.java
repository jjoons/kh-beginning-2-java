public class Snack {
  /**
   * 종류
   */
  private String kind;
  /**
   * 이름
   */
  private String name;
  /**
   * 맛
   */
  private String flavor;
  /**
   * 개수
   */
  private int numOf;
  /**
   * 가격
   */
  private int price;

  public Snack() {}

  public Snack(String kind, String name, String flavor, int numOf, int price) {
    this.kind = kind;
    this.name = name;
    this.flavor = flavor;
    this.numOf = numOf;
    this.price = price;
  }

  public String information() {
    return this.getKind() + "(" + this.getName() + " - " + this.getFlavor() + ") " + this.getNumOf() + "개 " + this.getPrice() + "원";
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public int getNumOf() {
    return numOf;
  }

  public void setNumOf(int numOf) {
    this.numOf = numOf;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
