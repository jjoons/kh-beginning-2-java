package supermario;

import java.util.Arrays;
import java.util.Random;

class Character {
	// 정보
	String name;
	int hp;
	int damage;

	// 기본생성자
	public Character() {}

	// 생성자
	public Character(String _name, int _hp, int damage) {
		name = _name;
		hp = _hp;
		this.damage = damage;
	}

	public void attack(Character ch) { // 공격한 대상말고 맞는 대상을 attack()
		System.out.println(this.name + "가 " + ch.name + "한테" + " 불주먹 공격!");
		ch.hp -= this.damage;
		System.out.println(ch.name + "의 남은 HP: " + ch.hp);
	}
}

public class Main {
	public void ex1() {
		Random rand = new Random();

		// 마리오 객체 생성
		Character mario = new Character("마리오", 150, 50);
		Character luigi = new Character("루이지", 150, 50);
		Character peach = new Character("피치공주", 150, 50);
		Character coopa = new Character("쿠파", 300, 50);

		// 우리는 한 팀
		Character[] team = new Character[3];

		// 마리오, 피치공주, 루이지 각각 저장
		team[0] = mario;
		team[1] = luigi;
		team[2] = peach;

		// 마리오 -> 루이지 -> 피치공주 순대로 공격
		team[0].attack(coopa);
		team[1].attack(coopa);
		team[2].attack(coopa);

		// 마리오가 주먹 공격을 한다
		//		mario.attack(coopa);

		// 랜덤값을 이용
		coopa.attack(team[rand.nextInt(3)]);

		// 쿠파가 주먹 공격을 한다
		// coopa.attack(mario);
	}

	public static void main(String[] args) {
		Main c = new Main();
		// c.ex1();
		int[] z = c.getRandomsInt(3, 3);
		System.out.println(Arrays.toString(z));
	}

	public int[] getRandomsInt(int bound, int size) {
		Random rand = new Random();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(bound);
		}

		return arr;
	}
}
