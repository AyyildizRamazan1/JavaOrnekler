package GY.OOP.SiniflarLab1;

public class Telefon {
    TelefonTip tip;
    String marka;
    String model;
    boolean wifi;
    boolean mobilVeri;

    boolean aramaVarmi;

    void aramaYap(String telefonNumarasi) {
        System.out.println(telefonNumarasi);
        aramaVarmi = true;
    }

    void aramayiSonlandır() {
        if (aramaVarmi) {
            System.out.println("Arama sonlandirildi");
        }
    }

    void mesajGonder(String mesaj) {
        if (mobilVeri || wifi) {
            System.out.println("mesaj gonderildi");
        }
    }


}
