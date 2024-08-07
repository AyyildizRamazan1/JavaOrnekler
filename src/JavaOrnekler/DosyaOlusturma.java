package JavaOrnekler;

import java.io.*;

public class DosyaOlusturma {

	public static void main(String[] args) throws IOException {
		File dosya = new File("TEst1.txt");
		boolean olustuMu = dosya.createNewFile(); // Bir dosya oluşturma
		System.out.println("olustuMu: " + olustuMu);
	}

}
