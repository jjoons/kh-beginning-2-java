package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueueProblem {
  public static void main(String[] args) {
    // 자료 구조 큐를 이용해서
    // 뽀로로
    // 크롱
    // 루피
    // 포비

    Queue<String> q = new LinkedList<>();

    q.add("뽀로로");
    q.add("크롱");
    q.add("루피");
    q.add("포비");

    while (!q.isEmpty()) {
      System.out.println(q.poll());
    }
  }
}
