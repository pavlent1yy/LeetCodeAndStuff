package olympic.old;

public class Task3 {
	public static void main(String[] args) {
		System.out.println(connectingChains(3, new int[] { 5, 4, 6 })); // 2
		System.out.println(connectingChains(6, new int[] { 4, 4, 4, 4, 4, 4, })); // 4 ??
	}

	public static int connectingChains(int N, int[] m) {
		if (N != m.length)
			return -1;
		return N - 1;
	}

}
