package new_market;

public class Manager extends Member {
  private String id;
  private String password;

  public Manager(String name, String phoneNumber) {
    super(name, phoneNumber);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public int hashCode() {
    return (this.getName() + this.getPhoneNumber() + this.id + this.password).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;

    if (obj instanceof Manager manager) {
      return this.getName().equals(manager.getName()) && this.getPhoneNumber().equals(manager.getPhoneNumber())
        && this.id.equals(manager.getId()) && this.password.equals(manager.getPassword());
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("이름: %s\t연락처: %s\n아이디: %s\t비밀번호: %s", this.getName(), this.getPhoneNumber(), this.id, this.password);
  }
}
