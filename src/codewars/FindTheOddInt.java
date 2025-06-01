package codewars;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindTheOddInt {
	public static void main(String[] args) {
		System.out.println(findIt(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 })); // -1
		System.out.println(findIt(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 })); // 5
		System.out.println(findIt(new int[] { 10 })); // 10
		System.out.println(findIt(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 })); // 10
		System.out.println(findIt(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 })); // 1
	}

	public static int findIt(int[] a) {
		int odd = 0;
		Map<Integer, Integer> map = countFreq(a);
		Collection<Integer> valuesCol = map.values();
		for (int i : valuesCol) {
			if (!(i % 2 == 0)) {
				odd = i;
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == odd) {
				return entry.getKey();
			}
		}
		return 0;
	}

	public static Map<Integer, Integer> countFreq(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		return map;
	}
}
