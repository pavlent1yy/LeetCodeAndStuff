package randDatePrototype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DateHistory {
	Map<String, String> dateMap = new HashMap<String, String>();

	public String randEvent() {
		dateMap.put("Окрытие академии Художеств", "1757");
		dateMap.put("Участие России в Семилетней войне", "1757-62");
		dateMap.put("Правление Петра III", "1761-62");
		dateMap.put("Правление Екатерины II", "1762-96");
		dateMap.put("Уложечная коммисия", "1767-68");
		dateMap.put("Первая Русско-Турецкая война", "1768-74");
		dateMap.put("Сражение на реке Ларга c Турками, авт.Петр Румянцев", "1770");
		dateMap.put("Сражение на реке Кагул с Турками, авт.Петр Румянцев", "1770");
		dateMap.put("Морское сражение в Чесменское бухте (Чесма), атв.Г.Спиридов и А.Орлов", "1770");
		dateMap.put("Раздел Польшы", "1772,93,95");
		dateMap.put("Восстание крестьян и казаков под рук. Емельяна Пугачева", "1773-75");
		dateMap.put("Присоединение Крыма", "1783");
		dateMap.put("Присоединение Восточной грузии", "1783");
		dateMap.put("Вторая Русско-Туреская Война", "1787-91");
		dateMap.put("Взятие крепости \"Кинбурн\" ", "1787");
		dateMap.put("Взятие крепости \"Очаков\" ", "1788");
		dateMap.put("Сражение на реке Рывича", "1789");
		dateMap.put("Сражение при Финчинах", "1789");
		dateMap.put("Взятие крепости \"Измаил\" ", "1790");
		dateMap.put("Морское сражение у мыса Калиакрия", "1791");
		dateMap.put("Третья Русско-Турецкая Война", "1788-90");
		dateMap.put("Правление Павла I", "1796-1801");
		dateMap.put("Итальяно-Швецарский поход", "1799");
		dateMap.put("Морское сражение у острава Корфу", "1799");
		Random rand = new Random();
		List<String> eventList = new ArrayList<String>();
		eventList.addAll(dateMap.keySet());
		return eventList.get(rand.nextInt(eventList.size()));

	}
}
