package JavaOrnekler;
import java.util.Scanner;

public class KDVTutariHesaplama {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 double price,total,kdvPrice,rate=18;
		 
		 System.out.print("Tutar Giriniz : ");
		 price= scan.nextDouble();
		 
		 kdvPrice=price*(rate/100);
		 total=kdvPrice+price;
		 
		 System.out.println("KDV Oranı : %"+(int)rate);
		 System.out.println("KDV Tutarı : "+kdvPrice);
		 System.out.println("KDV'li Tutarı : "+total);
	}

}
