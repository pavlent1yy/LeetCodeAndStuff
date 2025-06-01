package leetcode;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(153423));
		System.out.println(reverse(123));
		System.out.println(reverse(-13251));
		System.out.println(reverse(-2147483648));

	}

	public static int reverse(int x) {
		String reversedStringX = new StringBuilder(Long.toString(Math.abs((long) x))).reverse().toString();
		System.out.println(reversedStringX);
		long reversedxToLong = Long.parseLong(reversedStringX);
		if (reversedxToLong > Integer.MAX_VALUE || reversedxToLong < Integer.MIN_VALUE)
			return 0;
		return x < 0 ? -(int) reversedxToLong : (int) reversedxToLong;
	}
}
