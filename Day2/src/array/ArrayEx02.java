package array;
import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] studentIDs = { 1001, 1002, 1003, 1004, 1005 };
		int[] studentScores = { 87, 11, 45, 98, 23 };

		// HashSet -> put()
		// 검색  이진탐색 (정렬 필요)
		//       순차탐색
		Scanner sc = new Scanner(System.in);

		System.out.println("학번 입력: ");
		int studentID = sc.nextInt();

		int index = 0;
		int findIdx = 0; // 배열에 접근할 때 공간에 번호로 사용

		for (int i = 0; i < studentIDs.length; i++) {
			if (studentID == studentIDs[i]) {
				// 점수
				System.out.println(studentScores[i]);
			}
		}

		/*
		while (index < studentScores.length) {
			if (studentID == studentIDs[index]) {
				findIdx = index;
			}
		
			// 위에 반복하는 내용을 실행했으면 다음 공간으로
			index++;
		}
		
		// findIdx 번호가 -1 찾는 학번이 없다.
		// findIdx 번호 0~5번 사이로 값이 저장
		if (findIdx != -1) {
			System.out.println(studentScores[findIdx]);
		} else {
			System.out.println("찾는 학번이 없습니다.");
		}
		*/
	}
}
