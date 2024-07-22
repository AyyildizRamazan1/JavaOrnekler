package JavaOrnekler;

import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hava kaç derece: ");
		int sicaklik = scan.nextInt();
		if (sicaklik < 5) {
			System.out.println("Kayak yapmalısın");
		} else if (sicaklik >= 5 && sicaklik <= 15) {
			System.out.println("Tiyatroya gitmelisin");
		} else if (sicaklik > 15 && sicaklik <= 25) {
			System.out.println("Mangal yapmalısın");
		} else if (sicaklik > 25) {
			System.out.println("Yüzmelisin");
		}

	}

}
