package problem.a3;

public class User {
  // equals() 오버라이딩
  // private id, pw 멤버 변수
  // 기본생성자 미사용
  // set, get 메소드를 이용해서 확인 및 수정

  // 회원가입 시 qwer qwer 객체 생성
  // User()

  // 로그인 시 id, pw 입력하세요
  // equals(Object o);
  // temp = User() scanner로 입력을 받아서 넘겨주면 됨
  // 안에서 id, pw 비교해서 두 개 다 같으면
  //   true -> "로그인 성공입니다 id + 님 환영합니다"
  //   false -> "아이디 또는 비밀번호를 확인하세요"
  private String id;
  private String pw;

  public User(String id, String pw) {
    this.id = id;
    this.pw = pw;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof User user) {
      return user.getId().equals(this.getId()) && user.getPw().equals(this.getPw());
    }

    return false;
  }

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
}


/*  @Override
public boolean equals(Object obj) {
  if (obj instanceof User user) {
    boolean success = user.id == this.getId() && user.pw == this.getPw();

    if (success) {
      System.out.println("로그인 성공입니다 " + this.id + "님 환영합니다");
    }

    return success;
  }

  System.out.println("아이디 또는 비밀번호를 확인하세요");

  return false;
}*/
