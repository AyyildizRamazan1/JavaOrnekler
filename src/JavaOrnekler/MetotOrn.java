package JavaOrnekler;

public class MetotOrn {
	
	public static void main(String[] args) {
		power(2, 3);
	}
	static void power(int sayi1, int sayi2) {
		int result=1;
		for(int i=1;i<=sayi2;i++) {
			result *=sayi1;
			}
		System.out.println("Cevap: "+result);
		}
}

