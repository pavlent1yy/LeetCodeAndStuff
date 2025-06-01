package leetcode;

import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
	public static void main(String[] args) {
		System.out.println(countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));
	}

	public static int countPairs(List<Integer> nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (i < j && nums.get(i) + nums.get(j) < target) {
					count++;
					System.out.println(count + "(" + i + ", " + j + ")");
				}
			}
		}
		return count;
	}

}
