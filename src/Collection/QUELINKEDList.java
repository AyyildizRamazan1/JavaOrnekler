package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QUELINKEDList {

	public static void main(String[] args) {
		// - element() Kuyruğun başındaki öğeyi verir ama onu kuyruktan atmaz.
		// - offer(E o) Mümkünse, verilen öğeyi kuyruğa ekler.
		// - peek() Kuyruğun başındaki öğeyi verir ama onu kuyruktan atmaz. Kuyruk boşsa null verir.
		// - poll() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk boşsa null verir.
		// - remove() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar

		Queue q = new LinkedList();
		q.add("Deniz");
		q.add("Mehmet");
		q.offer("Ali");//Mümkünse verilen öğeyi kuyruğa ekler
		q.offer("Damla");
		
		System.out.println("remove(): "+q.remove());//Kuyruğun başındaki öğeyi verir ve kuyruktan atar
		q.forEach(i -> System.out.println(i));
	}

}
