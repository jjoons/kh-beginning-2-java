package problem.a1;

public class StockManager {
  private int stockNum;

  public StockManager(int stockNum) {
    this.stockNum = stockNum;
  }

  public void updateStock() throws Exception {
    this.subStock(stockNum - 90);
  }

  public void subStock(int amount) throws Exception {
    if (this.stockNum < amount) {
      throw new Exception("재고가 부족합니다");
    }

    this.stockNum -= amount;
  }

  public int getStockNum() {
    return stockNum;
  }
}
