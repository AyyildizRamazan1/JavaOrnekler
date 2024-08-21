package JavaOrnekler;

import java.util.Scanner;

public class Diskriminant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double kok1, kok2;
		System.out.print("A sayısını giriniz: ");
		int a = scan.nextInt();
		System.out.print("B sayısını giriniz: ");
		int b = scan.nextInt();
		System.out.print("C sayısını giriniz: ");
		int c = scan.nextInt();

		int delta = b * b - (4 * a * c);
		System.out.println(delta);

		if (delta > 0) {
			System.out.println("Denklemin 2 kökü vardır");
			kok1 = (-b - Math.sqrt(delta)) / 2 * a;
			kok2 = (-b + Math.sqrt(delta)) / 2 * a;
			System.out.println("Kök 1: " + kok1);
			System.out.println("Kök 2: " + kok2);
		} else if (delta == 0) {
			System.out.println("Denklemin çakışık iki kökü vardır.");
			kok1 = (-b) / 2 * a;
			System.out.println("Kökler = " + kok1);
		} else {
			System.out.println("Denklemin kökü yoktur");
		}
	}

}
