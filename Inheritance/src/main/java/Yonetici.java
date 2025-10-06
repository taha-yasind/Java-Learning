public class Yonetici extends Calisan { // Sub Class

    private int sorumluKisi;

    public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
      /*  this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        */
        super(isim, maas, departman); // miras alinan classın constructor'ını super ile kullanabilirsin.
        this.sorumluKisi = sorumluKisi;
    }

    public void zam_yap(Calisan calisan, int zam_Miktari) {
        System.out.println(calisan.getIsim() + " adlı çalışana "+ zam_Miktari+ " TL zam yapıldı.");

    }
    public void bilgilerigöster(){
     /*   System.out.println("isim: "+ getIsim()); // yönetici sınıfında sorumlu kişi sayısını göstermiyor bu yüzden override yapmış olucaz.
        System.out.println("maaş: " + getMaas());
        System.out.println("departman: " + getDepartman()); */
        super.bilgilerigöster();
        System.out.println("Sorumlu Kişi sayısı "+ this.sorumluKisi);
    }
    }
