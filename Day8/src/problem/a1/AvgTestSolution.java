package problem.a1;

class AvgSolution {
  int kor; // 0
  int eng;
  int mat;
  double avg; // 0.0

  public void average(int kor, int eng) {
    this.avg = (kor + eng) / 2;
    System.out.println("평균: " + this.avg);
  }

  public void average(int kor, int eng, int mat) {
    this.avg = (double) (kor + eng + mat) / 3;
    System.out.println("평균: " + this.avg);
  }
}

public class AvgTestSolution {
  public static void main(String[] args) {

  }
}
