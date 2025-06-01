package olympic.algosforolimp;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		// System.out.println(sqrBinarySearch(17));
		// System.out.println(lowerBound(new int[] { 1, 3, 5, 6 }, 5));
		// System.out.println(lowerBound(new int[] { 1, 3, 5, 6 }, 2));
		// System.out.println(lowerBound(new int[] { 1, 3, 5, 6 }, 7));
		System.out.println(Arrays.toString(bstask5(new int[] { 5, 7, 7, 8, 8, 10 }, 8))); // {3, 4}
		// System.out.println(Arrays.toString(bstask5(new int[] { 5, 7, 7, 8, 8, 10 },
		// 6))); // {-1, -1}

	}

	public static int[] bstask5(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		int lowestK = -1;
		int highestK = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == k) {
				// highestK = mid;
				// low = mid + 1;
				high = mid - 1;
				lowestK = mid;
			} else if (array[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return new int[] { lowestK, highestK };
	}

	public static int lowerBound(int[] array, int k) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < k)
				low = mid + 1;
			else
				high = mid;
		}
		return low;
	}

	public static int binarySearch3(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}

		}
		return array[low];
	}

	public static int sqrBinarySearch(int n) {
		if (n == 0 || n == 1)
			return n;
		int low = 1;
		int high = n;
		int result = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid * mid == n)
				return mid;
			else if (mid * mid < n) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;
	}
}
