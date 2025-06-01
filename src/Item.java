public class Item {
	private int weight;
	private int value;

	public Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}

	public double unitValue() {
		return value / (double) weight;
	}

	public int getWaight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "{ w: " + weight + " v: " + value + " }";
	}
}
