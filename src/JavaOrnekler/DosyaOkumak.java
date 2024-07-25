package JavaOrnekler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class DosyaOkumak {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        CheckedInputStream cis = null;

        try {
            fileInputStream = new FileInputStream("dosya.txt");
            CRC32 crc32r = new CRC32();
            cis = new CheckedInputStream(fileInputStream, crc32r);

            int deger;
            StringBuilder s = new StringBuilder();
            while ((deger = cis.read()) != -1) {
                s.append((char) deger);
            }

            System.out.println(s.toString());
            Checksum cs = cis.getChecksum();
            long cisDeger = cs.getValue();
            System.out.println("CRC32 = " + cisDeger);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı");
        } catch (IOException e) {
            System.out.println("Okunurken bir hata oluştu");
        } finally {
            try {
                if (cis != null) {
                    cis.close();
                }
            } catch (IOException e) {
                System.out.println("Kapatılırken bir hata oluştu");
            }
        }
    }
}
