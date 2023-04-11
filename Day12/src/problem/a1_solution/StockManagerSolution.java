package problem.a1_solution;

public class StockManagerSolution {
  int stockNum; // 재고 수량

  public StockManagerSolution() {}

  // 매개 변수를 받는 생성자
  public StockManagerSolution(int stockNum) {
    this.stockNum = stockNum;
  }

  // 수량을 업데이트하는 함수
  void updateStock() throws MyExceptionSolution {
    this.subStock(110);
  }

  // 수량을 관리해서 확인하는 함수
  void subStock(int amount) throws MyExceptionSolution {
    if (this.stockNum < amount) {
      throw new MyExceptionSolution("재고 수량이 부족합니다");
    } else {
      this.stockNum -= amount;
      System.out.println("현재 재고 수량: " + this.stockNum);
    }
  }
}
