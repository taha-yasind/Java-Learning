public class Otobus {
    private int otobusNumber;
    private final int koltuk_sayisi;
    private int bos_koltuk;

    public Otobus(int otobusNumber, int koltuk_sayisi, int bos_koltuk) {
        this.otobusNumber = otobusNumber;
        this.koltuk_sayisi = koltuk_sayisi;
        this.bos_koltuk = bos_koltuk;
    }

    public int getOtobusNumber() {
        return otobusNumber;
    }

    public void setOtobusNumber(int otobusNumber) {
        this.otobusNumber = otobusNumber;
    }

    public int getKoltuk_sayisi() {
        return koltuk_sayisi;
    }

    public int getBos_koltuk() {
        return bos_koltuk;
    }

    public void setBos_koltuk(int bos_koltuk) {
        this.bos_koltuk = bos_koltuk;
    }
    public void rezerve()
    {
        if(bos_koltuk > 0){
            bos_koltuk--;
            System.out.println("Rezervasyonunuz Başarıyla Yapılmıştır.");
            System.out.println(bos_koltuk +"boş koltuk kaldı." );
        }
        else{
            System.out.println("Maalsef boş koltuk bulunmamakta.");
        }
    }
    public void iptal() {
        if (bos_koltuk < koltuk_sayisi) {
            bos_koltuk++;
            System.out.println("Biletiniz iptal edilmiştir.");
            System.out.println("Boş Koltuk sayısı: " + bos_koltuk);
        } else {
            System.out.println("İptal edilebilir bilet bulunmamakta.");
        }
    }

    public void KoltukSayisi(){
        System.out.println("Şu anda bulunan boş koltuk sayısı "+ bos_koltuk);
    }
}
