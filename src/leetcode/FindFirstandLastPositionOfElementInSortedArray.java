package leetcode;

import java.util.Arrays;

public class FindFirstandLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8))); // [3,4]
		// System.out.println(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6)); //
		// [-1,-1]
		// System.out.println(searchRange(new int[] {}, 0)); // [-1,-1]
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] res = new int[2];
		res[0] = Arrays.binarySearch(nums, target);
		res[1] = Arrays.binarySearch(nums, target);
		return res;
	}
}
