
public class Item {
  String name;
  int price;
  int count;

  public Item(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  @Override
  public String toString() {
    return this.name + " / " + this.price + "원 / " + this.count + "개";
  }
}
