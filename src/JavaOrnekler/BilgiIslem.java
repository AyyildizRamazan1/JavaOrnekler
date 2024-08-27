package JavaOrnekler;

public class BilgiIslem extends Memurlar{
	protected String gorev;

	public BilgiIslem(String adSoyad, String eposta, String telefon, String departman, String mesai, String gorev) {
		super(adSoyad, eposta, telefon, departman, mesai);
		this.gorev = gorev;
	}
}
