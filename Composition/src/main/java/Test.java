public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS","18.5", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("B250-PRO", "ASUS,", 10, "Windows 10");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayari_ac(); // Bilgisayar sınıfının içinde get kasa referansını kullanarak kasa sınıfına ve methondlarına erişim sağlayabiliriz.

        pc.getMonitor().Monitor_kapat();

        pc.getAnakart().isletim_sistemi_yukle("Fedora 42");

    }
}
