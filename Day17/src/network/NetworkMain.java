package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkMain {
  public static void main(String[] args) {
    // 사람들끼리 정보를 교환하기 위해서 인터넷에 접속

    // 호스트
    //   - 사용자

    // 라우터
    //   - 호스트에서 생성된 데이터를 여러 네트워크를 거쳐 전송함으로써
    //     다른 네트워크에 데이터를 교환할 수 있다

    // 클라이언트 (Client)
    //   나

    // 서버 (Server)
    //   예) 네이버, 구글, 다음 등의 사이트

    // 컴퓨터 간의 관계를 역할로 구분하는 개념
    //   서비스를 제공하는 쪽이 서버
    //   제공받는 쪽은 클라이언트

    // 통신 프로토콜
    //   - 호스트가 라우터와 라우터 통신을 하기 위해 필요함

    // 인터넷을 이용하려면 규칙(프로토콜)이 필요함
    // IP 주소
    //   IPv4: 32bit 주소
    //   IPv6: 64bit 주소

    // TCP/IP 계층 구조
    //   - 역할: 물리적인 네트워크를 통한 데이터 송수신
    //   - 구성요소: 네트워크 하드웨어 + 장치 드라이버
    //   - 주소 저장 방식: 물리 주소 이더넷 48bit

    // 내 컴퓨터 정보 확인
    //   돋보기 -> "cmd" 입력 -> "ipconfig" (간단하게) | "ipconfig /all" (자세히)

    // 인터넷에 접속할 때 쓰이는 공인 IP는 중복될 수 없다

    // 포트
    //   - 연결 통로 (통신을 연결하는 번호)
    //   - 웹 서버: 80

    // IP 주소를 나타내는 InetAddress 클래스
    // IP 번호와 URL을 조사할 때 사용

    // DNS 서버
    //   114와 똑같다
    //   URL을 찾아서 IP 주소로 변환해 주는 서버
    //   문자로 들어온 주소값을 IP 주소인 IPv4(IPv6)로 변경

    // TCP / UDP
    //   TCP
    //     - 전화 통화
    //     - 요청을 하면 응답이 온다.
    //     - 프로세스 간에 통신을 하려면 소켓이 필요하다
    //     - 1:1 통신 방식. 데이터가 오류이거나 전달되지 않았을경우
    //       바로 확인이 가능하다. 파일 전송 등에서 신뢰성이 높다
    //   UDP
    //     - 우편, 소포, 택배
    //     - 오류 발생 시 데이터를 전달하는지 안 하는지에 따라서 신뢰성

    // URL
    //   인터넷 상의 파일이나 데이터베이스 같은 자원에 대한 주소를 지정하는 방법
    //   "http://www.naver.com:80/index.html"
    //     프로토콜 이름: http
    //     호스트 이름: www.naver.com
    //     파일 이름: index.html
    //     포트 번호: 80

    // getHostAddress(): IP 주소를 String으로 반환한다

    String hostName = "www.naver.com";

    try {
      InetAddress address = InetAddress.getByName(hostName);
      System.out.println("IP 주소: " + address.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println(hostName + "의 IP를 찾을 수 없습니다");
    }

    // 통신하려면 Socket이 필요하다 (연결 통로)
    // 두 컴퓨터 간에 통신하는 끝 부분을 의미함
    // Socket(InetAddress address, int port)
    // Socket socket = new Socket("", 0);

  }
}
