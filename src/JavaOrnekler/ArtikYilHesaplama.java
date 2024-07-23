package JavaOrnekler;

import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir yıl giriniz: ");
		int yil = scan.nextInt();

		if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
			System.out.println(yil + " Artık yıldır");
		} else {
			System.out.println(yil + " Artık yıl değildir");
		}

	}

}
