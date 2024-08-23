package JavaOrnekler;

import java.util.Scanner;

public class HarmonikSeriHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Harmonik hesaplanacak sayiyi giriniz: ");
		double h = scan.nextInt();
		double sonuc = 0;
		for (double i = 1; i <= h; i++) { //int yerine double olma sebebi bölünen sayılardan birinin double olması lazım int olursa tam değer gelir
			sonuc += (1 / i);
		}
		System.out.println(sonuc);
	}

}
