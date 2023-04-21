package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketMain {
  public static void main(String[] args) {
    // 소켓 통신
    //   소켓: TCP/IP 네트워크를 이용해서 통신을 쉽게할 수 있도록 도와주는 기술

    // 두 프로그램 간의 양방향 통신 링크의 끝
    // 소켓끼리 데이터를 주고 받는다
    // 소켓은 특정 IP 포트 번호와 결합

    // 소켓 종류
    //   서버 소켓과 클라이언트 소켓이 있다

    // Socket 클래스
    //   TCP 통신에서 두 호스트 간의 입출력 스트림을 제공하는 클래스 (실제로 통신하는 객체) 

    // Socket(): 객체 생성과 동시에 연결까지 요청
    //   위와 같이 소켓 클래스가 기본 클래스 생성이라면 소켓만 생성. 연결은 하지 않는다

    // InputStream, OutputStream
    //   원격지와 통신을 위해서 입출력 스트림을 리턴하는
    //   getInputStream, getOutputStream 메소드 이용

    Socket socket1 = new Socket();
    Socket socket2 = null;
    Socket socket3 = null;
    Socket socket4 = null;
    Socket socket5 = null;

    try {
      socket2 = new Socket("www.naver.com", 80);

      // 원격지의 IP, Port(문자열로 입력)에 연결하는 소켓 생성
      // 송신지 주소와 포트 정보도 같이 포함하여 연결 생성
      socket3 = new Socket("www.naver.com", 80, InetAddress.getLocalHost(), 20000);
      socket4 = new Socket(InetAddress.getByName("www.naver.com"), 80);

      System.out.println(socket1.getInetAddress() + ":" + socket1.getPort());

      // 로컬 주소 정보 미지정, 지정
      System.out.println();

      System.out.println(socket2.getLocalAddress() + ":" + socket2.getLocalPort());
      System.out.println(socket3.getLocalAddress() + ":" + socket3.getLocalPort());

      // Send / Receive 버퍼 사이즈
      System.out.println(socket2.getSendBufferSize());
      System.out.println(socket3.getReceiveBufferSize());

      // 서버 소켓

      // 클라이언트 소켓


    } catch (UnknownHostException e) {} catch (IOException e) {}
  }
}
