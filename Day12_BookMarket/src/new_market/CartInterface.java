package new_market;

/**
 * 장바구니 처리를 위한 메서드 정의
 */
public interface CartInterface {
  /**
   * 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메서드. ID가 일치하면 장바구니에 담긴 도서의 개수를 1만큼 증가시키고 true를 반환하며, 그렇지
   * 않으면 false를 반환
   */
  boolean isCartInBook(String id);

  /**
   * 장바구니 항목 관리 클래스 CartItem에 도서 정보를 등록하는 메서드
   */
  boolean insertBook(Book p);

  /**
   * 장바구니 순번 numId의 항목을 삭제하는 메서드
   */
  void removeCart(int numId);

  /**
   * 장바구니의 모든 항목을 삭제하는 메서드
   */
  void deleteBook();
}
