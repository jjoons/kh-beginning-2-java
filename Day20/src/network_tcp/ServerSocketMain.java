package network_tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerSocketMain {
  public static void main(String[] args) {
    // 클라이언트가 접속해서 정보를 가져갈 서버 생성
    // ServerSocker: TCP 통신에서 소켓으로부터 연결 요청을 수락하는 서버 역할의 클래스

    // Binding: 수신 호스트에서 연결 요청이 들어온 경우 해당 데이터를 전달할 연결 포트 지정
    // Connect: 원격지 특정 주소로의 연결 수행

    ServerSocket serverSocket1 = null;
    ServerSocket serverSocket2 = null;

    try {
      serverSocket1 = new ServerSocket();
      serverSocket2 = new ServerSocket(20000);

      //#2. ServerSocket 메서드
      //@bind
      System.out.println(serverSocket1.isBound());//false
      System.out.println(serverSocket2.isBound());//true
      try {
        serverSocket1.bind(new InetSocketAddress("127.0.0.1", 10000));
      } catch (IOException e) {}

      // 바인딩
      //   - 프로그램에서 사용된 구성 요소의 실제값을 저장하는 메모리
      //   - 함수를 호출하는 부분에서 실제 함수가 위치한 메모리를 연결하는 것
      //   - 서버 소켓과 클라이언트 소켓이 연결되어서 실제 서버에 접근하거나
      //     클라이언트에게 접근이 된다(?)

      // isBound(): ServerSocket이 바인딩 여부 확인
      // accept()
      //   - 연결 요청 수락
      //   - 서버 소켓 실행
      //   - 연결 수락까지 설정된 시간만큼 blocking
      //   - 하나의 서버에 두 개의 클라이언트가 오게 되면
      //     먼저 들어온 클라이언트 소켓을 만들어서 통신할 동안 기다린다
      //     기다리는 포트 9999

      // 시간 설정
      //   setSoTimeout(int timeout)
      //   getSoTimeout(): 무한 대기. 0값이 온다

      System.out.println(serverSocket1.isBound());//true
      System.out.println(serverSocket2.isBound());//true
      System.out.println();
    } catch (IOException e) {}

    // TCP 1:1 통신

    // 사용 중인 포트 확인
    //   cmd: "netstat -a"

    for (int i = 0; i < 65536; i++) {
      try {
        ServerSocket ser = new ServerSocket(i);
        //        ser.close();
      } catch (IOException e) {
        System.out.println(i + "번째 포트 사용 중");
      }
    }

    System.out.println();

    try {
      serverSocket1.setSoTimeout(2000);
    } catch (SocketException e) {
      e.printStackTrace();
    }

    try {
      Socket socket = serverSocket1.accept();
    } catch (IOException e) {
      try {
        System.out.println(serverSocket1.getSoTimeout() + "ms 시간이 지나 listening을 종료합니다");
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    }
  }
}
