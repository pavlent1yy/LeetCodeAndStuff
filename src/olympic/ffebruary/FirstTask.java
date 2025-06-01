package olympic.ffebruary;

import java.util.*;

public class FirstTask {
	public static void main(String[] args) {
		// task1

		List<List<Character>> matrix = new ArrayList<>();
		matrix.add(Arrays.asList('#', '#', 'S', '#', '#', '#'));
		matrix.add(Arrays.asList('#', '#', '.', '.', '.', '#'));
		matrix.add(Arrays.asList('#', '#', '#', '#', '.', '#'));
		matrix.add(Arrays.asList('#', '#', '.', '.', '.', '#'));
		matrix.add(Arrays.asList('#', '#', '.', '#', '#', '#'));
		matrix.add(Arrays.asList('#', '#', 'E', '#', '#', '#'));

		System.out.println(canReachExit(matrix));

		// task2
		System.out.println(task2("1111", "111")); // 101110

		// task3
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 0, 5, 7, 0, 0,
				0, 7, 22, 6, 8));
		// 0, 0, 0, 0, 5, 7, 5, 7, 7, 22, 6, 8
		System.out.println(task3(list));

		// task4
		System.out.println(task4("Hi my name is Slim Shady"));
	}

	private static boolean canReachExit(List<List<Character>> matrix) {
		int RAWS = matrix.size();
		int COLUMNS = matrix.get(0).size();

		int startX = -1;
		int startY = -1;

		for (int i = 0; i < RAWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (matrix.get(i).get(j) == 'S') {
					startX = i;
					startY = j;
					break;
				}
			}
		}
		if (startX == -1 || startY == -1)
			return false;

		return dfs(matrix, startX, startY, new boolean[RAWS][COLUMNS]);
	}

	public static boolean dfs(List<List<Character>> matrix, int x, int y, boolean[][] visited) {
		int RAWS = matrix.size();
		int COLUMNS = matrix.get(0).size();

		if (x < 0 || x >= RAWS || y < 0 || y >= COLUMNS || matrix.get(x).get(y) == '#' || visited[x][y])
			return false;

		if (matrix.get(x).get(y) == 'E')
			return true;

		visited[x][y] = true;

		boolean found = dfs(matrix, x + 1, y, visited) || // down
				dfs(matrix, x - 1, y, visited) || // up
				dfs(matrix, x, y + 1, visited) || // right
				dfs(matrix, x, y - 1, visited); // left
		return found;
	}

	public static String task2(String strNumber1, String strNumber2) {
		int biNumber1 = Integer.parseInt(strNumber1, 2);
		int biNumber2 = Integer.parseInt(strNumber2, 2);
		return Integer.toBinaryString(biNumber1 + biNumber2);
	}

	public static List<Integer> task3(List<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == 0) {
				array.remove(i);
				array.add(0, 0);
			}
		}
		return array;
	}

	public static String task4(String string) {
		String[] stringByWords = string.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : stringByWords) {
			result.append(" " + new StringBuilder(word).reverse());
		}
		return result.toString();
	}
}
