package JavaOrnekler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GirisCikisIslemleri {

	public static void main(String[] args) {
		FileOutputStream fileOutPutStream= null;
		try {
			fileOutPutStream = new FileOutputStream("dosya.txt");
		} catch (FileNotFoundException e) {
			 System.out.println("Dosya bulunamadı");
		}finally {
			try {
				if(fileOutPutStream !=null) {
					fileOutPutStream.close();	
				}
			} catch (IOException e) {
				System.out.println("Dosya kapatılırken bir hata ile karşılaşıldı!");
			}
		}
		
	}

}
