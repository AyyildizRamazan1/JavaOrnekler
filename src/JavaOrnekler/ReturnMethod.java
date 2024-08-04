package JavaOrnekler;

public class ReturnMethod {

	public static void main(String[] args) {
		/*
		 * Input olarak verilen isim ve soyismi ilk harfleri buyuk diğer harfler kucuk
		 * olarak değiştirip programın sonraki bolumlerinde kullanılabilmek uzere
		 * isimSoyisim variable'na atacak bir method olusturun input Isim: Ramazan
		 * ,Soyisim: Ayyıldız output isimSoyisim: Ramazan Ayyıldız seklinde kayıt
		 */

		String isim = "RAMAZAN";
		String soyisim = "AYYILDIZ";
		System.out.println("İlk girilen: " + isim + " " + soyisim);

		String isimSoyisim = isimDuzenle(isim, soyisim);
		System.out.println("Düzenlenmiş Hali: " + isimSoyisim);
	}

	private static String isimDuzenle(String isim, String soyisim) {

		String isimDuzenlenmis = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

		String soyisimDuzenlenmis = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

		return isimDuzenlenmis + " " + soyisimDuzenlenmis;
	}

}
