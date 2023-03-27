package control;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// 성적 60점 이상 "합격"
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력: ");
		int score = sc.nextInt();

		// 비교를 했을 때 결과 참과 거짓이 나오는 연산자

		if (score >= 60) {
			// 조건이 참이면 실행
			System.out.println("합격");
		}

		if (score < 60) {
			System.out.println("불합격");
		}

		/*
		 * # 로그인 [1단계]
		 * 1. ID와 PW를 입력받음 (정수 4자리)
		 * 2. 입력받은 데이터와 DB 데이터를 비교해 로그인 처리를 진행함
		 * 예) 로그인 성공 or 로그인 실패
		 */

		// 기존 ID, PW
		//		System.out.println("아이디 입력: ");
		int id = 1111;
		//		System.out.println("비밀번호 입력: ");
		int pw = 2222;

		// 현재 로그인하는 아이디, 비밀번호 저장
		int nowID = 1111;
		int nowPw = 2222;

		// 1. 먼저 아이디부터 비교
		//    아이디가 맞으면 "아이디는 맞습니다"
		//    다르면 "아이디가 다릅니다"
		// 2. 비밀번호 비교 시 일치하면 "로그인 성공"
		//       아니라면 "아이디 또는 비밀번호를 확인"

		if (id == nowID) {
			System.out.println("아이디는 맞습니다");

			if (pw == nowPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("아이디 또는 비밀번호를 확인");
			}
		} else {
			System.out.println("아이디가 다릅니다");
		}

		//		if (id != nowID) {
		//			System.out.println("아이디가 다릅니다");
		//		}

	}

}
