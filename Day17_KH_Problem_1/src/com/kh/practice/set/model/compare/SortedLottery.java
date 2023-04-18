package com.kh.practice.set.model.compare;

import java.util.Comparator;
import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery<T> implements Comparator<T> {
  @Override
  public int compare(Object o1, Object o2) {
    if (o1 instanceof Lottery l1 && o1 instanceof Lottery l2) {
      System.out.println("SortedLottery.compare");

      // TODO
      int nameResult = l1.getName().compareTo(l2.getName());
      System.out.println(l1.getName() + " / " + l2.getName());

      if (nameResult == 0) {
        return l1.getPhone().compareTo(l2.getPhone());
      }

      return nameResult;
    }

    return 0;
  }
}
