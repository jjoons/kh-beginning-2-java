package problem.a1;

import java.util.Comparator;

public class AscTitle implements Comparator<Object> {
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
