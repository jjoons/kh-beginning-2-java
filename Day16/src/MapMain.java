
import java.util.HashMap;
import java.util.TreeMap;

public class MapMain {
  public static void main(String[] args) {
    // Map
    //   키(Key), 값(Value)가 쌍으로 구성된 객체를 저장하는 자료 구조
    //    예) 연락처, 국어사전, 영어사전
    //    기본 타입 -> 래퍼 클래스와 같이 사용해야한다
    //    배열 공간의 번호가 0부터 자동으로 구현
    //    Map 공간의 이름을 내가 마음대로 작성할 수 있다

    // 배열, 리스트 가장 큰 장점
    //   나란하게 메모리 공간이 선언
    //   인덱스 순서가 있는 자료형
    //   Map은 인덱스 번호가 부여되지 않는다
    //   반복문 쓸 수 없다 이용하는 방법은 forEach
    //   기준이 되는 Key 값은 중복되면 안 된다
    //   Value(값)는 중복 가능하다

    // HashMap
    HashMap<String, Integer> map = new HashMap<>();
    map.put("오십", 50);
    map.put("십", 10);
    map.put("삼십", 30);
    map.put("사십", 40);
    map.put("십", 1000);

    // 이름, 폰 번호
    HashMap<String, String> map2 = new HashMap<>();
    map2.put("이서희", "010-1234-1234");
    map2.put("김다다", "010-3455-1235");
    map2.put("하하", "010-3546-1236");
    map2.put("유재석", "010-4652-1237");

    System.out.println(map2);
    System.out.println(); // 공백, 줄바꿈
    System.out.println(map);

    // 부분적으로 출력, 원하는 값만 가져오기
    // get(key)
    System.out.println(map.get("오십"));
    System.out.println(map2.get("이서희"));

    // Map에서 Key만 출력
    System.out.println(map.keySet());

    for (String key : map.keySet()) {
      System.out.println(key + " " + map.get(key));
    }

    // 키 안에 삼십이 있니?
    String q = "삼십";
    boolean res = false;
    String r = "";

    for (String key : map.keySet()) {
      if (q.equals(key)) {
        //        r = "있다";
        //        System.out.println("찾는 Key가 있습니다");
        res = true;
      } /* else {
        //        r = "없다";
        //        System.out.println("찾는 Key가 없습니다");
        }*/
      //      System.out.println(res);

      if (res) {
        System.out.println("Key 있음");
      } else {
        System.out.println("Key 없음");
      }

      // TreeMap
      TreeMap<String, String> list2 = new TreeMap<>();

      list2.put("이서희", "010-1234-1234");
      list2.put("김다다", "010-3455-1235");
      list2.put("하하", "010-3546-1236");
      list2.put("유재석", "010-4652-1237");

      System.out.println(list2);
    }
  }
}

