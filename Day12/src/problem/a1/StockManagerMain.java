package problem.a1;

public class StockManagerMain {
  public static void main(String[] args) {
    StockManager s = new StockManager(90);

    try {
      s.updateStock();
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(s.getStockNum());
  }
}
