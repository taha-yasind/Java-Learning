import java.util.Scanner;

public class whileATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        double bakiye = 1000;

        while(true) {

            String islemler =("İşlemler" +
                    "\n1-Bakiye Öğren." +
                    "\n2-Para Çekme." +
                    "\n3-Para Yatırma." +
                    "\n4-Çıkış.");
            System.out.println("*************************");
            System.out.println(islemler);
            System.out.println("*************************");

            int islem = scanner.nextInt();

            if(islem == 4)
            {
                System.out.println("Program Kapatılıyor...");
                break;
            }

            else if(islem ==1)
            {
                System.out.println("Banka bakiyeniz: " + bakiye + "TL");
            }

            else if(islem == 2)
            {

                while(true)
                {
                    System.out.print("Mevcut Bakiyeniz " + bakiye + " TL." + "\nÇekmek istediğiniz Tutarı Giriniz:");
                    double cekilenTutar = scanner.nextDouble();
                    if (cekilenTutar > bakiye)
                    {
                        System.out.println("Mevcut Bakiyeden fazla tutar çekilemez! Tekrar deneyiniz.");
                    }
                    else {
                        bakiye = bakiye - cekilenTutar;
                        System.out.println("İşlem Tamamlandı... \nMevcut bakiye: " + bakiye + " TL");
                        break;
                    }

                }
            }
            else if(islem ==3)
            {
                System.out.println("Mevcut Bakiye"+ bakiye + " TL."+ "\n Yatırmak İstediğiniz Tutarı Giriniz: ");
                double yatirilanTutar = scanner.nextDouble();
                bakiye= bakiye + yatirilanTutar;
                System.out.println("Mevcut Bakiye:"+ bakiye+ " TL.");
            }
            else
                System.out.println("Geçersiz İşlem. Tekrar Deneyiniz...");
        }
    }
}
