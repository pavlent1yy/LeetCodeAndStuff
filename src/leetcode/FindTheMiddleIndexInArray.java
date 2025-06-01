package leetcode;

public class FindTheMiddleIndexInArray {
	public static void main(String[] args) {
		System.out.println(findMiddleIndex(new int[] { 2, 3, -1, 8, 4 }));
	}

	public static int findMiddleIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i: " + i);
			System.out.println("B " + sumBeforeIndex(nums, i));
			System.out.println("A " + sumAfterIndex(nums, i));
			if (sumBeforeIndex(nums, i) == sumAfterIndex(nums, i))
				return i;
		}
		return -1;
	}

	public static int sumBeforeIndex(int[] nums, int element) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i < element)
				return sum;
			sum += nums[i];
		}
		return sum;
	}

	public static int sumAfterIndex(int[] nums, int element) {
		int sum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i <= element)
				return sum;
			sum += nums[i];
		}
		return sum;
	}
}
