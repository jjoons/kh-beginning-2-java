package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.Predicate;
import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
  private HashSet<Lottery> lottery = new HashSet<>();
  private HashSet<Lottery> win = new HashSet<>();
  private Random random = new Random();

  public boolean insertObject(Lottery l) {
    return this.lottery.add(l);
  }

  public boolean deleteObject(Lottery l) {
    boolean returnValue;

    if ((returnValue = this.lottery.remove(l)) && this.win != null) {
      win.remove(l);
    }

    return returnValue;
  }

  public HashSet<Lottery> winObject() {
    int winCount = 4;

    if (this.lottery.size() < winCount)
      return null;

    ArrayList<Lottery> aList = new ArrayList<>(this.lottery);
    int size = aList.size();

    int[] ia = {0};
    for (; ia[0] < winCount; ia[0]++) {
      int randomValue = this.random.nextInt(size);
      Lottery l1 = aList.get(randomValue);

      aList.removeIf((Predicate<Lottery>) t -> {
        boolean result = t.equals(l1);

        if (result)
          ia[0]--;

        return result;
      });

      this.win.add(aList.get(randomValue));
    }

    return this.win;
  }

  public TreeSet<Lottery> sortedWinObject() {
    TreeSet<Lottery> sortedSet = new TreeSet<>(new SortedLottery<Object>());
    sortedSet.addAll(this.win);

    return sortedSet;
  }

  public boolean searchWinner(Lottery l) {
    for (Lottery win : this.win) {
      if (win.equals(l))
        return true;
    }

    return false;
  }
}
