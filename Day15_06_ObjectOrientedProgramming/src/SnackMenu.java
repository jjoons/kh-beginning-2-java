import java.util.InputMismatchException;
import java.util.Scanner;

public class SnackMenu {
  private Scanner sc = new Scanner(System.in);
  private SnackController scr = new SnackController();

  public void menu() {
    System.out.println("스낵류를 입력하세요.");

    System.out.println("종류: ");
    String kind = this.sc.nextLine();

    System.out.println("이름: ");
    String name = this.sc.nextLine();

    System.out.println("맛: ");
    String flavor = this.sc.nextLine();

    int numOf;
    while (true) {
      System.out.println("개수: ");
      try {
        numOf = this.sc.nextInt();
        break;
      } catch (InputMismatchException e) {
        this.sc.nextLine();
        System.out.println("숫자만 입력할 수 있습니다.");
      }
    }

    int price;
    while (true) {
      System.out.println("가격: ");
      try {
        price = this.sc.nextInt();
        break;
      } catch (InputMismatchException e) {
        this.sc.nextLine();
        System.out.println("숫자만 입력할 수 있습니다.");
      }
    }
    this.sc.nextLine();

    String result = scr.saveData(kind, name, flavor, numOf, price);
    System.out.println(result);

    while (true) {
      System.out.println("저장한 정보를 확인하시겠습니까?(y/n): ");
      String confirmValue = this.sc.nextLine();

      if (confirmValue.equalsIgnoreCase("y")) {
        String data = scr.confirmData();
        System.out.println(data);
        break;
      } else if (confirmValue.equalsIgnoreCase("n")) {
        break;
      } else {
        System.out.println("y/n 중에서 하나만 입력해주시기 바랍니다");
      }
    }
  }
}
