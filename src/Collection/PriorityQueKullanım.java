package Collection;

import java.util.PriorityQueue;

public class PriorityQueKullanım {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();

		q.add(80);
		q.add(20);
		q.add(10);
		q.add(50);

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
