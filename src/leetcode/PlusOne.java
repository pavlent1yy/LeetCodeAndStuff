package leetcode;

import java.math.BigInteger;

public class PlusOne {
	public static void main(String[] args) {

	}

	public int[] plusOne(int[] digits) {
		String strDigits = "";
		for (int el : digits)
			strDigits += Integer.toString(el);
		String resultNumber = new BigInteger(strDigits).add(new BigInteger("1")).toString();
		int[] resultArray = new int[resultNumber.length()];
		for (int i = 0; i < resultNumber.length(); i++)
			resultArray[i] = resultNumber.charAt(i) - '0';
		return resultArray;
	}
}
