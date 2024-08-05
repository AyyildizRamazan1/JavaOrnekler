package JavaOrnekler;

import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Kaç kişi için veri gireceksiniz?: ");// Kullanıcıdan tablo boyutunu alma
		int kisiSayisi = scan.nextInt();
		int[][] tablo = new int[kisiSayisi][3];

		for (int i = 0; i < kisiSayisi; i++) {// Kullanıcıdan alınan verielrin tabloya eklenmesi
			System.out.println((i + 1) + ". kisinin kilosunu giriniz: ");
			tablo[i][0] = scan.nextInt();
			System.out.println((i + 1) + ". kisinin boyunu(cm) giriniz: ");
			tablo[i][1] = scan.nextInt();
			System.out.println((i + 1) + ". kisinin yasını giriniz: ");
			tablo[i][2] = scan.nextInt();
		}

		System.out.println("Girilen veriler:");
		for (int i = 0; i < kisiSayisi; i++) {
			System.out.println(
					"Kisi " + (i + 1) + "- Kilo" + tablo[i][0] + ", Boy: " + tablo[i][1] + ", Yas: " + tablo[i][2]);
		}
		scan.close();
	}

}
