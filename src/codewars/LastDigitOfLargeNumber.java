package codewars;

import java.math.BigInteger;

public class LastDigitOfLargeNumber {
	public static void main(String[] args) {
		// System.out.println(lastDigit(new BigInteger("4"), new BigInteger("1"))); //
		// returns 4
		// System.out.println(lastDigit(new BigInteger("4"), new BigInteger("2"))); //
		// returns 6
		// System.out.println(lastDigit(new BigInteger("9"), new BigInteger("7"))); //
		// returns 9
		System.out.println(lastDigit(new BigInteger("1209595119383681110488638083824"), new BigInteger("0"))); // returns
		// 0
	}

	public static int lastDigit(BigInteger n1, BigInteger n2) {
		if (n2.equals(new BigInteger("0")))
			return 1;
		BigInteger base = n1.mod(BigInteger.TEN);
		BigInteger exponent = n2.mod(new BigInteger("4")).add(new BigInteger("4"));
		return base.modPow(exponent, BigInteger.TEN).intValue();

	}

}
