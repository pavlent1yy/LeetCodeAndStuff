package codewars;

public class MeanSquareError {

	/*
	 * + принимает два целых массива одинаковой длины
	 * + сравнивает значение каждого элемента в одном массиве с соответствующим
	 * элементом в другом
	 * вычисляет абсолютную разницу между этими двумя значениями
	 * и возвращает среднее значение квадрата абсолютной разницы значений между
	 * каждой из пар членов.
	 */
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));// 9
		System.out.println(solution(new int[] { 10, 20, 10, 2 }, new int[] { 10, 25, 5, -2 })); // 16.5
		System.out.println(solution(new int[] { -1, 0 }, new int[] { 0, -1 })); // 1

	}

	public static double solution(int[] arr1, int[] arr2) {
		int averageValue = 0;
		for (int i = 0; i < arr1.length; i++) {
			averageValue += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
		}
		return (double) averageValue / arr1.length;
	}
}
