import java.util.List;
import javax.persistence.EntityManager;
import com.mergeCons.egitim.util.EntityUtil;

import java.util.ArrayList;
public class DersKayitView {
private DersKayit dersKayit = new DersKayit();
private List<DersKayit> listele = new ArrayList<DersKayit>();
private String ogrenciAd;
private String ogrenciSoyad;
public void kaydet() {
//	listele.add(getDersKayit());
//  setDersKayit(new DersKayit());
	EntityManager en = EntityUtil.getEntityManager();
    en.getTransaction().begin();
    en.persist(dersKayit);
    en.getTransaction().commit();
    dersKayit = new DersKayit();
}
public void sil() {
//	listele.remove(getDersKayit());
//	setDersKayit(new DersKayit());
	EntityManager en = EntityUtil.getEntityManager();
    en.getTransaction().begin();
    en.remove(dersKayit);
    en.getTransaction().commit();
    dersKayit = new DersKayit();
	
}
public void duzenle() {
//	setDersKayit(new DersKayit());
	EntityManager en = EntityUtil.getEntityManager();
    en.getTransaction().begin();
    en.merge(dersKayit);
    en.getTransaction().commit();
    dersKayit = new DersKayit();
}
public List<DersKayit> getListele() {
	EntityManager en = EntityUtil.getEntityManager();
    return en.createQuery("from DersKayit").getResultList();
}
public List<DersKayit> getListeAra() {
    EntityManager en = EntityUtil.getEntityManager();
    return en.createQuery("from DersKayit where ad like :isim and soyad like :soyad")
            .setParameter("isim", this.ogrenciAd + "%").setParameter("soyad", this.ogrenciSoyad + "%")
            .getResultList();
}
public void setListele(List<DersKayit> listele) {
	this.listele = listele;
}
public DersKayit getDersKayit() {
	return dersKayit;
}
public void setDersKayit(DersKayit dersKayit) {
	this.dersKayit = dersKayit;
}
public String getOgrenciAd() {
	return ogrenciAd;
}
public void setOgrenciAd(String ogrenciAd) {
	this.ogrenciAd = ogrenciAd;
}
public String getOgrenciSoyad() {
	return ogrenciSoyad;
}
public void setOgrenciSoyad(String ogrenciSoyad) {
	this.ogrenciSoyad = ogrenciSoyad;
}

}
