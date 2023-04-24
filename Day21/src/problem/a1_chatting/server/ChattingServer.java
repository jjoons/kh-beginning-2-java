package problem.a1_chatting.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
  public static final String HOST = "0.0.0.0";
  public static final int PORT = 12000;
  private ServerSocket serverSocket;
  private Socket socket;
  private DataInputStream in;
  private DataOutputStream out;
  private Scanner sc = new Scanner(System.in);

  public ChattingServer() throws IOException {
    this.serverSocket = new ServerSocket(PORT);
    this.socket = this.serverSocket.accept();
    this.in = new DataInputStream(this.socket.getInputStream());
    this.out = new DataOutputStream(this.socket.getOutputStream());

    this.run();
  }

  private void run() {
    while (true) {
      String receiveMessage = null;

      try {
        receiveMessage = this.in.readUTF();
      } catch (IOException e) {
        System.out.println("IO 오류");
        throw new RuntimeException(e);
      }

      System.out.println("클라이언트: " + receiveMessage);

      System.out.println("보낼 메시지 입력: ");
      String sendMessage = this.sc.nextLine();

      try {
        this.out.writeUTF(sendMessage);
        this.out.flush();
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("메시지 전송에 실패했습니다.");
        throw new RuntimeException(e);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    new ChattingServer();
  }
}
