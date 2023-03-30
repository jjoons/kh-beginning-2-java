package problems;

class Human {
	/**
	 * 이름
	 */
	private String name;
	/**
	 * 키
	 */
	private int height;
	/**
	 * 몸무게
	 */
	private double weight;

	public Human() {}

	public Human(String name, int height, double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
	}

	/**
	 * 이름 확인
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 이름 설정
	 * 
	 * @param name
	 * @return
	 */
	public String setName(String name) {
		if (name.length() < 2) {
			System.out.println("이름은 1글자로 설정할 수 없습니다");
			return null;
		}

		return this.name = name;
	}

	/**
	 * 키 확인
	 * 
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 키 설정
	 * 
	 * @param height
	 * @return
	 */
	public int setHeight(int height) {
		if (height <= 10) {
			System.out.println("키는 10cm보다 작을 수 없습니다");
			return -1;
		}

		return this.height = height;
	}

	/**
	 * 몸무게 얻기
	 * 
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * 몸무게 설정
	 * 
	 * @param weight
	 * @return
	 */
	public double setWeight(double weight) {
		if (weight < 10) {
			System.out.println("몸무게는 10kg 미만일 수 없습니다");
		}

		return this.weight = weight;
	}

	/**
	 * 살 붙음
	 * 
	 * @param weight
	 * @return
	 */
	public double gainWeight(double weight) {
		if (weight <= 0) {
			System.out.println("0보다 작거나 같은 몸무게를 입력할 수 없습니다");
		}

		return this.weight += weight;
	}

	/**
	 * 살 빠짐
	 * 
	 * @param weight 몸무게
	 * @return
	 */
	public double reduceWeight(double weight) {
		if (this.weight < weight) {
			System.out.println("빠진 몸무게가 현재 몸무게보다 큽니다");
			return -1;
		} else if (weight <= 0) {
			System.out.println("0보다 작거나 같은 몸무게를 입력할 수 없습니다");
			return -1;
		}

		return this.weight -= weight;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + ", 키: " + this.height + "cm, 몸무게: " + weight
				+ "kg";
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Human gildong = new Human();

		gildong.setName("홍길동");
		gildong.setHeight(170);
		gildong.setWeight(65);

		String gildongInfo = gildong.toString();
		System.out.println(gildongInfo);

		gildong.gainWeight(0);
		System.out.println(gildong.toString());

	}
}
