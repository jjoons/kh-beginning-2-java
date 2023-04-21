package problem.a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServerEx {
  public static final String HOSTNAME = "127.0.0.1";
  public static final int PORT_NUMBER = 12000;

  public static void main(String[] args) throws IOException {
    // TODO

    ServerSocket ss = new ServerSocket(PORT_NUMBER);

    System.out.println("연결을 기다리고 있습니다");
    Socket s = ss.accept();
    System.out.println("연결되었습니다");

    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

    while (true) {
      String inputMessage = br.readLine();
      String[] numbers = inputMessage.split("\\d{1,}");
      String[] signs = inputMessage.split("[+\\-*/]");

      for (int j = 0; j < signs.length; j++) {

      }
    }


    ss.close();
    s.close();
  }
}
