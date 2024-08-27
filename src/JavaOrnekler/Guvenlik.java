package JavaOrnekler;

public class Guvenlik extends Memurlar{
	protected String belge;

	public Guvenlik(String adSoyad, String eposta, String telefon, String departman, String mesai, String belge) {
		super(adSoyad, eposta, telefon, departman, mesai);
		this.belge = belge;
	}
}
