package algos;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(recFactorial(5));
	}

	public static long factorial(int fact) {
		long res = 1;
		for (int i = 1; i <= fact; i++) {
			res *= i;
		}
		return res;
	}

	public static long recFactorial(int fact) {
		if (fact <= 1) {
			return 1;
		} else {
			return fact * factorial(fact - 1);
		}
	}
}
