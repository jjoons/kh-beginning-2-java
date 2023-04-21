package chat_thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 네이버, 구글 등
public class Server {
  // 여러 개의 스레드를 관리하는 풀
  // 병렬 작업 시 여러 개의 작업을 효율적으로 처리하기 위해서 자바에서 제공되는 라이브러리
  // 스레드에 생성되고 삭제되는 작업을 손수해야 한다

  public static ExecutorService threadPool = null;
  public static Vector<Client> clientList = new Vector<>();

  ServerSocket serverSocket;
  String ip = "127.0.0.1";
  int port = 19876;

  public Server() {
    this.startServer(this.ip, this.port);
  }

  public void startServer(String ip, int port) {
    this.ip = ip;
    this.port = port;

    try {
      this.serverSocket = new ServerSocket(port);
      this.serverSocket.bind(new InetSocketAddress(ip, port));

      String msg = "";
      msg += "[서버 시작] " + ip + ":" + port + "\n";
      System.out.println(msg);

    } catch (IOException e) {}

    Runnable thread = new Runnable() {
      @Override
      public void run() {
        while (true) {
          try {
            Socket socket = serverSocket.accept();
            clientList.add(new Client(socket));
            System.out.println("[클라이언트 접속] " + socket.getRemoteSocketAddress() + " / "
                + Thread.currentThread().getName());

          } catch (IOException e) {}
        }
      }
    };

    // 스레드를 관리하는 풀을 만들면 생성
    threadPool = Executors.newCachedThreadPool();

    // 스레드를 관리할 수 있도록 풀에 추가하기
    threadPool.submit(thread);
  }

  public static void main(String[] args) {
    new Server();
  }
}
