package JavaOrnekler;

import java.util.Scanner;

public class MayinTarlasiOyunuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		boolean flag = true;
		System.out.println("Mayın Tarlasına Hoşgeldiniz ! ");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz ! ");
		while (flag) {
			System.out.print("Satır Sayısı : ");
			row = scan.nextInt();
			System.out.print("Sütun Sayısı : ");
			column = scan.nextInt();
			if ((row > 1) && (column > 1)) {
				MayinTarlasiOyunu mayin = new MayinTarlasiOyunu(row, column);
				mayin.run();
				flag = false;
			} else {
				System.out.println("Lütfen 1 den büyük değer giriz !");
				
			}
		}
	}
}
