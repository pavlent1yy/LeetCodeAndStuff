package olympic.ifogot;

public class TaskB {
	public static void main(String[] args) {
		System.out.println(trancelatorProblem(100, 61, 50)); // 90
		System.out.println(trancelatorProblem(100, 50, 50));
		System.out.println(trancelatorProblem(4, 2, 2)); // -1
	}

	public static int trancelatorProblem(int n, int women, int dGermanSpeakers) {
		int men = n - women;
		int englishSpeakers = n - dGermanSpeakers;
		int countPairs = 0;

		for (int i = 0; i < n; i++) {
			if (women - 2 > 0 && dGermanSpeakers - 1 > 0 && englishSpeakers - 1 > 0) {
				countPairs++;
				women -= 2;
				dGermanSpeakers--;
				englishSpeakers--;
			}
			if (men - 2 > 0 && dGermanSpeakers - 1 > 0 && englishSpeakers - 1 > 0) {
				countPairs++;
				men -= 2;
				dGermanSpeakers--;
				englishSpeakers--;
			}
		}

		return countPairs;
	}
}

/*
 * ==============================================
 * ------------------- Ex 1 ---------------------
 * 100 <= 61 - Women;
 * -- - - 39 - Men;
 * 
 * 100 <= 50 - German;
 * -- - - 50 - English;
 * 
 * 
 * 
 * V => Man - E & Man - G
 * V => Woman - E & Woman - G
 * 
 * 
 * 
 * W, W, W, W, W, W, W, W, W, W,
 * W, W, W, W, W, W, W, W, W, W,
 * W, W, W, W, W, W, W, W, W, W,
 * W, W, W, W, W, W, W, W, W, W,
 * W, W, W, W, W, W, W, W, W, W,
 * W, W, W, W, W, W, W, W, W, W,
 * W;
 * 
 * 
 * M, M, M, M, M, M, M, M, M, M,
 * M, M, M, M, M, M, M, M, M, M,
 * M, M, M, M, M, M, M, M, M, M,
 * M, M, M, M, M, M, M, M, M,
 * 
 * 
 * E, E, E, E, E, E, E, E, E, E,
 * E, E, E, E, E, E, E, E, E, E,
 * E, E, E, E, E, E, E, E, E, E,
 * E, E, E, E, E, E, E, E, E, E,
 * E, E, E, E, E, E, E, E, E, E,
 * 
 * 
 * G, G, G, G, G, G, G, G, G, G,
 * G, G, G, G, G, G, G, G, G, G,
 * G, G, G, G, G, G, G, G, G, G,
 * G, G, G, G, G, G, G, G, G, G,
 * G, G, G, G, G, G, G, G, G, G,
 * 
 * 
 * ------------------- Ex 3 ---------------------
 * 
 * 100 <= 50 - Women; |> 25pW
 * -- - - 50 - Men; - |> 25pM
 * 
 * 100 <= 50 - German;- |> 25pG
 * -- - - 50 - English; |> 25pE
 * 
 * 50 p
 * 
 * 
 * 
 * 
 * 
 * ==============================================
 */
