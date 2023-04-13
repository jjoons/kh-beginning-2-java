package generice;

import java.util.ArrayList;

public class GenericMain2 {
  public static void main(String[] args) {
    //    Person<Integer, Double> p1 = new Person();
    Person p2 = new Person<String, Integer>();

    ArrayList<Person> list = new ArrayList<>();
  }
}
