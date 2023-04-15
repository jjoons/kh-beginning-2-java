package problem.a1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicView {
  private final Scanner sc = new Scanner(System.in);
  private final MusicController mc = new MusicController();

  public void mainMenu() {
    while (true) {
      int in = 0;

      try {
        System.out.println("""
          ******* 메인 메뉴 *******
          1. 마지막 위치에 곡 추가
          2. 첫 위치에 곡 추가
          3. 전체 곡 목록 출력
          4. 특정 곡 검색
          5. 특정 곡 삭제
          6. 특정 곡 정보 수정
          7. 곡명 오름차순 정렬
          8. 가수명 내림차순 정렬
          9. 종료
          10. 등록되어 있는 곡 정보 등록
          """);
        System.out.println("메뉴 번호 선택: ");
        in = sc.nextInt();

        sc.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("숫자만 입력할 수 있습니다");
        sc.nextLine();
      }

      switch (in) {
        case 1 -> this.addList();
        case 2 -> this.addAtZero();
        case 3 -> this.printAll();
        case 4 -> this.searchMusic();
        case 5 -> this.removeMusic();
        case 6 -> this.setMusic();
        case 7 -> this.ascTitle();
        case 8 -> this.descSinger();
        case 9 -> {
          System.out.println("프로그램 종료");
          return;
        }
        case 10 -> this.addPreloadList();
        default -> System.out.println("1~9번 중 하나를 입력해주세요");
      }
    }
  }

  public void addList() {
    // TODO
    System.out.println("곡 명 입력: ");
    String songName = sc.nextLine();

    System.out.println("가수명 입력: ");
    String artistName = sc.nextLine();

    Music newMusic = new Music(songName, artistName);

    mc.addList(newMusic);
  }

  public void addAtZero() {
    System.out.println("****** 마지막 위치에 곡 추가 ******");
    System.out.println("곡 명 입력: ");
    String songName = sc.nextLine();

    System.out.println("가수명 입력: ");
    String artistName = sc.nextLine();

    Music newMusic = new Music(songName, artistName);

    mc.addAtZero(newMusic);
  }

  public void printAll() {
    System.out.println("****** 전체 곡 목록 출력 ******");
    System.out.println(mc.printAll());
  }

  public void searchMusic() {
    System.out.println("****** 특정 곡 검색 ******");
    System.out.println("검색할 곡 이름 입력: ");
    String searchMusicName = sc.nextLine();

    Music result = mc.searchMusic(searchMusicName);

    if (result != null) {
      System.out.println(result);
    } else {
      System.out.println("검색한 곡이 없습니다.");
    }
  }

  public void removeMusic() {
    System.out.println("****** 특정 곡 삭제 ******");
    System.out.println("삭제할 곡 이름 입력: ");
    String deleteSongName = sc.nextLine();

    Music result = mc.removeMusic(deleteSongName);

    if (result != null) {
      System.out.println(result.getSinger() + "의 " + result.getTitle() + " 곡을 삭제했습니다");
    } else {
      System.out.println("삭제할 곡이 없습니다");
    }
  }

  public void setMusic() {
    System.out.println("****** 특정 곡 수정 ******");
    System.out.println("수정할 곡 이름 입력: ");
    String searchSongName = sc.nextLine();

    Music searchResult = mc.searchMusic(searchSongName);

    if (searchResult == null) {
      System.out.println("수정할 곡이 없습니다");
      return;
    }

    System.out.println("변경하고 싶은 곡 이름 입력: ");
    String newSongName = sc.nextLine();

    System.out.println("변경하고 싶은 가수 이름 입력: ");
    String newSinger = sc.nextLine();

    Music newMusic = new Music(newSongName, newSinger);
    Music result = mc.setMusic(searchSongName, newMusic);

    if (result != null) {
      System.out.println(result.getSinger() + "의 " + result.getTitle() + " 곡의 값이 변경되었습니다");
    } else {
      System.out.println("값이 없습니다");
    }
  }

  public void ascTitle() {
    System.out.println(mc.ascTitle() == 1 ? "정렬 성공" : "정렬 실패");
  }

  public void descSinger() {
    System.out.println(mc.descSinger() == 1 ? "정렬 성공" : "정렬 실패");
  }

  public void addPreloadList() {
    Music[] musics = new Music[]{
      new Music("작은 것들을 위한 시", "방탄소년단"),
      new Music("Alone", "Marshmello(마시멜로)"),
      new Music("소우주", "방탄소년단"),
      new Music("주저하는 연인들을 위해", "잔나비"),
      new Music("Alone", "하이라이트(Highlight)"),
      new Music("All Mine", "f(x)")
    };

    mc.addListMultiple(musics);
  }
}
