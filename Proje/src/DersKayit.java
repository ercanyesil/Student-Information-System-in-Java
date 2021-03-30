import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DersKayit {
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private String okulNO;
	private String dersSecimi;
	private String ogrenimTuru;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getOkulNO() {
		return okulNO;
	}

	public void setOkulNO(String okulNO) {
		this.okulNO = okulNO;
	}

	public String getDersSecimi() {
		return dersSecimi;
	}

	public void setDersSecimi(String dersSecimi) {
		this.dersSecimi = dersSecimi;
	}

	public String getOgrenimTuru() {
		return ogrenimTuru;
	}

	public void setOgrenimTuru(String ogrenimTuru) {
		this.ogrenimTuru = ogrenimTuru;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
