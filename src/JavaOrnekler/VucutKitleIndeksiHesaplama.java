package JavaOrnekler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kilonuzu kg cinsinden giriniz: ");
		double kg=scan.nextDouble();
		
		System.out.print("Boyunuzu metre cinsinden giriniz(virgül ile): ");
		double boy=scan.nextDouble();
		
		double bmi=kg/(boy*boy);
		System.out.println("Vücut Kitle İndeksiniz: "+bmi);
		if(bmi<18.5) {
			System.out.println("Zayıf");
		}else if(18.5 <= bmi && bmi <= 24.9) {
			System.out.println("İdeal");
		}else if(25 <= bmi && bmi <= 29.9) {
			System.out.println("İdeal");
		}else if(30<=bmi && bmi<=34.9) {
			System.out.println("Şişman");
		}else if(35<= bmi) {
			System.out.println("Aşırı Obez");
		}
	}

}
