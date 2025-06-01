package olympic.newolympic;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] matrix = new int[10][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = rand.nextInt(1, 10);

			}
		}
		printMatrix(matrix);
		System.out.println();
		printMatrix(reverseMatrix(matrix));
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] reverseMatrix(int[][] oldMatrix) {
		int[][] reversedMatrix = new int[oldMatrix[0].length][oldMatrix.length];
		for (int i = 0; i < reversedMatrix.length; i++) {
			for (int j = 0; j < reversedMatrix[0].length; j++) {
				reversedMatrix[i][j] = oldMatrix[j][i];
			}
		}
		return reversedMatrix;
	}

}
