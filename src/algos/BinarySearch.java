package algos;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { 1, 3, 6, 8, 9, 12, 14, 16, 19, 23, 26, 29 }, 29)); // 6
	}

	protected static int binarySearch(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == k)
				return mid;
			else if (array[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}