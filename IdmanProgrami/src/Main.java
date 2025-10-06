import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*** İdman Programına Hoşgeldiniz ***");
        System.out.println("************************************");

        String idmanlar = "Geçerli Hareketler...\n" +
                "1-Burpee\n" +
                "2-Pushup\n" +
                "3-Situp\n" +
                "4-Squat\n";

        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun.");

        System.out.println("Burpee sayisi: ");
        int burpee = input.nextInt();
        System.out.println("Pushup sayisi: ");
        int pushup = input.nextInt();
        System.out.println("Situp sayisi: ");
        int situp = input.nextInt();
        System.out.println("Squat sayisi: ");
        int squat = input.nextInt();
        input.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdman başlıyor...");

        while (idman.idmanBittimi() == false) {
            System.out.println("Hareket Türü(Burpee, Pushup, Situp, Squat): ");

            String hareketTuru = input.nextLine();
            System.out.println("Tekrar Sayisi: ");
            int tekrar = input.nextInt();
            input.nextLine();

            idman.hareketYap(hareketTuru, tekrar );

        }
        System.out.println("İdmanı başarıyla bitirdin. Tebrikler....");


    }
}