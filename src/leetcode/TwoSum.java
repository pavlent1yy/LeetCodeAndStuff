package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		// int[] d = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		// System.out.println(Arrays.toString(d));
		// int[] d2 = twoSum(new int[] { 3, 2, 4 }, 6); // [1,2]
		// System.out.println(Arrays.toString(d2));
		// int[] d3 = twoSum(new int[] { 3, 3 }, 6);
		// System.out.println(Arrays.toString(d3));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 5, 11 }, 10)));
		System.out.println(Arrays.toString(twoSumTwoPointers(new int[] { 2, 3, 5, 5, 7, 8, 10, 11, 12 }, 10)));
	}

	// public static int[] twoSum(int[] nums, int target) {
	// for (int i = 0; i < nums.length; i++) {
	// for (int j = i + 1; j < nums.length; j++) {
	// if (nums[i] + nums[j] == target)
	// return new int[] { i, j };
	// }
	// }
	// return nums;
	// }

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			hm.put(nums[i], i);
		for (int i = 0; i < nums.length; i++) {
			int dif = target - nums[i];
			if (hm.containsKey(dif) && hm.get(dif) != i)
				return new int[] { hm.get(dif), i };
		}
		return nums;
	}

	public static int[] twoSumTwoPointers(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			if (nums[left] + nums[right] == target) {
				return new int[] { right, left };
			} else if (nums[left] + nums[right] > target) {
				right--;
			} else if (nums[left] + nums[right] < target) {
				left++;
			}
		}
		return nums;
	}
}
