package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
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
    ArrayList<Lottery> bList = new ArrayList<>(this.win);

    for (int i = 0; i < aList.size(); i++) {
      Lottery l1 = aList.get(i);

      for (int j = 0; j < bList.size(); j++) {
        Lottery l2 = bList.get(j);

        if (!aList.contains(l2)) {
          bList.remove(j);
        }
      }
    }

    while (this.win.size() < 4) {
      int randomValue = this.random.nextInt(this.lottery.size());
      Lottery lot = aList.get(randomValue);
      this.win.add(lot);
    }

    return this.win;
  }

  public TreeSet<Lottery> sortedWinObject() {
    // TODO
    // Comparator로 서로 간의 값을 비교하는데 서로 간의 값이 같음

    TreeSet<Lottery> sortedSet = new TreeSet<>(new SortedLottery<>());
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
