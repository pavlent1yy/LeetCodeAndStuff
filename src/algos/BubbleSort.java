package algos;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println();
		int[] arr = bubbleSort(new int[] { 1, 5, 4, 6, 1, 23, 4, 5, 6, 725, 2, 52, 14 });
		Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
	}

	// O(n^2)
	public static int[] bubbleSort(int[] array) {
		int temp = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}