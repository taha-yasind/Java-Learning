import java.util.Scanner;

public class MiniProjeKitle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kitle İndeksiniz için Boy ve kilonuzu giriniz:");
        System.out.println("boy: ");
        double boy = scanner.nextDouble();

        System.out.println("Kilo: ");
        int kilo = scanner.nextInt();

        double indeks = (kilo / (boy * boy));

        if(indeks < 18.5)
        {
            System.out.println("Zayıf");
        }
        else if(indeks >= 18.5 && indeks < 25)
        {
            System.out.println("Normal");
        }
        else if(indeks >= 25 && indeks < 30)
        {
            System.out.println("Fazla Kilolu");
        }
        else
        {
            System.out.println("Obez");
        }
    }
}
