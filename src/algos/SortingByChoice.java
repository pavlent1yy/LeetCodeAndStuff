package algos;

import java.util.Arrays;

public class SortingByChoice {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(sortingByChoice(new int[] { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36 })));
	}

	public static int[] sortingByChoice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = min(array, i);
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		return array;
	}

	public static int min(int[] array, int start) {
		int minIndex = start;
		int minElement = array[start];
		for (int i = start + 1; i < array.length; i++) {
			if (minElement > array[i]) {
				minElement = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
