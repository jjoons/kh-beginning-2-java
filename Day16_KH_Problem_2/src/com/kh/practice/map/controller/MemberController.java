package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import com.kh.practice.map.model.vo.Member;

public class MemberController {
  Map<String, Member> map = new HashMap<>();

  public boolean joinMembership(String id, Member m) {
    if (this.map.containsKey(id)) {
      return false;
    }

    this.map.putIfAbsent(id, m);
    return this.map.containsKey(id);
  }

  public String login(String id, String password) {
    Member member = this.map.get(id);

    return member != null && member.getPassword().equals(password) ? member.getName() : null;
  }

  public boolean changePassword(String id, String oldPw, String newPw) {
    Member member = this.map.get(id);

    if (member != null && member.getPassword().equals(oldPw)) {
      member.setPassword(newPw);
      return true;
    }

    return false;
  }

  public void changeName(String id, String newName) {
    if (this.map.containsKey(id))
      this.map.get(id).setName(newName);
  }

  public TreeMap<String, String> sameName(String name) {
    TreeMap<String, String> returnMap = new TreeMap<>();

    for (String id : this.map.keySet()) {
      Member mem = this.map.get(id);

      if (mem.getName().equals(name)) {
        returnMap.put(id, name);
      }
    }

    return returnMap;
  }
}
