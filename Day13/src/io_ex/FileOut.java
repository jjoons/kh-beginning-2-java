package io_ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
  public static void main(String[] args) {
    //    String str = "Hello Java Programming";

    try {
      // 스트림으로 바이트 출력
      //   문자, 동영상, 이미지 1 byte
      //      File file = new File("ex02.txt");
      File file = new File("gugudan.txt");

      if (!file.exists()) { // 파일이 있니?
        file.createNewFile(); // 새로운 파일은 있니?
      }

      FileOutputStream fos = new FileOutputStream(file);

      // 문자열로 저장
      // String str;

      for (int i = 2; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          String str = i + "x" + j + "=" + i * j + "\n";

          // 바이트 타입으로 변경
          byte[] b = str.getBytes();

          // 저장
          fos.write(b);
        }
      }

      /*for (int i = 1; i < 101; i++) {
        String str = i + "번 출력했습니다.";
        fos.write(str);
      }*/

      //      // 바이트 타입으로 변경
      //      byte[] b = str.getBytes();

      //      // 저장
      //      fos.write(b);

      fos.close();

      System.out.println("정상적!");
    } catch (IOException e) {
      System.out.println("파일에 대한 예외 발생");
    }

    // 문자 기반 (2 bytes)


  }
}
