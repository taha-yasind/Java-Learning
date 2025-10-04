import java.util.Scanner;

public class YerDegis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz -");
        int birinci = scanner.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz -");
        int ikinci = scanner.nextInt();

        System.out.println("Birinci Sayı: " + birinci);

        System.out.println("İkinci Sayı: " + ikinci);

        System.out.println("Yer Değiştiriliyor...");
        int dummy;
        dummy = birinci;
        birinci = ikinci;
        ikinci = dummy;

        System.out.println("Birinci Sayı: " + birinci);
        System.out.println("İkinci Sayı: " + ikinci);

    }
}
