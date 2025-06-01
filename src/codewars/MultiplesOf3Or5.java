package codewars;

public class MultiplesOf3Or5 {
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	public static int solution(int number) {
		int res = 0;
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				res += i;
			}
		}
		return res;
	}
}
