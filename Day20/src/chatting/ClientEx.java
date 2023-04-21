package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
  public static void main(String[] args) {
    BufferedReader in = null;
    BufferedWriter out = null;
    Socket socket = null;
    Scanner sc = new Scanner(System.in);

    try {
      // 클라이언트 소켓 생성, 서버에 연결 (자동 연결)
      // 둘 다 하나라도 없으면 연결되지는 않지만 소켓은 생성된다
      socket = new Socket("localhost", 9999);

      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

      while (true) {
        System.out.println("클라이언트: ");
        // 클라이언트로부터 한 행씩 읽기
        // 클라이언트가 먼저 시작
        String outputMessage = in.readLine();
        String a = sc.nextLine();

        if (outputMessage.equalsIgnoreCase("bye")) {
          out.write(outputMessage + "\n");
          out.flush();
          break;
        }

        System.out.println("클라이언트: " + outputMessage + "\n");
        out.flush(); // 만약 bye 안해도 전송

        String inputMessage = in.readLine();
        System.out.println("서버: " + inputMessage);
      }
    } catch (IOException e) {} finally {
      sc.close();
      try {
        if (socket != null)
          socket.close();
      } catch (IOException e1) {
        System.out.println("서버와 채팅 중 오류가 발생했다");
      }
    }
  }
}
