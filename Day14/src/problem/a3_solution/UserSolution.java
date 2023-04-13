package problem.a3_solution;

public class UserSolution implements Cloneable {
  private String id, pw;

  public UserSolution(String id, String pw) {
    this.id = id;
    this.pw = pw;
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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof UserSolution)) {
      return false;
    }

    UserSolution user = (UserSolution) obj;
    if (this.id == user.id && this.pw == user.pw) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  // 오버라이딩은 꼭 메소드의 내용을 재정의할 때만 사용하지 않음
  // 접근 제어자를 변경할 때도 사용할 수 있다
  // User 클래스 객체들은 누구나 접근해서 복사할 수 있도록 설정

  // protected 접근 제어가 되어있으면 User 클래스를 누군가가 상속을 받아야한다.
  // 상속받은 자식 클래스가 객체를 생성해야만 clone() 복사 메소드를 사용할 수 있다

  // 무분별하게 객체들을 복사하는 경우가 생길 수 있다
  // 조건: Cloneable 인터페이스
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

// hashcode() 메소드
//   객체의 주소값을 이용해서 해싱 기법을 이용해 해시 코드를 만든 후 반환
//   서로 다른 객체는 같은 해시 코드를 가질 수 없다
//   해시 코드는 주소값이 아니고 주소값으로 만든 고유의 숫자값
//   int 형태로 표현
