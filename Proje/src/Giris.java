
public class Giris {
	private String kullaniciAdi;
	private String sifre;
	public String giris() {
		if((kullaniciAdi.equals("171002009")||kullaniciAdi.equals("171002019")||kullaniciAdi.equals("171002072")||kullaniciAdi.equals("171002003"))&&sifre.equals("123"))
			return "dogru";
		else
			return "yanlis";
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
}
