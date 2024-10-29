package Collection;

import java.util.LinkedList;

public class YTLnkdLstOOP {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("Armut");
		list.add("Çilek");
		list.add("Kavun");

		list.add(1, "Karpuz");
		list.forEach(i -> System.out.println(i));
	}

}
