package problem.a1;

public class Music {
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

  @Override
  public String toString() {
    return this.getSinger() + " - " + this.getTitle();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  public int compareTo(Object o) {
    // TODO
    System.out.println("미구현");
    return 0;
  }
}
