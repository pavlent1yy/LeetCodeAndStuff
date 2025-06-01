package codewars;

public class CountIPAddresses {
	public static void main(String[] args) {
		// "10.0.0.0"

		System.out.println(ipsBetweenClever("10.0.0.0", "10.0.0.50")); // 50
		System.out.println(ipsBetweenClever("10.0.0.0", "10.0.1.00")); // 256
		System.out.println(ipsBetweenClever("10.0.0.255", "10.0.1.00")); // 1
		System.out.println(ipsBetweenClever("10.0.0.0", "20.0.1.00")); // 246
	}

	public static long ipsBetween(String start, String end) { // Shit
		String[] startAr = start.split("[.]");
		String[] endAr = end.split("[.]");
		long startIptoDecimalNumber = 0;
		long endIptoDecimalNumber = 0;
		for (int i = 0; i < startAr.length; i++) {
			startIptoDecimalNumber += Long.parseLong(startAr[i]) * Math.pow(256, 3 - i);
			endIptoDecimalNumber += Long.parseLong(endAr[i]) * Math.pow(256, 3 - i);
		}
		return endIptoDecimalNumber - startIptoDecimalNumber;
	}

	public static long ipsBetweenClever(String start, String end) {
		return convertToLong(end) - convertToLong(start);
	}

	public static long convertToLong(String ip) {
		long res = 0;
		for (String s : ip.split("[.]")) {
			res *= 256;
			res += Long.parseLong(s);
		}
		return res;
	}
}
