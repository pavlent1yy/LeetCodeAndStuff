package leetcode;

import java.util.Arrays;

public class RowWithMaximumOnes {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][] { { 0, 0 }, { 0, 1 } })));
	}

	public static int[] rowAndMaximumOnes(int[][] mat) {
		int sum = 0;
		int row = 0;

		for (int i = 0; i < mat.length; i++) {
			int count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					count++;
			}
			if (count > sum) {
				sum = count;
				row = i;
			}

		}
		return new int[] { row, sum };
	}
}
