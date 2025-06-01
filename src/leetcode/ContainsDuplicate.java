package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 })); // true
		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4 })); // fasle
		System.out.println(containsDuplicate(new int[] { 3, 1 })); // fasle
	}

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				return true;
			map.put(nums[i], i);
		}
		return false;
	}
}
