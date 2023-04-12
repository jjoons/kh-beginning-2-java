package io_ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
  public static void main(String[] args) {
    // File 읽기
    FileReader fr = null;
    // 중간 버퍼 생성 (임시 저장 공간)
    BufferedReader br = null;

    try {
      fr = new FileReader("D:/io/ex01.txt");
      br = new BufferedReader(fr); // FileReader 버퍼와 연결

      // 자식 클래스들이 구현해야할 read 추상 메서드  
      // 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴.
      String str = br.readLine(); // 한 줄씩 읽기
      System.out.println(str);

      str = br.readLine();
      System.out.println(str);

      str = br.readLine();
      System.out.println(str);

      br.close();
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
