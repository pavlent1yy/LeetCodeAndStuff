package algos;

public class MarixSquareTable {
	public static void main(String[] args) {
		int[][] m = new int[9][10];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = (int) Math.pow(Integer.parseInt(Integer.toString(i + 1) + Integer.toString(j)), 2);

		}
		printMatrix(m);
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println("----".repeat(matrix[0].length + matrix.length));
			for (int element : row) {
				System.out.print("|" + element + "| ");
			}
			System.out.println();
		}
	}
}
