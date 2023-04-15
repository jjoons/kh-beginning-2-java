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
    if (this == obj) return true;
    else if (obj instanceof Music music) {
      return this.getTitle().equalsIgnoreCase(music.getTitle()) &&
        this.getSinger().equalsIgnoreCase(music.getSinger());
    }

    return false;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Music music) {
      return this.getSinger().compareToIgnoreCase(music.getSinger());
    }

    return 0;
  }
}
