
public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, String id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;

    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : " + sorumlu_kisi_sayisi);

    }
    public void zamYap(int zamMiktari) {

        System.out.println(getIsim() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    }

}
