package JavaOrnekler;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz: ");
		int f = scan.nextInt();
		double sonuc = 1;
		if (f >= 0) {
			for (int i = 1; i <= f; i++) {
				sonuc *= i;
			}
			System.out.println(sonuc);
		} else {
			System.out.println("Lütfen negatif değer girmeyiniz");
		}

	}

}
