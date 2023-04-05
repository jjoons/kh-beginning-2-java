package problem.a1;

class Avg {
  public int average(int kor, int eng) {
    return (kor + eng) / 2;
  }

  public int average(int kor, int eng, int mat) {
    return (kor + eng + mat) / 3;
  }
}

public class AvgTest {
  public static void main(String[] args) {
    Avg a = new Avg();

    int twoAverage = a.average(90, 80);
    int threeAverage = a.average(90, 80, 90);

    System.out.println("국어, 영어 평균: " + twoAverage);
    System.out.println("국수영 평균: " + threeAverage);
  }
}
