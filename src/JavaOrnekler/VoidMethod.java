package JavaOrnekler;

public class VoidMethod {

	public static void main(String[] args) {
		/*
		 * Input olarak verilen satis fiyati, musteri karti var mi ? ve uyeliği kaç
		 * yıllık ? bilgileri değerlendirip uye değilse %5 indirim uyeliği var ama 5
		 * yıldan az ise %10 indirim uyeliği var ve 5 yildan cok ise %15 indirim
		 * uygulayip asil fiyati indirim miktarini ve indirimli fiyatı yazdıran bir
		 * method oluşturun
		 */

		boolean uyeMi = false;
		int uelikYili = 3;
		int satisFiyati = 250;
		
		indirimliFiyatHesapla(uyeMi, uelikYili, satisFiyati);
		
	}

	public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, int satisFiyati) {
		if (uyeMi) {
			if (uyelikYili < 5) {
				System.out.println("Urun fiyati: " + satisFiyati);
				System.out.println("Indirim Miktari: " + satisFiyati * 0.1);
				System.out.println("İndirimli Fiyat: " + (satisFiyati - (satisFiyati * 0.1)));
			} else {
				System.out.println("Urun fiyati: " + satisFiyati);
				System.out.println("Indirim Miktari: " + satisFiyati * 0.15);
				System.out.println("İndirimli Fiyat: " + (satisFiyati - (satisFiyati * 0.15)));

			}
		} else {
			System.out.println("Urun fiyati: " + satisFiyati);
			System.out.println("Indirim Miktari: " + satisFiyati * 0.05);
			System.out.println("İndirimli Fiyat: " + (satisFiyati - (satisFiyati * 0.05)));
		}

	}

}
