package io_datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamMain {
  public static void main(String[] args) {
    // 자료형이 다른 몇 개의 데이터를 파일에 출력했다가 다시 출력하기
    // 필터
    DataInputStream in = null;
    DataOutputStream out = null;

    try {
      // 내용물
      FileOutputStream fos = new FileOutputStream("data.bin");

      // Input, Output 각 Stream 객체가 하나있어야 한다
      out = new DataOutputStream(fos);
      out.writeInt(123);
      out.writeDouble(123.456);
      out.writeBoolean(true);
      out.writeBytes("안녕안녕...");

      out.close();

      FileInputStream fis = new FileInputStream("data.bin");
      in = new DataInputStream(fis);

      int aInt = in.readInt();
      double aDouble = in.readDouble();

      System.out.println(aInt);
      System.out.println(aDouble);

    } catch (IOException e) {
      e.printStackTrace();
    }


    // in = new DataInputStream();

  }
}
