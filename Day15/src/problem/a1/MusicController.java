package problem.a1;

import java.util.ArrayList;
import java.util.List;

public class MusicController {
  private final List<Music> list = new ArrayList<>();

  /**
   * 곡을 리스트 마지막에 추가함.
   * @param music {@link Music} 객체.
   * @return {@code 1}
   */
  public int addList(Music music) {
    list.add(music);
    return 1;
  }

  /**
   * 배열에 담겨있는 곡들을 리스트에 추가함.
   * @param musics {@link Music} 객체가 담겨있는 배열.
   */
  public void addListMultiple(Music[] musics) {
    for (Music music : musics) {
      this.addList(music);
    }
  }

  /**
   * {@link List}에 담겨있는 곡들을 리스트에 추가함.
   * @param musics {@link Music} 객체가 담겨있는 {@link List}({@link List}&lt;{@link Music}&gt;).
   */
  public void addListMultiple(List<Music> musics) {
    for (Music music : musics) {
      this.addList(music);
    }
  }

  /**
   * 곡을 리스트 첫번째 인덱스(인덱스 0)에 추가함.
   * @param music {@link Music} 객체.
   * @return {@code 1}
   */
  public int addAtZero(Music music) {
    list.add(0, music);
    return 1;
  }

  /**
   * {@code List<Music>}을 반환함.
   * @return {@link List}&lt;{@link Music}&gt;
   */
  public List<Music> printAll() {
    return this.list;
  }

  /**
   * 리스트에서 곡을 검색힘.
   * @param title 바꾸려고 하는 곡의 이름.
   * @return 일치하는 곡이 있을 경우 {@link Music} 객체를 반환하고, 없으면 {@code null}을 반환함.
   */
  public Music searchMusic(String title) {
    for (Music music : this.list) {
      if (music.getTitle().equals(title)) {
        return music;
      }
    }

    return null;
  }

  /**
   * 리스트에서 곡을 제거함.
   * @param title 제거하려는 곡의 이름.
   * @return 일치하는 곡이 있을 경우 {@link Music} 객체를 반환하고, 없으면 {@code null}을 반환함.
   */
  public Music removeMusic(String title) {
    for (Music music : this.list) {
      if (music.getTitle().equals(title)) {
        list.remove(music);
        return music;
      }
    }

    return null;
  }

  /**
   * 곡의 이름을 찾아서 해당하는 곡이 존재하면 해당 곡을 교체함.
   * @param title 곡의 정보를 바꾸려는 곡의 이름.
   * @param music {@link Music} 객체.
   * @return 해당하는 곡이 있을 경우 {@link Music} 객체를 반환하고, 없으면 {@code null}을 반환함.
   */
  public Music setMusic(String title, Music music) {
    for (int i = 0; i < this.list.size(); i++) {
      Music currentMusic = this.list.get(i);

      if (title.equalsIgnoreCase(currentMusic.getTitle())) {
        this.list.set(i, music);
        return currentMusic;
      }
    }

    return null;
  }

  /**
   * 곡의 이름을 기준으로 오름차순으로 정렬함.
   * @return {@code 1}
   */
  public int ascTitle() {
    this.list.sort(new AscTitle());
    return 1;
  }

  /**
   * 가수 이름 기준으로 내림차순으로 정렬함.<br /><br />
   * 작동 방식
   * <ol>
   *   <li>{@link List}를 {@code toArray} 메소드를 이용해서 배열로 변환해서 임시 변수에 저장함.</li>
   *   <li>버블 정렬을 이용해서 내림차순으로 정렬함.</li>
   *   <li>리스트에서 모든 곡을 제거함.</li>
   *   <li>{@code Link.of}를 사용해서 임시 변수에 넣은 배열을 {@link List}로 변환함.</li>
   *   <li>변환된 {@link List}에 들어간 곡을 {@code addAll} 메소드를 사용해서 곡을 모두 추가함.</li>
   * </ol>
   * @return {@code 1}
   */
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
    List<Music> newMusicList = List.of(musics);
    list.addAll(newMusicList);

    return 1;
  }
}
