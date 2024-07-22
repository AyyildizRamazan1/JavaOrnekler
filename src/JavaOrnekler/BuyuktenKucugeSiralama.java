package JavaOrnekler;

import java.util.Arrays;
import java.util.Scanner;

public class BuyuktenKucugeSiralama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 3 adet sayı giriniz");

		int[] sDizi = new int[3];
		System.out.print("Sayı1: ");
		sDizi[0] = scan.nextInt();
		System.out.print("Sayı2: ");
		sDizi[1] = scan.nextInt();
		System.out.print("Sayı3: ");
		sDizi[2] = scan.nextInt();

		Arrays.sort(sDizi);

		for (int i = 0; i < sDizi.length; i++) {
			System.out.print(sDizi[i]);
			if (i < sDizi.length - 1) {
				System.out.print(",");
			}

		}
	}

}
