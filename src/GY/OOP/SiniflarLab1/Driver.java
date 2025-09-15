package GY.OOP.SiniflarLab1;

public class Driver {
    public static void main(String[] args) {
        /*Kalem kursunKalem = new Kalem();
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
        dolmaKalem.sil();*/

        /*Telefon telefon = new Telefon();
        telefon.marka = "X Marka";
        telefon.model = "Y Model";
        telefon.tip = TelefonTip.CEP;
        telefon.mobilVeri = true;
        telefon.wifi = true;

        telefon.aramaYap("5555555555");
        telefon.aramayiSonlandır();
        telefon.mesajGonder("merhaba, nasılsın");*/

        Kopek kangal = new Kopek();
        kangal.cins = "Sivas Kangal";
        kangal.boyut = Boyut.BUYUK;
        kangal.renk = Renk.SIYAH;
        kangal.yas = 6;

        kangal.yemekYe();
        kangal.otur();
        kangal.kos();
        kangal.uyu();


    }
}