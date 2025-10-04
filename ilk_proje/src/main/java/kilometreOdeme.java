import java.util.Scanner;

public class kilometreOdeme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // aracın kaç km gittiğni öğren ne kdr yaktığını öğren ödenecek tutarı söyle.

        System.out.print("Aracınız KM başına kaç TL harcıyor? -");
        Double birim = scanner.nextDouble();
        System.out.print("Kaç KM yol gittiniz? -");
        int KM = scanner.nextInt();

        Double tutar = KM * birim;

        System.out.println("Ödenecek Tutar : "+ tutar +" TL"  );
    }
}
