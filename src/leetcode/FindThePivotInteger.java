package leetcode;

public class FindThePivotInteger {
	public static void main(String[] args) {
		System.out.println(pivotInteger(8)); // 6
		System.out.println(pivotInteger(1)); // 1
		// System.out.println(pivotInteger(4)); // -1
	}

	public static int pivotInteger(int n) {
		// for (int i = 1; i <= n; i++) {
		// if (findPivot(1, i) == findPivot(i, n))
		// return i;
		// }
		// return -1;
		// }

		// public static int findPivot(int j, int x) {
		// int n = 0;
		// for (int i = j; i <= x; i++)
		// n += i;
		// return n;

		int ans = ((n * n) + n) / 2;
		int sq = (int) Math.sqrt(ans);
		if (ans == sq * sq)
			return sq;

		return -1;
	}
}
