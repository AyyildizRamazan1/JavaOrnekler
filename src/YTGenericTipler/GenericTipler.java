package YTGenericTipler;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericTipler {

	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(1);
//		a.add(2);
//
//		for (Integer obj : a) {
//			System.out.println(obj.doubleValue());
//		}
//
//		HashMap<Integer, String> c = new HashMap<>();
//		c.put(1, "Adana");
//		c.put(6, "Ankara");
//		c.put(34, "İstanbul");
//
//		for (Integer key : c.keySet()) {
//			System.out.println("Key : " + key + " - Value : " + c.get(key));
//		}
//
//		for (String value : c.values()) {
//			System.out.println(value);
//		}

//		Test<Integer> i = new Test<Integer>(15);
//		System.out.println(i.getObj());
//
//		Test<String> s = new Test<String>("Ramazan Ayyıldız");
//		System.out.println(s.getObj());
//
//		Test2<Integer, String> r = new Test2<>(1, "Adana");
//		r.print();

		Integer[] intArr = { 1, 2, 3, 4 };
		Double[] doubleArr = { 1.1, 2.1, 3.1 };
		Character[] chaArr = { 'K', 'O', 'D' };

		genericMethod(intArr);
		genericMethod(doubleArr);
		genericMethod(chaArr);

	}

	public static <E> void genericMethod(E[] arr) {
		for (E item : arr) {
			System.out.println(item);
		}
	}

}
