package JavaOrnekler;

public class OgretimUyesi extends Akademisyen {
	protected String unvan;

	public OgretimUyesi(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String unvan) {
		super(adsoyad, eposta, telefon, bolum, gorevler, ders);
		this.unvan = unvan;
	}

	public String giris() {
		return this.unvan + " " + super.giris();
	}
}
