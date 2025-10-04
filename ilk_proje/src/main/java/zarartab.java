import java.util.Scanner;

public class zarartab {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ürün başına maaliyeti gir: ");
        double urunMaliyeti = scanner.nextDouble();
        System.out.println("Kaç adet alındığını yazınız.");
        int adet = scanner.nextInt();

        double harcanılanTutar = adet * urunMaliyeti;

        System.out.println("harcanılan tutar: "+ harcanılanTutar +"TL.");

    }
}
