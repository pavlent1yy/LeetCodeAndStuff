package algos;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 54, -8, 0, 71, 12, 7, 6, 12, -3, 72 };
		String[] strings = new String[] { "Orange", "Apple", "Turnip", "Onion", "Potato", "Pineapple", "Watermellon",
				"Kiwi", "ZFruit" };
		qsort(array);
		qsort(strings);
		Arrays.stream(array).forEach(System.out::println);
		Arrays.stream(strings).forEach(System.out::println);
	}

	private static void qsort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void qsort(String[] array) {
		quickStringSort(array, 0, array.length - 1);
	}

	private static void quickStringSort(String[] array, final int from, final int to) {
		if (array.length == 0 || from >= to)
			return;
		char pivot = array[(from + to) / 2].charAt(0);
		int leftMarkerIndex = from;
		int rightMarkerIndex = to;
		while (leftMarkerIndex <= rightMarkerIndex) {
			while (Character.getNumericValue(array[leftMarkerIndex].charAt(0)) < Character.getNumericValue(pivot))
				leftMarkerIndex++;
			while (Character.getNumericValue(array[rightMarkerIndex].charAt(0)) > Character.getNumericValue(pivot))
				rightMarkerIndex--;
			if (leftMarkerIndex <= rightMarkerIndex) {
				String swap = array[leftMarkerIndex];
				array[leftMarkerIndex] = array[rightMarkerIndex];
				array[rightMarkerIndex] = swap;
				leftMarkerIndex++;
				rightMarkerIndex--;
			}
		}
		if (from < rightMarkerIndex)
			quickStringSort(array, from, rightMarkerIndex);
		if (to > leftMarkerIndex)
			quickStringSort(array, leftMarkerIndex, to);
	}

	private static void quickSort(int[] array, final int from, final int to) {
		if (array.length == 0 || from >= to)
			return;
		int pivot = array[(from + to) / 2];
		int leftMarkerIndex = from;
		int rightMarkerIndex = to;

		while (leftMarkerIndex <= rightMarkerIndex) {
			while (array[leftMarkerIndex] < pivot)
				leftMarkerIndex++;
			while (array[rightMarkerIndex] > pivot)
				rightMarkerIndex--;
			if (leftMarkerIndex <= rightMarkerIndex) {
				int swap = array[leftMarkerIndex];
				array[leftMarkerIndex] = array[rightMarkerIndex];
				array[rightMarkerIndex] = swap;
				leftMarkerIndex++;
				rightMarkerIndex--;
			}
		}
		if (from < rightMarkerIndex)
			quickSort(array, from, rightMarkerIndex);
		if (to > leftMarkerIndex)
			quickSort(array, leftMarkerIndex, to);
	}
}
