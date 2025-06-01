public class Person {
	public static void main(String[] args) {
		Person person = new Person("Bill", 17);
		System.out.println(person);

	}

	private String name;

	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name - " + name + "\nage - " + age;
	}
}
