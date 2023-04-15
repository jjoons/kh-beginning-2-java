package problem.a1;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
  private final List<Music> list = new ArrayList<>();

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

  public List<Music> printAll() {
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
    for (int i = 0; i < this.list.size(); i++) {
      Music currentMusic = this.list.get(i);

      if (title.equalsIgnoreCase(currentMusic.getTitle())) {
        this.list.set(i, music);
        return currentMusic;
      }
    }

    return music;
  }

  public int ascTitle() {
    this.list.sort(new AscTitle());
    return 1;
  }

  public int descSinger() {
    Music[] musics = this.list.toArray(new Music[0]);

    for (int i = 0; i < musics.length; i++) {
      for (int j = 1; j < musics.length - i; j++) {
        if (musics[j - 1].compareTo(musics[j]) <= -1) {
          Music temp = musics[j - 1];
          musics[j - 1] = musics[j];
          musics[j] = temp;
        }
      }
    }

    list.clear();
    list.addAll(List.of(musics));

    return 1;
  }
}
