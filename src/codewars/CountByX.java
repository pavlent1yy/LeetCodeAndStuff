package codewars;

import java.util.Arrays;

public class CountByX {
	public static void main(String[] args) {
		int[] ad = countBy(1, 5);
		Arrays.stream(ad).forEach(e -> System.out.println(e));

	}

	public static int[] countBy(int x, int n) {
		int[] array = new int[n];
		for (int i = 1; i < n; i++) {
			array[i] = i * x;
		}
		return array;
	}
}
