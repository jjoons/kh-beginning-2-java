package problem.a1;

import java.util.Comparator;

public class AscTitle implements Comparator<Object> {
  /**
   * 곡을 정렬할 때 사용되는 {@link Comparator}의 구현 메소드.
   * 파라미터로 들어오는 두 객체가 {@link Music} 객체가 맞으면 서로 간의 제목을 비교함.
   * 제목이 같으면 가수 순대로 정렬하며 다르면 그에 맞는 값을 반환함.
   * 만약 {@link Music} 객체가 아니면 "0"을 반환함.
   * @param o1 the first object to be compared.
   * @param o2 the second object to be compared.
   */
  @Override
  public int compare(Object o1, Object o2) {
    if (o1 instanceof Music music1 && o2 instanceof Music music2) {
      int returnValue = music1.getTitle().compareToIgnoreCase(music2.getTitle());

      if (returnValue == 0) {
        return music1.getSinger().compareToIgnoreCase(music2.getSinger());
      }

      return returnValue;
    }

    return 0;
  }
}
