package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
  private HashMap<Farm, Integer> hMap = new HashMap<>();
  private ArrayList<Farm> list = new ArrayList<>();

  public boolean addNewKind(Farm f, int amount) {
    if (!this.hMap.containsKey(f)) {
      this.hMap.put(f, amount);
      return true;
    }

    return false;
  }

  public boolean removeKind(Farm f) {
    if (this.hMap.containsKey(f)) {
      this.hMap.remove(f);
      return true;
    }

    return false;
  }

  public boolean changeAmount(Farm f, int amount) {
    if (this.hMap.containsKey(f)) {
      this.hMap.put(f, amount);
      return true;
    }

    return false;
  }

  public HashMap<? extends Farm, Integer> printFarm() {
    return this.hMap;
  }

  public boolean buyFarm(Farm f) {
    int value = -1;

    if (this.hMap.containsKey(f) && (value = this.hMap.get(f)) >= 0) {
      this.list.add(f);
      this.hMap.put(f, value - 1);
      return true;
    }

    return false;
  }

  public boolean removeFarm(Farm f) {
    if (this.list.contains(f)) {
      this.list.remove(f);
      this.hMap.compute(f, (t, u) -> u + 1);
      return true;
    }

    return false;
  }

  public ArrayList<Farm> printBuyFarm() {
    return this.list;
  }
}
