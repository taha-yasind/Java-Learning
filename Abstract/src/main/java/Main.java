public class Main {
    public static void main(String[] args) {
        Sekil sekil;
        sekil = new Kare ("kare2", 6);
        Kare kare1 = new Kare("kare2",2);
        Daire daire1 = new Daire("daire2",2);

        kare1.alanHesapla();
        daire1.alanHesapla();
        sekil.alanHesapla();
        kare1.CevreHesapla();

    }
}
