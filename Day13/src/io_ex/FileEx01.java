package io_ex;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
  public static void main(String[] args) {
    // File 클래스
    //   - 파일 또는 디렉토리(폴더) 생성, 삭제 및 이름 변경
    //     디렉토리 내용 나열 등

    //  File file = new File("디렉토리명/");
    File file = new File("test.txt");

    try {
      // 만약 지정한 위치에 파일이 존재하면 false, 없으면 true
      boolean res = file.createNewFile();

      //    System.out.println(res);

      if (res) {
        System.out.println("파일 생성 완료");
      } else {
        System.out.println("파일 생성 안 한다! 기존 파일 있음");
      }

      //      file.mkdir();

      // exists(): 파일 존재 유무
      if (file.exists()) {
        System.out.println("파일 이름: " + file.getName());
        System.out.println("파일 경로: " + file.getAbsolutePath());
        System.out.println("파일 쓰기 가능?: " + file.canWrite());
        System.out.println("파일 읽기 가능?: " + file.canRead());
        System.out.println("파일 크기: " + file.length());
      } else {
        System.out.println("파일이 없습니다!");
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  // 디렉터리 mkdir()
  //   새 폴더 생성
}
