
import java.util.HashMap;

class User {
  private String id;
  private String pw;

  // 생성자
  // 메소드 오버로딩
  public User() {}

  public User(String id, String pw) {
    this.id = id;
    this.pw = pw;
  }

  // Setter, Getter

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return "User{" + "id='" + id + '\'' + ", pw='" + pw + '\'' + '}';
  }
}


public class UserMain {
  public static void main(String[] args) {
    // ID, PW 3개 정도 저장
    User p = new User("asdf", "1111");
    User p2 = new User("zxcv", "2222");
    User p3 = new User("xcvb", "3333");

    HashMap<String, User> list = new HashMap<>();
    list.put(p.getId(), p);
    list.put(p2.getId(), p2);
    list.put(p3.getId(), p3);

    // 1. Key가 있는지 확인
    // 2. ID -> "qwer"로 수정
    String find = "asdf";

    for (String key : list.keySet()) {
      if (find.equals(key)) {
        // 찾았다. 그럼 수정
        list.get(key).setId("qwer");
        break;
      }
    }

    System.out.println(list);
  }
}
