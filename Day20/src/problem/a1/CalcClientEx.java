package problem.a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalcClientEx {
  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket s = new Socket(CalcServerEx.HOSTNAME, CalcServerEx.PORT_NUMBER);
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("수식 입력: ");
      String request = sc.nextLine();
      bw.write(request);
      bw.flush();

      String response = br.readLine();
      System.out.println("계산결과: " + response);

      if (false)
        break;
    }
  }
}
