package GY.TryCatchLab;

public class Isci {

    private String isim;
    private double maas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) throws HataliDeger {
        if (isim == null || isim.trim().isEmpty()) {
            throw new HataliDeger("isim", isim);
        }
        this.isim = isim;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(double maas) throws HataliDeger {
        if (maas < 0) {
            throw new HataliDeger("maas", maas);
        }
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                '}';
    }
}
