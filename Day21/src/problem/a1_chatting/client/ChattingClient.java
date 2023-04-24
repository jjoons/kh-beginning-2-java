package problem.a1_chatting.client;

import problem.a1_chatting.server.ChattingServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChattingClient {
  private Socket socket;
  private DataOutputStream out;
  private DataInputStream in;
  private Scanner sc = new Scanner(System.in);

  public ChattingClient() throws IOException {
    this.socket = new Socket(ChattingServer.HOST, ChattingServer.PORT);
    this.out = new DataOutputStream(this.socket.getOutputStream());
    this.in = new DataInputStream(this.socket.getInputStream());

    this.run();
  }

  public void run() {
    while (true) {
      System.out.println("보낼 메시지 입력: ");
      String sendMessage = this.sc.nextLine();

      try {
        this.out.writeUTF(sendMessage);
        this.out.flush();
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("전송에 실패했습니다");
      }

      String recvMessage;
      try {
        recvMessage = this.in.readUTF();
      } catch (IOException e) {
        System.out.println("IO 오류");
        throw new RuntimeException(e);
      }

      System.out.println("서버: " + recvMessage);
    }
  }

  public static void main(String[] args) throws IOException {
    new ChattingClient();
  }
}
