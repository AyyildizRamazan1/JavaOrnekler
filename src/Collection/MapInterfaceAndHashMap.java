package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceAndHashMap {

	public static void main(String[] args) {
		// - clear() Map içinde bulunan bütün değerleri siler
		// - get (Object Key) Anahtara karşılık gelen objeyi döndürür
		// - put (Object key, Object value): Anahtar - değer ikilisini kayıt eder.

		HashMap b = new HashMap();
		b.put("Türkiye", "Ankara");
		b.put("Fransa", "Paris");
		b.put("İngiltere", "Londra");

		Set s = b.entrySet();
		Iterator i = s.iterator();//koleksiyonlar içinde gezinmeye yarar

		while (i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => " + item.getValue());

		}

	}

}
