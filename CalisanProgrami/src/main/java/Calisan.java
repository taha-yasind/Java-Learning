public class Calisan {
    private String isim;
    private String soyad;
    private String id;

    public Calisan(String isim, String soyad, String id) {
        this.isim = isim;
        this.soyad = soyad;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void bilgilerigoster(){
        System.out.println("Bilgilerigoster...");
        System.out.println("Çalışan ismi: " + isim );
        System.out.println("Çalışan soyad: " + soyad );
        System.out.println("Çalışan Id: " + id);
    }

}