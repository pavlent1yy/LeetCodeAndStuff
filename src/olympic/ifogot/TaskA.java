package olympic.ifogot;

public class TaskA {
	public static void main(String[] args) {
		System.out.println(coinsProblem(21, 2, 5)); // 15
		System.out.println(coinsProblem(24, 10, 2)); // 4
		System.out.println(coinsProblem(30, 1, 5)); // 25
		System.out.println(coinsProblem(42, 2, 5)); // 30
		System.out.println(coinsProblem(1, 1, 1)); // Impossible
		System.out.println(coinsProblem(2, 5, 10)); // Impossible
	}

	public static String coinsProblem(int n, int xPetyaCoinValue, int yVasyaCoinValue) { // 21, 2, 5 -> 21 = x > | |
		if (n <= xPetyaCoinValue + yVasyaCoinValue)
			return "Impossible";
		int xPetyaSum = 0;
		int yVasyaSum = 0;
		for (int i = 1; i < n; i++) {
			xPetyaSum = i * xPetyaCoinValue;
			yVasyaSum = i * yVasyaCoinValue;
			if (n == xPetyaSum + yVasyaSum)
				return String.valueOf(yVasyaSum);
		}
		return "Impossible";
	}
}
/*
 * ==========================================
 * ----------------- Ex. 1 -----------------
 * 21 =
 * 
 * 2 2 2 |> 2 + 2 + 2 = 6
 * 5 5 5 |> 5 + 5 + 5 = 15
 * 
 * 6 + 15 = 21
 * 
 * ----------------- Ex. 2 -----------------
 * 24 =
 * 
 * 10 10 |> 10 + 10 = 20
 * 2 2 |> 2 + 2 = 4
 * 
 * 20 + 4 = 24
 * 
 * ----------------- Ex. 3 -----------------
 * 30 =
 * 
 * 1 1 1 1 1 |> 1 + 1 + 1 + 1 + 1 = 5
 * 5 5 5 5 5 |> 5 + 5 + 5 + 5 + 5 = 25
 * 
 * 25 + 5 = 30
 * 
 * ==========================================
 */