package JavaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TekSayiToplami {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int sayi = scan.nextInt();
		int toplam = 0;

		List<Integer> tekSayi = new ArrayList<>();

		for (int i = 1; i <= sayi; i++) {
			if (i % 2 == 1) {
				tekSayi.add(i);
				toplam += i;
			}
		}
		System.out.println("Tek sayı değerleriniz: " + tekSayi);
		System.out.println("Sayıların toplamı: " + toplam);
	}

}
