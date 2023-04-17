package generics;

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
  private HashMap<String, Member> map = new HashMap<>();

  public boolean joinMembership(String id, Member m) {
    return false;
  }

  public String login(String id, String pw) {
    return "";
  }

  public boolean changePassword(String id, String oldPw, String newPw) {
    return false;
  }

  public void changeName(String id, String newName) {

  }

  public TreeMap<String, Member> sameName(String name) {
    return null;
  }
}
