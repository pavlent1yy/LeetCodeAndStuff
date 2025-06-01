package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestKnightPath {
	public static void main(String[] args) {
		System.out.println(knight("a1", "c4")); // 2
		// System.out.println(knight("a1", "f1")); // 3
		// System.out.println(knight("a1", "f3")); // 3
		// System.out.println(knight("a1", "f4")); // 4
		// System.out.println(knight("a1", "f7")); // 5

	}

	public static int shitght(String start, String finish) {
		List<String[]> board = new ArrayList<>();
		board.add(new String[] { "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8" });
		board.add(new String[] { "g1", "g2", "g3", "g4", "g5", "g6", "g7", "g8" });
		board.add(new String[] { "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8" });
		board.add(new String[] { "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8" });
		board.add(new String[] { "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8" });
		board.add(new String[] { "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8" });
		board.add(new String[] { "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8" });
		board.add(new String[] { "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8" });

		return recursiveCount(start, finish, board, 0);
	}

	public static int recursiveCount(String start, String finish, List<String[]> board, int count) {
		String currentPosition = "";
		int countOfSteps = 0;
		for (int i = 0; i < board.size(); i++) {
			if (Arrays.asList(board.get(i)).contains(start)) {
				for (int j = 0; j < board.get(i).length; j++) {
					currentPosition = board.get(i - 1)[Arrays.asList(board.get(i)).indexOf(start) + 2];
					// currentPosition = board.get(i - 2)[Arrays.asList(board.get(i)).indexOf(start)
					// + 1];
				}
				countOfSteps++;
			}
		}
		if (currentPosition == finish) {
			return countOfSteps;
		} else {
			return countOfSteps += recursiveCount(currentPosition, finish, board, countOfSteps);
		}
	}

	public static int knight(String start, String finish) {
		int[] startX = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int[] startY = { 2, 1, -1, -2, -2, -1, 1, 2 };

		int startRow = start.charAt(0) - 'a';
		int startCol = start.charAt(1) - '1';
		int finishRow = finish.charAt(0) - 'a';
		int finishCol = finish.charAt(1) - '1';

		boolean[][] visited = new boolean[8][8];

		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { startRow, startCol, 0 });

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int row = current[0];
			int col = current[1];
			int dist = current[2];

			if (row == finishRow && col == finishCol) {
				return dist;
			}

			for (int i = 0; i < 8; i++) {
				int nextRow = row + startX[i];
				int nextCol = col + startY[i];

				if (nextRow >= 0 && nextRow < 8 && nextCol >= 0 && nextCol < 8 && !visited[nextRow][nextCol]) {
					visited[nextRow][nextCol] = true;
					queue.add(new int[] { nextRow, nextCol, dist + 1 });
				}
			}
		}

		return -1;
	}

}
