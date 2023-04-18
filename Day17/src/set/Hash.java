package set;

import java.util.LinkedList;

class HashTable {
  // Key, Value
  class Node {
    String key;
    String value;

    public Node(String key, String value) {
      this.key = key;
      this.value = value;
    }

    // 확인하는 메소드
    public String value() {
      return value;
    }

    // 수정하는 메소드
    public void value(String value) {
      this.value = value;
    }
  }

  // 충돌이 발생한 데이터를 저장할 때 사용하는 리스트
  LinkedList<Node>[] data;

  // 해시테이블에 데이터를 저장하는 개수(배열의 길이)
  public HashTable(int size) {
    this.data = new LinkedList[size];
  }

  public int getHashCode(String key) {
    // 문자열의 키를 받아오면 해시코드로 변환해서
    // 배열의 길이만큼 나눈 다음, 나눈 나머지 값을 인덱스 번호로 지정
    int hashCode = 0;

    for (char c : key.toCharArray()) {
      hashCode += c;
    }

    return hashCode;
  }

  // 더한 해시코드값을 인덱스 번호로 변환해 주는 메소드
  public int convertToIndex(int hashCode) {
    return hashCode % data.length;
  }

  public Node searchKey(LinkedList<Node> list, String key) {
    if (list == null)
      return null;

    for (Node node : list) {
      if (node.key.equals(key)) {
        return node;
      }
    }

    return null;
  }

  public void put(String key, String value) {
    int hashCode = this.getHashCode(key);
    int index = this.convertToIndex(hashCode);
    LinkedList<Node> list = data[index];

    if (list == null) {
      list = new LinkedList<>();
      data[index] = list;
    }

    Node node = this.searchKey(list, key);
    if (node == null) {
      list.addLast(new Node(key, value));
    } else {
      node.value(value);
    }
  }

  public String get(String key) {
    int hashcode = getHashCode(key);
    int index = convertToIndex(hashcode);
    LinkedList<Node> list = data[index];
    Node node = searchKey(list, key);
    return node == null ? "Not found" : node.value();
  }
}


public class Hash {
  // isEmpty(): 데이터가 존재하는지 확인
  // contains(): 지정된 Key가 존재하는지 검색
  // getOrDefault(): Key가 있으면 Value 반환

  // 해시
  //   해시 테이블, 해시 함수
  //   Key, Value

  // 해시가 실행되는 과정
  //   Key(문자, 숫자, 파일) -> 해시 함수 -> hashCode -> index -> value

  // 문자열을 한 글자씩 ASCII 코드로 변환해서 더해줌(?)

  // 패밀리 레스토랑의 메뉴 저장
  //   해시 내가 받은 키 값을 인덱스 번호호 사용한다

  // 인덱스 번호가 중복되면 (충돌하면)
  // 충돌을 방지하기 위해서 동일한 인덱스로 데이터가 들어오면
  // 선형구조(배열, 리스트)를 이용해서 저장하고 검색

  // 충돌
  //   인덱스 번호가 같거나, hashCode 값이 같을 경우

  public static void main(String[] args) {
    // 문자열의 길이를 가지고 인덱스로 사용
    // 문자열의 길이가 똑같다
    // 두 개 데이터가 하나의 인덱스 번호를 가지고 있는 것(충돌)
    // 안에 공간을 여러 개로 쪼개서 사용한다

    // hash 언제 써야하는지: Key가 String이면 쓴다
    // 중복 X 안에 Key, 값 모두 중복없이 쓰려면 HashSet
    //        안에 값을 중복 허용하려면 Map

    HashTable h = new HashTable(3);

    h.put("sung", "She is pretty");
    h.put("jin", "She is a model");
    h.put("hee", "She is an angel");
    h.put("min", "She is cute");
    h.put("min", "She is Pure");

    System.out.println(h.get("sung"));
    System.out.println(h.get("jin"));
    System.out.println(h.get("hee"));
    System.out.println(h.get("min"));
    System.out.println(h.get("min"));
  }
}
