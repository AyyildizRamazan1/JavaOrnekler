package GY.OOP.SiniflarLab1;

public class Driver {
    public static void main(String[] args) {
        Kalem kursunKalem = new Kalem();
        kursunKalem.marka = "A Marka";
        kursunKalem.tip = "Kurşun Kalem";
        kursunKalem.doldurabilir = false;
        kursunKalem.silinebilir = true;

        kursunKalem.yaz("Merhaba Dünya");
        kursunKalem.tekrarDoldur();
        kursunKalem.sil();

        Kalem dolmaKalem = new Kalem();
        dolmaKalem.marka = "B Kalem";
        dolmaKalem.tip = "Dolma Kalem";
        dolmaKalem.doldurabilir = true;
        dolmaKalem.silinebilir = false;
        dolmaKalem.yaz("Java ile NYP");
        dolmaKalem.tekrarDoldur();
        dolmaKalem.sil();
    }
}
