package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println(fizzBuzz(3)); // ["1","2","Fizz"]
		System.out.println(fizzBuzz(5)); // ["1","2","Fizz","4","Buzz"]
		System.out.println(fizzBuzz(15)); // ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
	}

	public static List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {
			answer.add(isfizzBuzz(i));
		}
		return answer;
	}

	public static String isfizzBuzz(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return "FizzBuzz";
		else if (n % 3 == 0)
			return "Fizz";
		else if (n % 5 == 0)
			return "Buzz";
		else
			return String.valueOf(n);
	}
}
