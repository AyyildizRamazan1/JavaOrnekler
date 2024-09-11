package JavaOrnekler;

public class Try {

	public static void main(String[] args) {
		System.out.println("Program Başladı");
		try {
			int a = 2 / 0;
			System.out.println(a);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Program Bitti");

		int[] arr = new int[3];
		try {
			arr[4] = 10;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Kısmı");
		}
		System.out.println("Program Bitti !");
	}

}
