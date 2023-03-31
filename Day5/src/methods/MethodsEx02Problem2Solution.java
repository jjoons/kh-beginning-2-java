package methods;

import java.util.Arrays;

public class MethodsEx02Problem2Solution {
	public static int maxNumber(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length - 1];
	}

	public static int minNumber(int[] nums) {
//		Arrays.sort(nums);
		return nums[0];
	}

	public static <T> int info(T[] a) {
		int i = 0;
		double i2 = 1.1;
		String i3 = "안녕";

		// return i, i2, i3; // 오류 발생
		// 함수가 종료하기 전에 결과값 하나를 main에게 보낸다
		return i;
	}

	public static void main(String[] args) {
	}
}
