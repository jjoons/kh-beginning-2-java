package inheritance_car;

public class 현대자동차Solution {
  String brandName = "현대자동차";
  String model;
  int maxSpeed;
  String ranked;
  String color;
}


class 아반떼Solution extends 현대자동차Solution {
}


class 그랜저Solution extends 현대자동차Solution {
}


class 제네시스Solution extends 현대자동차Solution {
  void 안마기능() {}
}
