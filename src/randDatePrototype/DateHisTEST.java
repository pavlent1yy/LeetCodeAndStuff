package randDatePrototype;
import java.util.Scanner;

public class DateHisTEST {
	public static void main(String[] args) {
		DateHistory dateHistory = new DateHistory();
		String finalEvent = dateHistory.randEvent();
		System.out.print("Событие " + "\"" + finalEvent + "\"" + " произошло в : ");
		Scanner scan = new Scanner(System.in);
		String userAttempt = scan.nextLine();
		if (userAttempt.equals(dateHistory.dateMap.get(finalEvent))) {
			System.out.println(
					"Молодец, Событие " + "\"" + finalEvent + "\"" + " действительно произошло в "
							+ dateHistory.dateMap.get(finalEvent) + " году\n");
		} else {
			System.out.println("Нет, событие " + "\"" + finalEvent + "\"" + " произошло в "
					+ dateHistory.dateMap.get(finalEvent) + " году\n");
		}
		scan.close();
	}
}
