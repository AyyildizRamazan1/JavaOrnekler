package Collection;

import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		// içindeki değerleri küçükten büyüğe doğru artan sırayla verir
		TreeSet tree = new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(2);
		tree.add(6);

		tree.forEach(item -> System.out.println(item + " "));

	}

}
