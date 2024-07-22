package JavaOrnekler;

import java.util.Scanner;

public class OtobusBiletFiyatiHesaplama {

	public static void main(String[] args) {
		int km = 0;
		int age = 0;
		int tripType = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz: ");
		km = input.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		age = input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2=> Gidiş Dönüş)");
		tripType = input.nextInt();

		if (km > 0 || age > 0 || (tripType == 1 || tripType == 2)) {
			double ticketPrice = km * 0.10;
			double ageDiscountPrice = 0;
			double ageDiscountRate = 0;
			double tripDiscount =0;
			
			if (age < 12) {
				ageDiscountRate  =0.50;
			} else if (age >= 12 && age <= 24) {
				ageDiscountRate  =0.10;
			} else if (age > 65) {
				ageDiscountRate  =0.30;
			}
			ageDiscountPrice = ticketPrice*ageDiscountRate; 
			double ticketDiscountPrice=ticketPrice-ageDiscountPrice;
			
			if(tripType==2) {
				ticketDiscountPrice-= ticketDiscountPrice*0.20;
				ticketDiscountPrice*=2;
			}
			System.out.println("Toplam Tutar = "+ticketDiscountPrice);
		} else {
			System.out.println("Hatalı veri girdiniz");
		}

	}

}
