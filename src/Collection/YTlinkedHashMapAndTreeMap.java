package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class YTlinkedHashMapAndTreeMap {

	public static void main(String[] args) {
		// - clear() Map içinde bulunan bütün değerleri siler
		// - get (Object key) Anahtara karşılık gelen objeyi döndürür
		// - put (Object key, Object value): Anahtar - değer ikilisini kayıt eder.

//		LinkedHashMap ogr = new LinkedHashMap();
//		ogr.put("Ali", 90);
//		ogr.put("Veli", 80);
//		ogr.put("Ahmet", 75);
		
		TreeMap ogr = new TreeMap();//küçükten büyüğe
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		ogr.put("Ahmet", 75);

		Set set = ogr.entrySet();

		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => " + item.getValue());
		}
	}
}
