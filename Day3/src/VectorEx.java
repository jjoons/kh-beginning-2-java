import java.util.Scanner;

class VectorExC {
	public void ex1() {
		// ArrayList 작동 방식
		// ArrayList하고 Vector는 일부를 제외하고 거의 비슷함

		Scanner sc = new Scanner(System.in);

		// 정수
		// 처음 프로그램을 시작하면 빈 배열 선언
		int[] arr = null;

		// 데이터의 개수를 저장하는 count 변수
		int count = 0;

		// 선택한 메뉴를 저장하는 변수
		int sel;

		// 1. 추가
		// 2. 삭제
		// 3. 정렬(조회)
		// 0. 종료

		while (true) {
			// 메뉴
			System.out.println("1. 추가 2. 삭제\n 3. 정렬(조회), 0. 종료");
			sel = sc.nextInt();

			switch (sel) {
				case 1:
					// count가 0이면 배열을 하나만 생성
					// count가 1이상이면 배열을 새로 생성해서
					// 기존 데이터 저장하고 새 데이터 추가

					if (count == 0) {
						arr = new int[1];
					} else {
						int[] temp = arr;
						arr = new int[count + 1];

						// 기존 배열에서 데이터 복사
						for (int i = 0; i < count; i++) {
							arr[i] = temp[i];
						}

						// 기존 배열이 필요가 없다
						// 새 배열을 복사했기 때문에 주소값을 저장할 필요가 없다.
						// 가비지 컬렉터가 해결
						temp = null;
					}

					// 위에서 공간 생성
					// 실제 그 안에 데이터 추가
					System.out.println("추가할 정수값 입력: ");
					int data = sc.nextInt();
					arr[count] = data;

					count++; // 데이터 개수 증가

					break;

				case 2: // 삭제
					if (count == 0) {
						System.out.println("빈 공간입니다");
					} else { // 삭제할 데이터 찾기
						// 입력
						System.out.println("삭제할 데이터 입력: ");
						int del = sc.nextInt();
						// 삭제할 데이터를 이용해서 인덱스를 찾는다
						int delIndex = -1;

						for (int i = 0; i < count; i++) {
							if (arr[i] == del) {
								delIndex = i;
								break;
							}
						}

						// 데이터가 없다
						if (delIndex == -1) {
							System.out.println("삭제할 값이 없습니다");
						} else {
							// 삭제할 데이터 인덱스 제외하고 복사

							int[] temp = arr;
							arr = new int[count + 1];

							// 복사하는 과정에서 삭제할 인덱스 데이터는 복사 X
							// i는 기존 배열의 방 번호로 사용
							// j는 새 배열의 방 번호로 사용
							for (int i = 0, j = 0; i < count; i++) {
								if (i != delIndex) {
									arr[j++] = temp[i];
								}
							}

							temp = null;
							count--;
						}

					}

					break;

				case 3:
					// 전체 출력
					for (int num : arr) {
						System.out.println(num);
					}

					break;

				case 0:
					return; // 함수 종료

				default: // 예외 처리
					System.out.println("잘못 입력했습니다");
					break;
			}
		}
	}
}

public class VectorEx {

	public static void main(String[] args) {
		VectorExC c = new VectorExC();
		c.ex1();
	}

}
