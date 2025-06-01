public class Car {
	String name;
	String number;
	String color;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null || getClass() != obj.getClass())
	// return false;
	// Car other = (Car) obj;
	// if (number == null) {
	// if (other.number != null)
	// return false;
	// } else if (!number.equals(other.number))
	// return false;
	// return true;
	// }

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car) o;
		return number != null ? number.equals(car.number) : car.number == null;
	}
}
