import java.util.Scanner;

public class indeksHesapla
{
    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in); // scanner objesi çağrıyorum

        System.out.print("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu Girin; ");
        double boy = scanner.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.println("Kitle İndeksiniz : " + indeks);







    }
}
