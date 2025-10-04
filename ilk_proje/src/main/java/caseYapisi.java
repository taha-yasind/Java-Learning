import java.util.Scanner;

public class caseYapisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean dongu= true;
        while (dongu) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:" +
                    "\n1-Toplama" +
                    "\n2-çıkarma" +
                    "\n3-Cikis Yap");
            int islem = scanner.nextInt();
            int sayi1, sayi2, sonuc;
            switch (islem) {
                case 1:
                    System.out.println("islem yapmak istediğniz sayıları seçiniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    sonuc = sayi1 + sayi2;
                    System.out.println("sonuc= " + sonuc);
                    break;
                case 2:
                    System.out.println("islem yapmak istediğniz sayıları seçiniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    sonuc = sayi1 - sayi2;
                    System.out.println("sonuc= " + sonuc);
                    break;
                case 3:
                    dongu= false;
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
            }
        }
    }
}
