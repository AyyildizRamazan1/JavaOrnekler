package JavaOrnekler;

import java.util.Scanner;

public class BasitHesapMakinesi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen bir tam sayı giriniz: ");
		double a=scan.nextDouble();
		System.out.print("Lütfen bir tam sayı giriniz: ");
		double b=scan.nextDouble();
		
		System.out.println("1- Toplama");
		System.out.println("2- Çıkartma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		
		System.out.print("Hangi işlemi yapmak istersiniz(sayı giriniz): ");
		int c=scan.nextInt();
		
		switch (c) {
		case 1:
			System.out.println("Toplama işlemi sonucunuz: "+(a+b));
			break;
		case 2:
			System.out.println("Çıkartma işlemi sonucunuz: "+(a-b));
			break;
		case 3:
			System.out.println("Çarpma işlemi sonucunuz: "+(a*b));
			break;
		case 4:
			if(b==0) {
				System.out.println("Bölen sayı sıfır olamaz!!!");
			}else {
				System.out.println("Bölme işlemi sonucunuz: "+(a/b));
			}
			break;	
			
		default:
			System.out.println("Lütfen 1 ile 4 arası bir işlem seçiniz!!!");
			break;
		}
		
	}
}
