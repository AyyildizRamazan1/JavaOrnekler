package JavaOrnekler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GirisCikisIslemleri {

	public static void main(String[] args) {
		FileOutputStream fileOutPutStream = null;
		try {
			fileOutPutStream = new FileOutputStream("dosya.txt", true); // true yazarsak eski yazdığımız verilerde kalır

//			fileOutPutStream.write(85);
//			fileOutPutStream.write(86);
//
//			byte[] dizi = { 66, 65, 66, 65 };
//			fileOutPutStream.write(dizi);

			String isim = "Ramazan Ayyıldız";
			byte[] isimDizi = isim.getBytes();
			fileOutPutStream.write(isimDizi);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosyaya yazılırken bir hata oluştu");
		} finally {
			try {
				if (fileOutPutStream != null) {
					fileOutPutStream.close();
				}
			} catch (IOException e) {
				System.out.println("Dosya kapatılırken bir hata ile karşılaşıldı!");
			}
		}

	}

}
