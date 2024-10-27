package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("12");
		h.add(12);
		h.add(12);//Aynı türde aynı değere sahip birden fazla eleman olamaz
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		
		Iterator itr =h.iterator();
		System.out.println(h.contains(12));
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("******************");
		
		h.forEach(item -> System.out.println(item+ " "));
	}

}
