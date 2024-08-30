package JavaOrnekler;

public class OkulMain {

	public static void main(String[] args) {
		// Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "05555555555", "Bst",
		// "Hoca", "Veri Tabanı");

		OgretimUyesi o = new OgretimUyesi("Ramazan Ayyıldız", "r@gmail.com", "0555 555 55 55", "Bst", "Asistan",
				"Java101", "Ogretim Üyesi");

		Asistan as = new Asistan("Hasan Ayyıldız", "h@gmail.com", "0522 222 65 63", "Tıp", "Sağlık", "Tıp101",
				"Doktora");

		// Calisan c = new Akademisyen("AhmetPolymorphism", "a@gmail.com",
		// "05555555555", "Bst", "Hoca", "Veri Tabanı");
		// Calisan[] girisListesi = { a, o, as };
		// Calisan.listele(girisListesi);

		o.derseGir(10);
	}
}
