package io_ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
  public static void main(String[] args) {
    try {
      File file = new File("gugudan.txt");

      if (!file.exists()) {
        file.createNewFile();
      }

      FileInputStream fis = new FileInputStream(file);

      int i = 0;
      // read() 데이터가 읽어올 것이 없으면 -1
      // null 나오기 전까지 읽어오기
      while ((i = fis.read()) != -1) {
        System.out.print((char) i);
      }

      fis.close();

      System.out.println("정상적!");
    } catch (IOException e) {
      System.out.println("파일에 대한 예외 발생");
    }

    // 문자 기반 (2 bytes)


  }
}
