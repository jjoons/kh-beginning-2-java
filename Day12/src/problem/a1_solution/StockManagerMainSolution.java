package problem.a1_solution;

public class StockManagerMainSolution {
  public static void main(String[] args) {
    // 내가 만든 예외 처리 실행 클래스
    // 수량을 관리하는 클래스

    try {
      StockManagerSolution st = new StockManagerSolution();
      st.updateStock();
    } catch (MyExceptionSolution e) {
      System.out.println("에러 발생");
      System.out.println(e);
    }
  }
}
