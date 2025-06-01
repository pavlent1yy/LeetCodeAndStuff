package codewars;

public class NarcissisticNumber {
	public static void main(String[] args) {
		System.out.println(isNarcissistic(153)); // true
		System.out.println(isNarcissistic(145));

	}
	// 153 ==> 1^3 + 5^3 + 3^3 == 153
	// 153 ==> 1 + 125 + 9 == 153

	// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474,
	// 54748, 92727, 93084, 548834 - Narcissistic Number
	public static boolean isNarcissistic(int number) {
		char[] numberList = Integer.toString(number).toCharArray();
		double narNumber = 0;
		for (int i = 0; i < numberList.length; i++)
			narNumber += Math.pow(Character.getNumericValue(numberList[i]), numberList.length);
		return number == narNumber;
	}
}
