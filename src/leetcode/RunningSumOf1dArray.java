package leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(runningSum(new int[] { 1, 2, 3, 4 })));
	}

	public static int[] runningSum(int[] nums) {
		int[] runningSum = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			runningSum[i] = sum(Arrays.copyOfRange(nums, 0, i + 1));
		return runningSum;
	}

	private static int sum(int[] array) {
		int sum = 0;
		for (int el : array)
			sum += el;
		return sum;
	}
}
