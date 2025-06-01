package olympic.algosforolimp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithms {
	public static void main(String[] args) {
		// int[] coins = { 1, 5, 10, 25 }; // Номиналы монет
		// int amount = 63; // Сумма, которую нужно разменять
		// System.out.println(getMinCoins(coins, amount));
		System.out.println(MYgasstationProblem(25, 10, new int[] { 5, 10, 15, 20 })); // 2
		System.out.println(MYgasstationProblem(25, 15, new int[] { 10, 14, 20 })); // 1
		System.out.println(MYgasstationProblem(30, 10, new int[] { 5, 8, 12, 18 })); // -1
	}

	public static int MYgasstationProblem(int D, int m, int[] stations) {
		int minRefillsNumber = 0;
		int i = stations.length - 1;
		while (D > 0 && i >= 0) {
			while (D - stations[i] >= 0) {
				if (D - stations[i] > m)
					return -1;
				D -= stations[i];
				minRefillsNumber++;
			}
			i--;
		}
		return minRefillsNumber;
	}

	public static int AIgasStationProblem(int D, int m, int[] stations) {
		int refills = 0;
		int currentFuel = m;
		int lastStation = 0; // Последняя заправка, где мы заправлялись
		for (int i = 0; i < stations.length; i++) {
			int distance = stations[i] - lastStation;
			if (distance > m)
				return -1; // Машина не может доехать до станции
			if (currentFuel < distance) {
				refills++;
				currentFuel = m;
			}
			currentFuel -= distance;
			lastStation = stations[i];
		}
		// Последний рывок к финишу
		if (D - lastStation > m)
			return -1;
		if (currentFuel < D - lastStation)
			refills++;
		return refills;
	}

	public static List<Integer> getMinCoins(int[] coins, int amount) {
		Arrays.sort(coins);
		List<Integer> res = new ArrayList<>();
		int i = coins.length - 1;

		while (amount > 0 && i >= 0) {
			while (amount >= coins[i]) {
				amount -= coins[i];
				res.add(coins[i]);
			}
			i--;
		}

		return res;
	}

}
