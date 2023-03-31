package methods;

import java.util.Scanner;

public class Reservation {
	public static int objection(String destination) throws Exception {
		int price;

		switch (destination) {
			case "춘천":
				price = 5000;
				break;
			case "수원":
				price = 3000;
				break;
			case "대전":
				price = 25000;
				break;
			case "광주":
			case "대구":
				price = 35000;
				break;
			case "부산":
				price = 40000;
				break;
			default:
				throw new Exception("목록에 없는 지역을 입력했습니다: " + destination);
		}

		return price;
	}

	public static int train(String train) throws Exception {
		int price;

		switch (train) {
			case "KTX":
				price = 10000;
				break;
			case "SRT":
				price = 5000;
				break;
			case "새마을호":
				price = 1000;
				break;
			case "무궁화호":
				price = 2000;
				break;
			default:
				throw new Exception("목록에 없는 열차를 입력했습니다: " + train);
		}

		return price;
	}

	public static void main(String[] args) {
		/*
		 * 열차 예매
		 * 함수명: objection
		 *
		 * 1. 목적지를 매개변수로 받으면 운임비를
		 *    main에 있는 pay 변수에 저장
		 *
		 *    목적지  운임비
		 *    춘천    5000
		 *    수원    3000
		 *    대전    25000
		 *    광주    35000
		 *    부산    40000
		 *    대구    35000
		 *
		 * 출력
		 *    목적지를 입력하세요:
		 *    수원
		 *    수원의 운임비는 3000원입니다
		 */

		Scanner scanner = new Scanner(System.in);
		int pay;
		String name;

		while (true) {
			System.out.print("목적지를 입력하세요: ");
			name = scanner.next();

			try {
				pay = objection(name);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주시기 바랍니다");
			}
		}

		System.out.println(name + "의 운임비는 " + pay + "원입니다");

		/*
		 * 함수명 train
		 * 매개변수 열차의 종류
		 *
		 * 종류
		 *   KTX 10000
		 *   SRT 5000
		 *   새마을호 1000
		 *   무궁화호 2000
		 *
		 * return 열차_종류의_운임비;
		 *
		 * 열차운임비를 받아서 main에 있는 pay 변수에 저장
		 *
		 * 출력 결과
		 *   열차의 종류 입력: srt
		 *   수원까지 가는 총 운임비는 8000원입니다
		 */

		for (; ; ) {
			System.out.print("열차 종류 입력: ");
			String trainName = scanner.next();

			try {
				pay += train(trainName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주시기 바랍니다");
			}
		}

		System.out.println(name + "까지 가는 총 운임비는 " + pay + "원입니다");
	}
}
