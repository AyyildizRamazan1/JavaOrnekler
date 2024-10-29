package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {

		ArrayList country = new ArrayList();
		country.add("Ankara");
		country.add("Siirt");
		country.add("Bolu");
		country.add("Ankara");

		Iterator itr = country.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		country.forEach(i -> System.out.println(i));
	}

}
