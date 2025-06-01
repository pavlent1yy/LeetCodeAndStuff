package olympic.algosforolimp;

import java.util.Arrays;

public class NewQuickSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 54, -8, 0, 71, 12, 7, 6, 12, -3, 72 };
		qsort(array);
		Arrays.stream(array).forEach(System.out::println);
		// int[] array = { 3, 4, 7, 10, 15 };
		// int[] array1 = { 3, 4, 7, 10, 15, 20 };
		// System.out.println(median(array));
		// System.out.println(median(array1));

	}

	public static void qsort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int from, int to) {
		if (array.length == 0 || from >= to)
			return;
		int pivot = array[(from + to) / 2];
		int fromMarker = from;
		int toMarker = to;
		while (fromMarker <= toMarker) {
			while (array[fromMarker] < pivot)
				fromMarker++;
			while (array[toMarker] > pivot)
				toMarker--;
			if (fromMarker <= toMarker) {
				int swap = array[fromMarker];
				array[fromMarker] = array[toMarker];
				array[toMarker] = swap;
				fromMarker++;
				toMarker--;
			}
		}

		if (from < toMarker)
			quickSort(array, from, toMarker);
		if (to > fromMarker)
			quickSort(array, fromMarker, to);
	}

	public static double median(int[] array) {
		qsort(array);
		if (array.length % 2 != 0)
			return array[array.length / 2];
		if (array.length % 2 == 0)
			return (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
		return -1;
	}

}
