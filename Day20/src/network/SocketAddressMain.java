package network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class SocketAddressMain {
  public static void main(String[] args) {
    // SocketAddress
    //   IP 주소 (호스트 이름)와 포트 번호를 관리하는 추상 클래스
    //   InetSocketAddress 클래스로 사용할 수 있다

    // InetSocketAddress(포트번호)
    //   - IP 주소없이 내부의 포트 정보만 지정

    try {
      int port = 20000;

      InetAddress ia1 = InetAddress.getByName("www.google.com");

      InetSocketAddress isa1 = new InetSocketAddress(port);
      InetSocketAddress isa2 = new InetSocketAddress("www.google.com", port);
      InetSocketAddress isa3 = new InetSocketAddress(ia1, port);

      System.out.println(isa1);
      System.out.println(isa2);
      System.out.println(isa3);

      // 포트 번호
      System.out.println(isa1.getPort());
    } catch (UnknownHostException e) {
      System.out.println("주소가 없습니다");
    }
  }
}
