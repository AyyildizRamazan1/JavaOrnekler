package JavaOrnekler;

import java.util.Scanner;

public class KuvvetBulanProgram {

	public static void main(String[] args) {
		double sonuc = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Kuvveti hesaplanacak sayıyı giriniz:  ");
		int n = scan.nextInt();
		System.out.print("Sayının kaçıncı kuvveti olacağını yazınız: ");
		int k = scan.nextInt();
		if (n > 0 && k > 0) {
			for (int i = 1; i <= k; i++) {
				sonuc = sonuc * n;
			}
			System.out.println(sonuc);
		} else if (n > 0 && k == 0) {
			System.out.println("1");
		} else {
			System.out.println("Lütfen sayıları 0 dan büyük giriniz!!!");
		}

	}

}
