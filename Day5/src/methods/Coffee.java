package methods;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class User_Coffee {
	static int currentOrderNumber = 1000;
	String info;
	int orderNumber = ++currentOrderNumber;
	int price;
	String menu;
	String size;
	int remainCount = 3;
	ArrayList<String[]> orderMenus = new ArrayList<>();

	public User_Coffee() {
		System.out.println("Welcome to Harry Cafe");
	}

	public void buyCoffee() throws Exception {
		// int maxMenu = 0;

		coffee();
		train();

		// maxMenu++;

//		System.out.print("주문한 커피는 " + +" 커피를 더 주문하실건가요? (y/n): ");
//		String inputValue = Coffee.sc.next();

		price();
	}

	public void remain(Exception e) throws Exception {
		if (--this.remainCount <= 0) {
			throw new Exception(e.getMessage() + "\n사용 방법을 확인하신 후 다시 이용해 주시기 바랍니다");
		}

		System.out.println("재입력 횟수 " + this.remainCount + "번 남았습니다. 다시 입력해 주세요");
	}

	public void coffee() throws Exception {
		while (true) {
			System.out.print("Choose 1: Americano / Cafe Mocha / Cafe Latte / Green Tea Latte: ");
			this.menu = Coffee.sc.nextLine();

			try {
				price += getCoffeePrice(this.menu);
				break;
			} catch (Exception e) {
				this.remain(e);
			}
		}
	}

	public void train() throws Exception {
		while (true) {
			System.out.println("Choose Size: G(grande) / R(regular) / S(short): ");
			String inputValue = Coffee.sc.nextLine();

			try {
				this.size = getTrainName(inputValue);
				price += getTrainPrice(this.size);

				break;
			} catch (Exception e) {
				this.remain(e);
			}
		}
	}

	public int getCoffeePrice(String menuName) throws Exception {
		return switch (menuName) {
			case "Americano" -> 3900;
			case "Cafe Mocha" -> 45000;
			case "Cafe Latte" -> 50000;
			case "Green Tea Latte" -> 55000;
			default -> throw new Exception("해당 메뉴는 없습니다: " + menuName);
		};
	}

	public String getTrainName(String sizeName) throws Exception {
		return switch (sizeName) {
			case "G" -> "grande";
			case "R" -> "regular";
			case "S" -> "short";
			default -> throw new Exception("해당 사이즈는 없습니다: " + sizeName);
		};
	}

	public int getTrainPrice(String sizeName) throws Exception {
		return switch (sizeName) {
			case "grande" -> 1000;
			case "regular" -> 500;
			case "short" -> 0;
			default -> throw new Exception("해당 사이즈는 없습니다: " + sizeName);
		};
	}

	public void price() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("총 금액은 " + df.format(this.price) + "원입니다");
	}
}

public class Coffee {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// price() 함수
		//   매개 변수로 커피의 가격과 사이즈의 가격을 받는다
		//   return 하지 말고 println() 으로 출력
		//
		// 출력
		//   총 가격: **원입니다.


		// User_Coffee 클래스
		//   정보, 주문 번호, 지불 금액, 메뉴, 사이즈
		// User_Coffee 클래스의 정보를 출력하는
		// 함수를 만들어서 출력해보세요! return X

		User_Coffee c = new User_Coffee();
		c.buyCoffee();

	}
}
