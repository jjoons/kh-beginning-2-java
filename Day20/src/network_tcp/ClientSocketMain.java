package network_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {
  public static void main(String[] args) {
    // 클라이언트 소켓 생성
    try {
      Socket clientSocket = new Socket("127.12.1.1", 9999);

      // 소켓으로 데이터를 전송할 입출력 스트림 생성
      //   1. 버퍼, 입출력 사용
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

      // 내보내기
      BufferedWriter out =
          new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

      out.write("hello\n");
      out.flush(); // 스트림 속에 있는 데이터 모두 전송

      clientSocket.close();

    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
