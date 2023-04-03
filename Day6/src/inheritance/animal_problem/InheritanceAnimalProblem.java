package inheritance.animal_problem;

class Animal {
  String name;

  public void cry() {
    System.out.println("cry");
  }
}


class Pet extends Animal {
  int age;
  int price;

  public void play() {
    System.out.println("play");
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " { name: " + this.name + ", age: " + this.age
        + "세, price: " + this.price + "원 }";
  }
}


class Elf {
  String name;
  int hp = 100;

  @Override
  public String toString() {
    return "[엘프] Name: " + this.name + ", HP: " + this.hp;
  }
}


class HighElf extends Elf {
  int mp = 100;

  public HighElf() {
    this.hp = 160;
  }

  @Override
  public String toString() {
    return "[하이엘프] Name: " + this.name + ", HP: " + this.hp + ", MP: " + this.mp;
  }
}


class ElfLord extends HighElf {
  int shield = 100;

  public ElfLord() {
    this.hp = 230;
    this.mp = 140;
  }

  @Override
  public String toString() {
    return "[엘프로드] Name: " + this.name + ", HP: " + this.hp + ", MP: " + this.mp + ", SH: "
        + this.shield;
  }
}


public class InheritanceAnimalProblem {
  public static void main(String[] args) {
    Pet myPet = new Pet();
    myPet.name = "차우차우";
    myPet.age = 3;
    myPet.price = 2_200_000;
    System.out.println(myPet);

    Elf elf = new Elf();
    elf.name = "티란데";
    System.out.println(elf);

    HighElf highElf = new HighElf();
    highElf.name = "말퓨리온";
    System.out.println(highElf);

    ElfLord elfLord = new ElfLord();
    elfLord.name = "마이에브";
    System.out.println(elfLord);
  }
}
