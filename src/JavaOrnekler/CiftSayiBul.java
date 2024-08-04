package JavaOrnekler;

import java.util.Scanner;

public class CiftSayiBul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
