package array;

class C2 {
	public void problem1() {
		int[] studentIDs = { 1001, 1002, 1003, 1004, 1005 };
		int[] studentScores = { 87, 11, 45, 98, 23 };

		// 문제1) 1등 학생의 학번과 성적 출력
		// 정답) 1004번 (98점)

		int maxScore = 0;
		int maxScoreStudentID = 0;

		for (int i = 0; i < studentScores.length; i++) {
			int score = studentScores[i];

			if (score > maxScore) {
				maxScore = score;
				maxScoreStudentID = studentIDs[i];
			}
		}

		System.out.println(maxScoreStudentID + "번 " + "(" + maxScore + "점)");
	}

	public void problem1Solution() {
		int[] hakbun = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제1) 1등 학생의 학번과 성적 출력
		// 정답) 1004번 (98점)

		int findIdx = -1; // 찾는 값이 없을 때 사용
		int max = scores[0];
		int index = 1; // 각각 공간에 접근할 때 사용하는 번호

		// 이미 max 값에 cores 첫번째 값 87을 저장
		// index 굳이 0부터 시작해라 쓸 필요 없다

		while (index < scores.length) {
			if (max < scores[index]) {
				max = scores[index];
				// 학번도 같이 출력  findIdx -> 학번의 방 번호를 저장
				findIdx = index;
			}

			// 다음 공간으로 넘어가기
			index++;
		} // while문 끝
	}

}

public class ArrayEx03 {
	public static void main(String[] args) {
		C2 c = new C2();
		c.problem1();
	}
}
