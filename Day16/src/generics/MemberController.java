

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
  private HashMap<String, Member> map = new HashMap<>();

  public boolean joinMembership(String id, Member temp) {
    // add(); -> true / false (Collection)
    map.put(id, temp);
    boolean res = map.containsKey(id);

    return res;
  }

  String loing(String id, String pass) {
    for (String s : map.keySet()) {
      if (s.equals(id) && map.get(s).getPass().equals(pass)) {

        for (String s2 : map.keySet()) {
          System.out.println(map.get(s2));
        }

        return s + "환영합니다.";
      }
    }

    return "아이디나 비밀번호를 확인하세요!";
  }

  boolean changPassword(String id, String oldPw, String newPw) {
    if (!map.containsKey(id)) {
      return false;
    }

    Member temp = map.get(id);
    temp.setPass(newPw);
    return true;
  }

  public void changeName(String id, String newName) {

  }

  public TreeMap<String, Member> sameName(String name) {
    return null;
  }
}
