package JavaOrnekler;

public class OkulMain {

	public static void main(String[] args) {
		Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "05555555555", "Bst", "Hoca", "Veri Tabanı");
		System.out.println(a.getAdSoyad());

		OgretimUyesi o = new OgretimUyesi("Ramazan Ayyıldız", "r@gmail.com", "0555 555 55 55", "Bst", "Asistan",
				"Java101", "Ogretim Üyesi");
		o.giris();
	}

}
