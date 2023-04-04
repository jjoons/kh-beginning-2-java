package override;

// 마법사 파이어볼 데이미가 10씩 공격
public class Wizard {
  public void fireball() {
    System.out.println(" 데미지 10씩 준다");
  }
}

// 마법사 전직. 파이어볼 데미지 30씩
class GreatWizard extends Wizard {
  @Override
  public void fireball() {
    super.fireball();
  }
}
