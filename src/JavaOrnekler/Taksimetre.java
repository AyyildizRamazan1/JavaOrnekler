package JavaOrnekler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taksimetre {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); // Virgülden sonra sadece iki basamak gözükmesi için
		int baslangic = 10;

		System.out.print("Kaç km yol gittiniz: ");
		int yol = scan.nextInt();

		double odeme = (double) (yol * (2.20));

		if (odeme < 20) {
			odeme = 20;
			System.out.println("Kısa mesafe ücreti: " + odeme);
		} else {
			double sonTutar = (double) (odeme + baslangic);
			System.out.println("Odeme tutarınız: " + df.format(sonTutar));
		}

	}

}
