// 아래와 같은 4개의 Hero 객체를 생성하고
// 이들의 정보를 출력하려 한다.
// 주어는 Hero 클래스에 생성자를 완성하여
// 출력 예와 같은 결과를 얻으시오.
/*
 * 아이언맨(hp: 80)
 * 타노스(hp: 160)
 * 토르(hp: 150)
 * 그루트(hp: 40)
 */

class Hero {
	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void printInfo() {
		System.out.println(this.name + "(hp: " + this.hp + ")");
	}
}

public class ClassEx04Problem2 {
	public static void main(String[] args) {
		new Hero("아이언맨", 80).printInfo();
		new Hero("타노스", 160).printInfo();
		new Hero("토르", 150).printInfo();
		new Hero("그루트", 40).printInfo();
	}
}
