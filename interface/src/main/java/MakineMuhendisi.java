public class MakineMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean adli_sicil_kaydi;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil_kaydı) {
        this.askerlik = askerlik;
        this.adli_sicil_kaydi = adli_sicil_kaydı;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi Yaptım.");
        }
        else
            System.out.println("Askerliğimi henüz yapmadım.");

    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam" + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil_kaydi) {
            System.out.println("Adli sicil kaydı bulunmaktadır.");
        }
        else
            System.out.println(" Adli Sicil Kaydı Bulunmamaktadır");

    }

    @Override
    public void is_tecrübesi(String[] array) {
        if(array.length==0){
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
        }
        else
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım ; ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void referans_getir(String[] array) {
        if(array.length==0){
            System.out.println("Herhangi bir referans bulunmuyor.");
        }
        else
            System.out.println("Referanslarım...");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
    }
}}

