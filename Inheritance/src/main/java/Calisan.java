public class Calisan { // Super Class or Base Class
    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public void calıs(){
        System.out.println("Çalışan, çalışıyor...");
    }

    public void bilgilerigöster(){
        System.out.println("isim: "+ isim); // yönetici sınıfında sorumlu kişi sayısını göstermiyor bu yüzden override yapmış olucaz.
        System.out.println("maaş: " + maas);
        System.out.println("departman: " + departman);
    }

    public void departman_degis(String yeni_departman){
        System.out.println("departman_degiştiriliyor...");
        this .departman = yeni_departman;
        System.out.println("Yeni departman: " + this.departman);
    }
}
