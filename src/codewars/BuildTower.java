package codewars;

public class BuildTower {
	public static void main(String[] args) {
		String[] sl = towerBuilder(50);
		for (int i = 0; i < sl.length; i++) {
			System.out.println(sl[i]);
		}
	}

	public static String[] towerBuilder(int nFloors) {
		String[] list = new String[nFloors];
		for (int i = 0; i < nFloors; i++) {
			list[i] = " ".repeat(nFloors - i - 1) + "*".repeat((i + 1) * 2 - 1) + " ".repeat(nFloors - i - 1);
		}
		return list;

	}
}
