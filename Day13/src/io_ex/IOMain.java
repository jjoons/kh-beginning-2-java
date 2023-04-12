package io_ex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOMain {
  public static void main(String[] args) {
    // 스트림 (데이터를 이동하는 통로)
    // Input -> 외부에서 자바 프로그램 안으로 가지고 들어온다 (읽기)
    // Output -> 자바 프로그램 안에서 외부로 나간다 (저장/쓰기)
    //    InputStream input = null;

    // 기본 프로젝트 주소에 저장된다 (Day13 밑에 저장된다)

    // 파일을 생성할 때 파일이 기존에 있으면 파일을 생성하지 않음
    // 단, 그 안에 있는 내용을 싹 지우고 현재 저장하는 내용만 저장됨
    // 파일이 없으면 파일을 생성한 다음 내용 저장
    Scanner sc = new Scanner(System.in);

    // 문자 (텍스트 파일)
    FileWriter fw = null;

    try {
      String lo = "D:\\io\\"; // "D:/io/ex01.txt"
      String fileName = "ex01.txt"; // sc.nextLine();

      // 1. 파일 생성
      fw = new FileWriter(lo + fileName);

      // 2. 파일 내용 저장
      //   문자열 안에서 특정한 행동을 한다
      //     \n: 줄바꿈, \t 탭, \r Carriage return
      fw.write("김철수/10, 이영희/30, 박민수/50\n");
      fw.write("아 졸리다!\t");
      fw.write("아! 쉽다!");

      // 3. 파일 닫기
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 바이트

  }
}

/*public abstract class InputStream extends Object implements Closeable{
  
  // 자식 클래스들이 구현해야할 read 추상 메서드  
  // 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴.
  public abstract int read() throws IOException;
 
  // len 바이트의 데이터를 읽어서 배열 b에 off 위치부터 집어넣기 (off위치는 배열 b의 index라고 생각하면 됨)
  // 읽은 바이트 개수를 반환하되, 더이상 읽을 값이 없으면 -1을 리턴
  public int read(byte[] b, int off, int len){
      ...
  }
 
  //byte b의 길이만큼 데이터를 InputStream으로부터 읽어들여 byte 배열 b에 삽입.
  //읽은 바이트 개수를 반환하되, 더이상 읽을 값이 없으면 -1을 리턴
  public int read(byte[] b) throws IOException {
      ...
     
  }
  // InputStream을 닫는역할.
  public void close() throws IOException{
      ...
  }
  ...

}*/
