package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientMain {
  private Socket socket;
  private DataInputStream dataInputStream;
  private DataOutputStream dataOutputStream;
  String ip = "127.0.0.1";
  int port = 19876;

  public ClientMain() {
    this.startClient(ip, port);
  }

  public void startClient(String ip, int port) {
    try {
      this.socket = new Socket(ip, port);
      this.dataInputStream = new DataInputStream(this.socket.getInputStream());
      this.dataOutputStream = new DataOutputStream(this.socket.getOutputStream());

      this.receive();
      this.send();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void receive() {
    new Thread(new Runnable() {
      boolean isThread = true;

      @Override
      public void run() {
        while (isThread) {
          try {
            String recvData = dataInputStream.readUTF();

            if (recvData.equals("/quit")) {
              isThread = false;
            } else {
              System.out.println("[메시지]: " + recvData);
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }).start();
  }

  public void send() {}

  public static void main(String[] args) {
    new ClientMain_();
  }
}
