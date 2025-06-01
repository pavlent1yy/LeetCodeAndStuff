package OOP;

import java.util.List;
import java.util.stream.Collectors;

public class MainOOP {
	public static void main(String[] args) {
		List<Person> persons = Data.getPersons();

		List<Person> persons2 = persons.stream()
				.filter(p -> p.getAge() > 40)
				.sorted()
				.collect(Collectors.toList());

		persons2.forEach(p -> System.out.println(p));

		// for (Person person : persons2) {
		// System.err.println(person);
		// }

		long personCount = persons.stream().filter(p -> p.getAge() > 30).count();

		System.out.println(personCount);
	}

}
