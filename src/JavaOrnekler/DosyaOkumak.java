package JavaOrnekler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyaOkumak {

	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		
		 try {
			fileInputStream = new FileInputStream("dosya.txt");
			fileInputStream.skip(8);//başlanacak değeri gösteriyor
			System.out.println((char)(fileInputStream.read()));
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı");
		} catch (IOException e) {
			System.out.println("Okunurken bir hata oluştu");			
		}finally {
			try {
				if(fileInputStream != null) {
					fileInputStream.close();
				}
				
			} catch (IOException e) {
				System.out.println("Kapatılırken bir hata oluştu");
			}
		}

	}

}
