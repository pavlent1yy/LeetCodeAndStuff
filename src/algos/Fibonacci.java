package algos;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fiba(9)); //
	}

	public static long fiba(int x) {
		long[] list = new long[x + 1];
		list[0] = 0;
		list[1] = 1;
		for (int i = 2; i <= x; i++) {
			list[i] = list[i - 1] + list[i - 2];
			System.out.println(list[i]);
		}
		return list[list.length - 1];
	}
}
