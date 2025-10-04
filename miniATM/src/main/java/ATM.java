import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("*************************");
        System.out.println("**** Kullanıcı Grişi ****");
        System.out.println("*************************");

        int giris_hakki =3;
        while(true){
            if(login.login(hesap))
            {
                System.out.println("Giriş Başarılı...");
                break;
            }
            else
            {
                System.out.println("Giriş Başarısız");
                giris_hakki--;
                System.out.println("Giriş Hakkı = " + giris_hakki);
            }
            if (giris_hakki == 0) {
                return;
            }
        }

        System.out.println("****************************");
        String islemler ="1-Bakiye Görüntüle \n" +
                "2- Para Yatırma\n" +
                "3- Para Çekme \n" +
                "4- Çıkış";
        System.out.println(islemler);
        System.out.println("****************************");


        while (true){
            System.out.println("İşlemi Seçiniz: ");
            int islem = scanner.nextInt();
            if (islem == 4)
            {
                break;
            }
            else if (islem == 1){
                System.out.println("Mevcut Bakiyeniz : "+ hesap.getBakiye());
            }
            else if (islem == 2){
                System.out.println("Miktar giriniz: ");
                int miktar = scanner.nextInt();
                hesap.paraYatir(miktar);

            } else if (islem == 3) {

                System.out.println("Miktar giriniz: ");
                int miktar = scanner.nextInt();
                hesap.paraCek(miktar);
            }
            else
                System.out.println("Geçersiz işlem... Tekrar Deneyiniz.");

        }
    }
}
