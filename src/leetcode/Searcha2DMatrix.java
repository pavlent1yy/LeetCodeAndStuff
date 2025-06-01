package leetcode;

public class Searcha2DMatrix {
	public static void main(String[] args) {
		System.out.println(searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3));
		System.out.println(searchMatrix(new int[][] { { 1 } }, 1));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		for (int i = matrix.length - 1; i >= 0; i--) {
			if (matrix[i][0] <= target) {
				return binarySearch(matrix[i], target);
			}
		}
		return false;
	}

	public static boolean binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target)
				return true;
			else if (array[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}
}
