package variable;

class Hotel {
  static String masterKey = "카드";

  // 투숙객마다 방 번호와 예약한 사람의 이름을 받아야 함
  static HotelCustomer[] list = new HotelCustomer[10];

  // 투숙객들의 정보 교환
  public static void ch() {}
}


class HotelCustomer {
  // 클래스 객체가 생성될 때마다 변수를 만든다
  // 객체 안에 변수가 여러 개 생긴다
  // 인스턴스 변수
  String name; // 이름
  int roomNumber; // 방 번호
}

// 변수 크기 유동적 (크거나 작거나 변경이 많이 된다)
// Heap 영역: 프로그램이 시작하고 나서 변수 선언

// Stack 영역: 프로그램 시작 전에 변수를 저장하는 공간
//   변수의 크기가 고정되어있음
//   중괄호가 시작되고 중괄호가 끝나면 삭제됨

// static 영역
//   프로그램이 끝날 때까지 전역 변수 데이터 유지
//   중복되는 이름은 사용 불가


public class VariableMain {
  public static void main(String[] args) {
    // 접근 방법
    HotelCustomer one1 = new HotelCustomer();
    one1.roomNumber = 1001;

    HotelCustomer one2 = new HotelCustomer();
    one2.roomNumber = 1002;

    // static 객체를 생성할 필요가 없음
    // 접근 방법
    Hotel hotel = new Hotel();
    System.out.println(hotel.masterKey);

  }
}
