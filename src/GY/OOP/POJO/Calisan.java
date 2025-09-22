package GY.OOP.POJO;

import java.util.Date;

public class Calisan {

    private String isim;
    private double maas;
    private Date iseGirisTarihi;

    public void setIsim(String s) {
        isim = s;
    }

    public String getIsim() {
        return isim;
    }

    public void setMaas(double d) {
        maas = d;
    }

    public double getMaas() {
        return maas;
    }

    public void setIseGirisTarihi(Date i) {
        iseGirisTarihi = i;
    }

    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }
}
