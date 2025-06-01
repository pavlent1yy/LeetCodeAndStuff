package olympic.algosforolimp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {
	public static void main(String[] args) {
		// System.out.println(Arrays.toString(twoPointersIndex(new int[] { 2, 7, 11, 15
		// }, 9)));
		// printMatrix(twoPointersUnique(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
		// 10));

		// int[] nums = new int[] { 1, 3, 4, 6, 8, 11, 15 };
		int[] nums = { -4, -2, 0, 1, 3, 5 };
		System.out.println(Arrays.toString(twoPointersSqrt(nums)));
		// reverseArray(nums);
		// System.out.println(Arrays.toString(nums));

	}

	public static int[] twoPointersSqrt(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int n = nums.length;
		int[] result = new int[n];
		int i = 1;
		while (left <= right) {
			if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
				result[n - i] = right * right;
				right--;
			} else if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
				result[n - i] = left * left;
				left++;
			}
			i++;

		}
		return result;
	}

	public static List<Integer[]> twoPointersUnique(int[] nums, int target) {
		List<Integer[]> list = new ArrayList<>();
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				list.add(new Integer[] { nums[left], nums[right] });
				left++;
				right--;
				if (left > 0 && nums[left] == nums[left - 1])
					left++;
				else if (right < nums.length - 1 && nums[right] == nums[right + 1])
					right--;
			}
		}
		return list;
	}

	public static void printMatrix(List<Integer[]> list) {
		for (Integer[] array : list) {
			System.out.print(Arrays.toString(array) + ", ");
		}
	}

	public static int[] twoPointersIndex(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == target)
				return new int[] { left, right };
			else if (sum > target)
				right--;
			else
				left++;
		}
		return new int[] { -1 };
	}

	public static void reverseArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int swap = nums[left];
			nums[left] = nums[right];
			nums[right] = swap;
			left++;
			right--;
		}
	}

	public static Integer[] twoPointers(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == target)
				return new Integer[] { nums[left], nums[right] };
			else if (sum > target)
				right--;
			else
				left++;
		}
		return new Integer[] { -1 };
	}
}
