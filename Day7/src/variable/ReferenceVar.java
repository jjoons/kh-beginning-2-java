package variable;

class Employee {
  String name; // 이름: 직원 0, 직원 1
  int[] hours; // 요일별 일한 시간

  public Employee(String name, int[] hours) {
    this.name = name;
    this.hours = hours;
  }

  // 시간 출력
  public void printTotalHours() {
    System.out.println(name + " -> " + this.totalHours());
  }

  // 시간 계산
  public int totalHours() {
    int sum = 0; // 일한 시간을 누적하는 변수

    // for (int i = 0; i < this.hours.length; i++) {
    //   sum += this.hours[i];
    // }

    // forEach문
    /*
     * 배열 안에 데이터만큼만 반복
     * for (배열타입 변수명 : 배열명) {}
     * 
     * 배열 안에서 값만 꺼내온다
     */
    for (int i : hours) {
      // hours 배열에서 0번째 방부터 하나씩 꺼내서 num 변수에 저장한다.
      // 마지막 데이터가 나오고 더 이상 꺼낼 것이 없으면 자동으로 반복 종료
      sum += i; // sum = sum + i;
    }

    return sum;
  }
}

public class ReferenceVar {
  public static void main(String[] args) {
    // 레퍼런스 변수
    // 레퍼런스 변수란, 객체를 가리키는 변수다.

    // 배열 생성
    int[] hours0 = new int[] { 2, 4, 3, 4, 5, 8, 8 };

    // 객체 생성 (레퍼런스 변수 e0)
    Employee e0 = new Employee("직원0", hours0);
    e0.printTotalHours();

    // 객체들의 주소값을 여러 개 저장
    // 레퍼런스 배열
    // 직원 (객체들을 저장 및 관리하는 배열)
    Employee[] list = new Employee[8];

    // ==Custom==
    int[][] hoursList = new int[][] {
        { 2, 4, 3, 4, 5, 8, 8 },
        { 7, 3, 4, 3, 3, 4, 4 },
        { 3, 3, 4, 3, 3, 2, 2 },
        { 9, 3, 4, 7, 3, 4, 1 },
        { 3, 5, 4, 3, 6, 3, 8 },
        { 3, 4, 4, 6, 3, 4, 4 },
        { 3, 7, 4, 8, 3, 8, 4 },
        { 6, 3, 5, 9, 2, 7, 9 }
    };

    list = new Employee[hoursList.length];

    for (int i = 0; i < list.length; i++) {
      list[i] = new Employee("직원" + i, hoursList[i]);
    }

    for (Employee employee : list) {
      employee.printTotalHours();
    }
  }
}
