package innerclass;

class PocketBall {
  int size = 100;
  static int price = 5000;

  class User {
    String name;

    public User(String name) {
      this.name = name;
    }
  }

  static class PocketMonster {
    static String name = "이상해씨";
    int level = 10;

    public static void getPocketMember() {
      // 외부 클래스의 인스턴스 멤버에 접근할 수 없다
      //      System.out.println(size);
      System.out.println(price);
      System.out.println(name);

      //      System.out.println(level);
    }
  }
}


public class Total {
  public static void main(String[] args) {
    // static하고 member 클래스와 같이 사용할 수 있다
    new PocketBall.PocketMonster();

    PocketBall.User u1 = new PocketBall().new User("");

    /*
     * 1) 인스턴스 클래스(instance class)
     * 
     *   - field(클래스의 멤버 변수)선언부에 위치하고 static 키워드가 없는 내부 클래스.(인스턴스 멤버 클래스라고도 한다.)
     * 
     *   - 외부 클래스의 멤버이기 때문에 외부 클래스의 객체 먼저 생성한 후 내부 클래스의 객체를 생성하여 사용해야 한다.
     * 
     *   - 인스턴스 클래스 내부에는 instance member만 선언할 수 있다. static member는 선언 불가.
     * 
     *   - 컴파일시 생성되는 클래스 파일명 : "외부 클래스 $ 내부 클래스.class"
     * 
     *   - 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
     */

    /*
     * 2)스테틱 클래스(static class)
    
    - field(클래스의 멤버 변수)선언부에 위치하고 static 키워드가 붙은 내부 클래스.(스테틱 멤버 클래스라고도 한다.)
    
    - 외부 클래스의 멤버이지만, static이 붙어있기 때문에 외부 클래스의 객체를 생성하지 않고도 내부 클래스의 객체를 생성할 수 있다.
    
    - 스테틱 클래스 내부에는 instance member와 static member 모두 선언 할 수 있다. -> 무슨차이가 있지..?
    
    - 컴파일시 생성되는 클래스 파일명 : "외부 클래스 $ 내부 클래스.class"
     */

    /*
     * *class에 붙는 static과 멤버에 붙는 static의 의미차이
    
    클래스에 붙는 static과 클래스의 멤버, 즉 field와 method에 붙는 static키워드의 의미는 다르다.
    
    익히 알고 있듯이 멤버에 붙는 static키워드는 정적으로 메모리를 잡아준다는 의미로서 컴파일 타임에 컴파일러가 메모리를 할당해 주기 때문에 객체생성 없이도 사용 가능하다는 의미이다. 반면
    
    클래스에 붙는 static은 외부 클래스의 객체 생성없이 내부 클래스의 객체를 생성할 수 있다는 의미이다.
    
     */
  }
}
