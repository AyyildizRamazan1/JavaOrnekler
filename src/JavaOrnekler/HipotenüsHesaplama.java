package JavaOrnekler;

import java.util.Scanner;

public class HipotenüsHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. Kenarı Giriniz : ");
		int value1 = scan.nextInt();
		
		System.out.print("2. Kenarı Giriniz : ");
		int value2 =scan.nextInt();
		
		double value3 = Math.sqrt((value1*value1)+(value2*value2));
		System.out.println("Hipotenüs: "+value3);
	}

}
