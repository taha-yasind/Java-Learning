public class Main {
    public static void main(String[] args)
    {
        ATM atm = new ATM();
        Hesap hesap= new Hesap("TahaYasin", "1708", 5000);

        atm.calis(hesap);

        System.out.println("Programdan Kapatılıyor...");
    }
}
