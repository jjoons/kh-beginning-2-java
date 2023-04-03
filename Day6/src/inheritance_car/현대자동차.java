package inheritance_car;

public class 현대자동차 extends Car {
  public 현대자동차() {
    this.brandName = "현대자동차";
  }
}


class 아반떼 extends 현대자동차 {
}


class 그랜저 extends 현대자동차 {
}


class 제네시스 extends 현대자동차 {
  public 제네시스() {
    this.carName = "제네시스";
    this.maxSpeed = 300;
    this.grade = "대형";
  }

  public void 안마() {}
}

