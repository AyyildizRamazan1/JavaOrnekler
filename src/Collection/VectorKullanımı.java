package Collection;

import java.util.Vector;

public class VectorKullanımı {

	public static void main(String[] args) {

		Vector v = new Vector(4, 2);
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		System.out.println("Boyut : " + v.size());
		System.out.println("Kapasitesi: " + v.capacity());// boyutu 10 u geçtiğinde capacite 10 un katları olarak artar

	}
}
