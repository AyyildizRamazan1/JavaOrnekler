package NestedandInnerClass;

public class Main {

	public static void main(String[] args) {
		NonStatic n = new NonStatic();
		NonStatic.Inner inner = n.new Inner();
		// inner.run();

		Static.Inner s = new Static.Inner();
		// s.run();

		Local l = new Local();
		// l.run();

		Anonim a = new Anonim() {//Buraya yeni bir metod yazamazsın sadece override edersin
			public void run() {
				System.out.println("Anonim sınıfına ait bir run metodu");
			}

			public void print() {
				System.out.println("print");
			}

		};
		a.run();

	}

}
