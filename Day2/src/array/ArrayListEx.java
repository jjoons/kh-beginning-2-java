package array;

import java.util.ArrayList;

class ALEx {
	public void example1() {
		// 공간을 자동으로 추가/삭제하고 조회
		// 배열을 쓰는데 편하게 여러 개의 데이터를 저장하고 싶을 때
		// ArrayList<자료형>

		// 정수를 저장하고 싶으면
		ArrayList<Integer> list1 = new ArrayList<>();

		// 추가 add(값)
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(30); // 중복 허용
		list1.add(1); // 순서 보장

		// 출력
		System.out.println(list1);

		// 길이
		System.out.println(list1.size());

		// 조회 indexOf(찾는값) -> index
		int removeIndex = list1.indexOf(20);

		// 삭제
		list1.remove(removeIndex);

		// 실수를 저장하는 배열
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(1.254);
		list2.add(101.2456);
		list2.add(2.254);
		list2.add(200.2);

		System.out.println(list2);

		// 200.2 찾아서 삭제
		// indexOf()
		int removeIndex2 = list2.indexOf(200.2);

		// remove()
		list2.remove(removeIndex2);

		// 출력
		System.out.println(list2);

		// 문자열을 저장하는 배열
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("김연아");
		list3.add("강동원");
		list3.add("진");

		System.out.println(list3);

		int removeIndex3 = list3.indexOf("진");
		list3.remove(removeIndex3);
		System.out.println(list3);

		// 안에 있는 내용 모두 삭제
		list3.clear();
		list2.clear();
		list1.clear();

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}

public class ArrayListEx {

	public static void main(String[] args) {
		ALEx c = new ALEx();
		c.example1();
	}

}
