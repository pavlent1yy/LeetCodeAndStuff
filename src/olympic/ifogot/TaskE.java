package olympic.ifogot;

import java.util.Arrays;
import java.util.List;

public class TaskE {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, 7, 8, 12, 15, 17, 18, 20, 24, 26, 29, 30);
		System.out.println(arraySearch(a, 27));
		System.out.println(arraySearch(a, 38));
		System.out.println(arraySearch(a, 59));
		System.out.println(arraySearch(a, 60));
	}

	public static List<Integer> arraySearch(List<Integer> a, int s) {
		int left = 0;
		int currentSum = 0;
		for (int right = 0; right < a.size(); right++) {
			currentSum += a.get(right);
			while (currentSum > s && left <= right) {
				currentSum -= a.get(left);
				left++;
			}
			if (currentSum == s)
				return a.subList(left, right + 1);
		}
		return null;
	}

}
