package JavaOrnekler;

public class PalindromString {

	public static void main(String[] args) {
		String str = "kapak", tmp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tmp += str.charAt(i);
		}
		if (tmp.equals(str)) {
			System.out.println("Polindromik");
		} else {
			System.out.println("Polindromik değil");
		}
	}

}
