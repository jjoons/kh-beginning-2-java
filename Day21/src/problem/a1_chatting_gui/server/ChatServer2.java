package problem.a1_chatting_gui.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer2 {
  public static final String HOST = "0.0.0.0";
  public static final int PORT = 20000;

  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(PORT);

    while (true) {
      Socket so;

      try {
        so = ss.accept();
      } catch (IOException e) {
        System.out.println(ChatServer2.class.getSimpleName() + ": IO 오류");
        e.printStackTrace();
        continue;
      }

      Thread serverThread = new Thread(new ChatServer2Thread());
      serverThread.start();
    }
  }
}
