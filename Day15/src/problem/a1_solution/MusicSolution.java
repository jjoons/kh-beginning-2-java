package problem.a1_solution;

import java.util.Objects;

public class MusicSolution {
  private String title;
  private String singer;

  public MusicSolution() {}

  // 객체 생성 시 매개 변수를 받는 생성자
  public MusicSolution(String title, String singer) {
    this.title = title;
    this.singer = singer;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  // 멤버 변수들을 정리해서 문자열로 반환
  @Override
  public String toString() {
    return "MusicSolution{" +
      "title='" + title + '\'' +
      ", singer='" + singer + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MusicSolution that = (MusicSolution) o;
    return Objects.equals(title, that.title) && Objects.equals(singer, that.singer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, singer);
  }
}
