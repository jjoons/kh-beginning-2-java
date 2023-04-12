package io_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBuffer {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();

    // 문자 기반 파일 클래스

    try {
      FileReader fr = new FileReader("ex01.txt");
      FileWriter fw = new FileWriter("ex01.txt");
      BufferedReader bin = new BufferedReader(fr);

      // bout.newLine(); // 줄 바꿈

      BufferedWriter bout = new BufferedWriter(fw);
    } catch (IOException e) {
      System.out.println(e);
    }

    long end = System.currentTimeMillis();
    System.out.println("실행 시간: " + (end - start) / 1000.0 + "초");
  }
}

/*public class BufferedReader extends Reader{
  // 생성자
  public BufferedReader(Reader in, int sz){
      ...
  }
  public BufferedReader(Reader in){
      ...
  }
  // 메서드 
  // 한줄을 읽어들여 String으로 반환한다. 
  // 스트림의 끝에 도달시 null을 반환.
  public String readLine() throws IOException{
      ...
  }
  ...
}

public class BufferedWriter extends Writer{
  // 생성자
  BufferedWriter(Writer out){
      ...
  }
  BufferedWriter(Writer out, int sz){
      ...
  }
  // 메서드
  // 줄바꿈 문자를 쓴다.
  void newLine(){
      ...
  }
  ...
}*/
