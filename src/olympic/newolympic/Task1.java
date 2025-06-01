package olympic.newolympic;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(stairsProblemMemo(n));

	}

	public static int stairsProblemMemo(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return stairsProblemMemo(n, memo);
	}

	public static int stairsProblemMemo(int n, int[] memo) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (memo[n] != -1) {
			return memo[n];
		}
		memo[n] = stairsProblemMemo(n - 1, memo) + stairsProblemMemo(n - 2, memo);
		return memo[n];
	}

}
