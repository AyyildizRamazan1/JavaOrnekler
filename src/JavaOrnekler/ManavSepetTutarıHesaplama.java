package JavaOrnekler;

import java.util.Scanner;

public class ManavSepetTutarıHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salatalik = 3.14;
		double elma = 4.11;
		double kabak = 2.22;
		double domates = 0.95;
		double patlican = 7.00;

		System.out.print("Salatalik kaç kg: ");
		double salatalikKilo = scan.nextDouble();

		System.out.print("Elma kaç kg: ");
		double elmaKilo = scan.nextDouble();

		System.out.print("Kabak kaç kg: ");
		double kabakKilo = scan.nextDouble();

		System.out.print("Domates kaç kg: ");
		double domatesKilo = scan.nextDouble();

		System.out.print("Patlican kaç kg: ");
		double patlicanKilo = scan.nextDouble();

		double toplam = 0;
		toplam = (salatalik * salatalikKilo);
		toplam += elmaKilo * elma;
		toplam += kabakKilo * kabak;
		toplam += domatesKilo * domates;
		toplam += patlicanKilo * patlican;
		System.out.println("Ödenecek Tutar: " + toplam);
	}

}
