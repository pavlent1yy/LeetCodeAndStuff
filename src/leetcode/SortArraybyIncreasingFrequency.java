package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortArraybyIncreasingFrequency {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(frequencySort(new int[] { 1, 1, 2, 2, 2, 3 })));
	}

	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new TreeMap<>();
		for (int el : nums) {
			if (map.containsKey(el)) {
				map.put(el, map.get(el) + 1);
			} else {
				map.put(el, 1);
			}
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (a, b) -> {
			if (map.get(a) == map.get(b))
				return b - a;
			else
				return map.get(a) - map.get(b);
		});
		int[] res = new int[nums.length];
		int index = 0;
		for (int num : list) {
			for (int i = 0; i < map.get(num); i++) {
				res[index++] = num;
			}
		}
		return res;
	}

}
