package codewars;

public class RGBToHexConversion {
	public static void main(String[] args) {
		// System.out.println(rgb(255, 255, 255)); // FFFFFF
		// System.out.println(rgb(255, 255, 300)); // FFFFFF
		// System.out.println(rgb(0, 0, 0)); // 000000
		// System.out.println(rgb(148, 0, 211)); // 9400D3
		// System.out.println(rgb(-20, 275, 125)); // 00FF7D
		System.out.println(rgb(1, 2, 3)); // 01 0203
	}

	public static String rgb(int r, int g, int b) {
		String RGBString = "";
		int[] rgb = { r, g, b };
		for (int i = 0; i < rgb.length; i++) {
			if (rgb[i] > 255)
				rgb[i] = 255;
			if (rgb[i] < 0)
				rgb[i] = 0;
			if (rgb[i] < 10)
				RGBString += "0";
			RGBString += Integer.toHexString(rgb[i]);
		}
		return RGBString.toUpperCase();
	}
}
