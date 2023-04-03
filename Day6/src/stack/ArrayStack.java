package stack;

import java.util.Stack;

class A {
	// 생성자가 없는 상태로 컴파일 시 기본 생성자가 생성됨
	// A() {}
}

public class ArrayStack {
	int top; // 마지막 데이터가 어디인지 알려주는 방 번호 (인덱스)
	int size; // 스택 배열의 크기
	int[] stack; //

	// 기본 생성자
	public ArrayStack() {}

	public ArrayStack(int size) {
		// if (size < 0)
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	// 추가
	public void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + " push");

	}

	// 삭제
	public void pop() {
		int a = stack[top];
		System.out.println(stack[top] + " pop");
		stack[top--] = 0;
	}

	// 조회
	public void peek() {
		System.out.println(stack[top] + " peek");
	}

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();

		// 추가
		stack1.push(2);

		// 삭제
		stack1.pop();
		stack1.remove(10);

		// 조회
		stack1.peek();

		// 스택 객체 생성
		ArrayStack stack = new ArrayStack(7);

		// 함수 실행
		stack.push(20);
		stack.push(10);
		stack.push(30);

		stack.peek();

		// remove(): 값 삭제
		//   삭제한 값을 확인하지 않고 그냥 삭제
		// 객체 리턴 pop(): 인덱스 삭제
		//   삭제한 값을 프로그래머에게 보여준다
		stack.pop(); // 30
		stack.pop(); // 10
		stack.pop(); // 20
		stack.pop(); //

		/*
		 * 자료 구조란?
		 *   - 데이터를 효율적으로 다룰 수 있게 도와주는 데이터 보관 방법
		 *   - 효율적(검색, 삭제, 추가) 쉬어야 한다.
		 *   
		 * 스택(Stack)
		 *   - 컴퓨터에서 아주 많이 사용되는 자료 구조
		 *   
		 * 후입선출(LIFO)
		 *   - 가장 최근에 들어온 데이터가 가장 먼저 나간다.
		 */

		/*
		 * 스택
		 *   - 브라우저의 뒤로 가기나 스마트폰 앱에서 뒤로가는 때에서도 사용됨
		 *   - 쓰레기통(드럼통)처럼 먼저 들어간 것이 가장 나중에 나옴
		 */
	}
}
