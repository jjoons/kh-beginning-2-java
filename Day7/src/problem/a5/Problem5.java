package problem.a5;

class Player {
  String name;
  int[] points;

  public Player(String name, int[] points) {
    this.name = name;
    this.points = points;
  }

  public void printTotalPoints() {
    System.out.println(this.name + " -> " + this.totalPoints() + "점");
  }

  public int totalPoints() {
    int sum = 0;

    for (int i : points) {
      sum += i;
    }

    return sum;
  }
}

public class Problem5 {
  public static void main(String[] args) {
    String[] names = new String[] {
        "Kim", "Lee", "Park"
    };
    int[][] points = new int[][] {
        { 10, 9, 9, 8 },
        { 9, 10, 9, 9 },
        { 10, 9, 10, 10 }
    };
    Player[] players = new Player[names.length];

    for (int i = 0; i < names.length; i++) {
      players[i] = new Player(names[i], points[i]);
    }

    for (Player player : players) {
      player.printTotalPoints();
    }
  }
}
