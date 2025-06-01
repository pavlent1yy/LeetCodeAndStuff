package olympic.old;

public class Task2 {
	public static void main(String[] args) {
		System.out.println(lazyAndrew(13)); // 5 -> 2 ^ (5 - 1) = 16 ?
		System.out.println(lazyAndrew(64)); // 7 -> 2 ^ (7 - 1) = 64
		System.out.println(lazyAndrew(120)); // 7 -> 2 ^ (7 - 1) = 64
		System.out.println(games(13)); // 16
		System.out.println(games(64)); // 64
		System.out.println(games(120)); // 64
	}

	public static int lazyAndrew(int playingTime) {
		int res = 0;
		int preres = 0;
		for (int i = 1; i < playingTime; i++) {
			preres = res;
			res = (int) Math.pow(2, (i - 1));
			if (preres <= playingTime && playingTime <= res)
				return i;

		}
		return -1;
	}

	public static int games(int m) {
		for (int k = 0; k < m; k++) {
			if (Math.pow(2, k - 1) >= m)
				return k;
		}
		return 0;
	}
}
