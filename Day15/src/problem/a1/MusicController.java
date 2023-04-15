package problem.a1;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
  List<Music> list = new ArrayList<>();

  public int addList(Music music) {
    list.add(music);
    return 1;
  }

  public void addListMultiple(Music[] musics) {
    for (Music music : musics) {
      this.addList(music);
    }
  }

  public void addListMultiple(List<Music> musics) {
    for (Music music : musics) {
      this.addList(music);
    }
  }

  public int addAtZero(Music music) {
    list.add(0, music);
    return 1;
  }

  public List printAll() {
    return this.list;
  }

  public Music searchMusic(String title) {
    for (Music music : this.list) {
      if (music.getTitle().equals(title)) {
        return music;
      }
    }

    return null;
  }

  public Music removeMusic(String title) {
    for (Music music : this.list) {
      if (music.getTitle().equals(title)) {
        list.remove(music);
        return music;
      }
    }

    return null;
  }

  public Music setMusic(String title, Music music) {
    music.setTitle(title);
    return music;
  }

  public int ascTitle() {
    // TODO
    System.out.println("미구현");

    String tempTitle = "";
    String tempSinger = "";


    //"".compareToIgnoreCase();

    return 1;
  }

  public int descSinger() {
    // TODO
    // System.out.println("미구현");

    list.sort((o1, o2) -> o1.getSinger().compareToIgnoreCase(o2.getSinger()));

    return 1;
  }

  public void removeDuplicate() {

  }
}
