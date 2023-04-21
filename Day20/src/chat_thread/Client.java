package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// 나 (사용자)
public class Client {
  // 소켓, 필터스트림 (선)
  private Socket clientSocket;
  private DataInputStream dataInputStream;
  private DataOutputStream dataOutputStream;

  public Client(Socket clientSocket) {
    this.clientSocket = clientSocket;

    try {
      // 서버가 나한테 응답해 주는 것 (전화 받기)
      this.dataInputStream = new DataInputStream(this.clientSocket.getInputStream());

      // 내가 서버한테 요청하는 것 (전화 걸기)
      this.dataOutputStream = new DataOutputStream(this.clientSocket.getOutputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void send(String message) {
    // 익명 클래스
    //   - 이름이 없는 1회용 클래스
    Runnable thread = new Runnable() {
      @Override
      public void run() {
        try {
          dataOutputStream.writeUTF(message);
        } catch (IOException e) {}
      }
    };

    Server.threadPool.submit(thread);
    // 여러 개의 스레드를 관리하는 Pool
  }

  public void receive() {
    Runnable thread = new Runnable() {
      @Override
      public void run() {
        try {
          // 메시지 수신을 계속 반복적으로 한다
          while (true) {
            // UTF-8로 읽어온다
            String recvData = dataInputStream.readUTF();
            System.out.println("[메시지 수신 성공]");

            // getRemoteSocketAddress(): 연결한 시스템에 대한 주소를 반환한다
            System.out
                .println(clientSocket.getRemoteSocketAddress() + Thread.currentThread().getName());

            for (Client client : Server.clientList) {
              client.send(Thread.currentThread().getName() + ": " + recvData);
            }
          }
        } catch (Exception e) {}
      }
    };

    Server.threadPool.submit(thread);
  }
}
