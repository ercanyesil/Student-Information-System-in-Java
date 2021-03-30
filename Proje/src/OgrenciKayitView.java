import java.util.ArrayList;
import java.util.List;

public class OgrenciKayitView {
	private OgrenciKayit ogrenciKayit = new OgrenciKayit();
	private List<OgrenciKayit> listele = new ArrayList<OgrenciKayit>();
	public void kaydet() {
		getListele().add(getOgrenciKayit());
		setOgrenciKayit(new OgrenciKayit());
	}

	public void sil() {
		getListele().remove(getOgrenciKayit());
		setOgrenciKayit(new OgrenciKayit());
	}

	public void guncelle() {
		setOgrenciKayit(new OgrenciKayit());
	}

	public OgrenciKayit getOgrenciKayit() {
		return ogrenciKayit;
	}

	public void setOgrenciKayit(OgrenciKayit ogrenciKayit) {
		this.ogrenciKayit = ogrenciKayit;
	}

	public List<OgrenciKayit> getListele() {
		return listele;
	}

	public void setListele(List<OgrenciKayit> listele) {
		this.listele = listele;
	}
}
