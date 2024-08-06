package JavaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CiftSayiBul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int sayi = scan.nextInt();
		int toplam = 0;
		List<Integer> sayilar = new ArrayList<>();

		for (int i = 1; i <= sayi; i++) {
			if (i % 20 == 0) {
				sayilar.add(i);
				toplam += i;     // Liste elemanları toplama işlemi
			}

		}

		System.out.println("Dizideki elemanlar: " + sayilar);

		System.out.println("Dizideki eleman sayısı: " + sayilar.stream().count()); // Listenin elaman sayısını görme

		System.out.println("Dizideki elemanların toplamı: " + toplam); // Listedeki elemanların toplamı
		int ort = (int) sayilar.stream().count();
		System.out.println("Dizinin ortalaması: " + toplam / ort);
	}

}
