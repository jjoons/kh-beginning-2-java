package com.kh.practice.generics.controller;

import com.kh.practice.generics.model.vo.Farm;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
  private HashMap<Farm, Integer> hMap = new HashMap<>();
  private ArrayList<Farm> list = new ArrayList<>();

  public <T extends Farm> boolean addNewKind(T f, int amount) {
    if (!this.hMap.containsKey(f)) {
      this.hMap.put(f, amount);
      return true;
    }

    return false;
  }

  public <T extends Farm> boolean removeKind(T f) {
    if (this.hMap.containsKey(f)) {
      this.hMap.remove(f);
      return true;
    }

    return false;
  }

  public <T extends Farm> boolean changeAmount(T f, int amount) {
    if (this.hMap.containsKey(f)) {
      this.hMap.put(f, amount);
      return true;
    }

    return false;
  }

  public HashMap<Farm, Integer> printFarm() {
    return this.hMap;
  }

  public <T extends Farm> boolean buyFarm(T f) {
    int value;

    if (this.hMap.containsKey(f) && (value = this.hMap.get(f)) >= 0) {
      this.list.add(f);
      this.hMap.put(f, value - 1);
      return true;
    }

    return false;
  }

  public <T extends Farm> boolean removeFarm(T f) {
    if (this.list.contains(f)) {
      this.list.remove(f);
      this.hMap.computeIfPresent(f, (farm, integer) -> integer + 1);
      return true;
    }

    return false;
  }

  public ArrayList<Farm> printBuyFarm() {
    return this.list;
  }
}
