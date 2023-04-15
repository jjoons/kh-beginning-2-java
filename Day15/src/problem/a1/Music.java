package problem.a1;

public class Music implements Comparable<Object> {
  private String title;
  private String singer;

  public Music() {}

  public Music(String title, String singer) {
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

  /**
   * 곡의 정보를 반환함.
   * @return "가수 이름 - 곡 이름"
   */
  @Override
  public String toString() {
    return this.getSinger() + " - " + this.getTitle();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * 곡이 같은지 확인하는 메소드.
   * @param obj 비교할 객체.
   * @return 객체가 같거나, 곡 이름과 가수가 같으면 {@code true}를 반환하고,
   * 아니라면 {@code false}를 반환함.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    else if (obj instanceof Music music) {
      return this.getTitle().equalsIgnoreCase(music.getTitle()) &&
        this.getSinger().equalsIgnoreCase(music.getSinger());
    }

    return false;
  }

  /**
   * 가수 이름 기준으로 비교하는 메소드.
   * @param o the object to be compared.
   * @return {@link Music} 객체가 맞을 경우 가수 이름으로 비교해서 값을 반환함. 그렇지 않을 경우 "{@code 0}"을 반환함
   */
  @Override
  public int compareTo(Object o) {
    if (o instanceof Music music) {
      return this.getSinger().compareToIgnoreCase(music.getSinger());
    }

    return 0;
  }
}
