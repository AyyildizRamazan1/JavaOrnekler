package GY.OOP.ErisimKontrol.ErisimKontrol1;

public class Ogrenci {

    public int numara;
    public String ad;
    public String soyad;
    private int yas;

    public void setYas(int y) {
        if (y > 0) {
            yas = y;
        } else {
            System.out.println("Yaş değeri 0'dan küçük olamaz");
        }
    }

    public void bilgileriYazdir() {
        System.out.println("Numara: " + numara);
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
    }

}
