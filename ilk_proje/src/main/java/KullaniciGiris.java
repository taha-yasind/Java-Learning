import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int girisDeneme =3;

        String KullaniciAdi= "Taha";
        int sifre = 1708;
        System.out.println("*******************************");
        System.out.println("          HOSGELDİNİZ ");
        System.out.println("*******************************");
        while(true)
        {
            if(girisDeneme > 0)
            {
                System.out.println("Kullanıcı Adını Girniz: ");
                String girilen = scanner.nextLine();
                if (KullaniciAdi.equals (girilen))
                {
                   while(true)
                   {
                       System.out.println("Şifre:");
                       int girilenSifre = scanner.nextInt();
                       scanner.nextLine();  //önemli. nextInt aldıktan sonra next line koymalısın.
                       if (girilenSifre == sifre) {
                           System.out.println("Giriş Yapıldı.");
                           break;
                       } else {
                           System.out.println("Şifre Hatalı Tekrar deneyiniz...\n");
                           System.out.println("Kalan Deneme Hakkı" + girisDeneme);
                           girisDeneme--;
                       }
                   }
                }
                else
                    {
                    System.out.println("Kullanıcı Adı Hatalı, Tekrar Deneyiniz...");
                    girisDeneme--;
                    System.out.println("Deneme Hakkı:"+girisDeneme);
                    }
            }
            else
                break;
        }
    }

}
