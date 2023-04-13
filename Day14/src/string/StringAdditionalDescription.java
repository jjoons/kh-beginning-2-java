package string;

import java.util.Scanner;

public class StringAdditionalDescription {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 한문자를 비교하고 싶을 경우 

    String res = "Hello";
    String res2 = "HELLO";

    // 문자열은 대소문자 비교한다. 
    // Yes YES  대소문자 구분없이 문자열을 비교하고 

    boolean r = res.equalsIgnoreCase(res2);

    if (r) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }

    // 국어사전 영어사전 
    // 문자여러개 String 변수는 데이터가 유동적으로 
    // int 4byte 21억
    String str = "a";
    String str2 = "e";
    String str3 = "z";

    // compareTo() 같으면 0반환 
    //             비교하는 기준으로 기준보다 작다 음수 -1
    //                                 크면  양수 +1
    //  대소문자를 비교한다. 

    int ans = str2.compareToIgnoreCase(str3);

    if (ans > 0) {
      System.out.println(str3 + "기준보다 뒤쪽에 있다.");
    } else if (ans < 0) {
      System.out.println(str3 + "기준보다 앞쪽에 있다.");
    } else {
      System.out.println("값이 같다!");
    }

    // char 유니코드를 이용해서 값을 저장 
    // charAt(인덱스번호)
    // next 입력을 받았을 때 앞에 하나의 문자만 뽑아서
    // 저장해라! char 
    char ch = 'A';

    //  while (true) {
    //
    //      System.out.println("게임을 더 진행하시겠습니까?");
    //      char ans = sc.next().charAt(1);
    //      System.out.println(ans);
    //
    //      if (ans == 'N' || ans == 'n') {
    //          break;
    //      }
  }
}
