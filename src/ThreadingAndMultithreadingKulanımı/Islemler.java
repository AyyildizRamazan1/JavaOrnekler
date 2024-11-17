package ThreadingAndMultithreadingKulanımı;

public class Islemler implements Runnable {
	String name;

	public Islemler(String name) {
		this.name = name;
		System.out.println(name + " işlem oluştu!");
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " işlem bitti");
	}

}
