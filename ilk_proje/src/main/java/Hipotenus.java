import java.util.Scanner;
// hipotenus bulma
public class Hipotenus {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kısa Kenarı giriniz:");
        double kisa = scanner.nextDouble();

        System.out.println("Uzun Kenarı giriniz;");
        double uzun = scanner.nextDouble();

        double hipo = Math.sqrt(kisa * kisa + uzun * uzun);

        System.out.println("sonuc:" + hipo);

    }
}
