package JavaOrnekler;

import java.util.Scanner;

public class DaireAlanveCevreHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dairenin yarıçap degerini giriniz: ");
		int r = scan.nextInt();
		double alan = Math.PI * r * r;
		double cevre = 2 * Math.PI * r;

		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Cevresi: " + cevre);
	}

}
