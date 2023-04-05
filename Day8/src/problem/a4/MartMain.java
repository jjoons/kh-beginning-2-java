package problem.a4;

import java.util.ArrayList;

interface Food {
  double DISCOUNT_RATE = 0.9;
}

interface EletronicDevice {
  double DISCOUNT_RATE = 0.8;
}

interface Cloth {
  double DISCOUNT_RATE = 0.7;
}

abstract class Item {
  protected int price;
  protected double discountRate;

  abstract int getPrice();

  abstract double getDiscountRate();
}

class Jogbal extends Item implements Food {
  public Jogbal(int price) {
    this.price = price;
    this.discountRate = Food.DISCOUNT_RATE;
  }

  @Override
  public int getPrice() {
    return this.price;
  }

  @Override
  double getDiscountRate() {
    return this.discountRate;
  }
}

class AirPods extends Item implements EletronicDevice {
  public AirPods(int price) {
    this.price = price;
    this.discountRate = EletronicDevice.DISCOUNT_RATE;
  }

  @Override
  int getPrice() {
    return this.price;
  }

  @Override
  double getDiscountRate() {
    return this.discountRate;
  }
}

class Shirts extends Item implements Cloth {
  public Shirts(int price) {
    this.price = price;
    this.discountRate = Cloth.DISCOUNT_RATE;
  }

  @Override
  int getPrice() {
    return 0;
  }

  @Override
  double getDiscountRate() {
    return 0;
  }
}

public class MartMain {
  public static void main(String[] args) {
    ArrayList<Item> wishList = new ArrayList<>();

    wishList.add(new Jogbal(19800));
    wishList.add(new AirPods(199000));
    wishList.add(new Shirts(49900));

    final int[] totalPrice = {0};

    wishList.forEach(item -> totalPrice[0] += item.getPrice());
  }
}
