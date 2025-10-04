import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("yas gir: ");

        int yas =  scanner.nextInt();
        scanner.nextLine(); // int input aldıktan sonra bir sonraki inputu \r olarak algıladığı için
                            // dummy input alınır.
        System.out.println("isim gir: ");
        String isim = scanner.nextLine();

        System.out.println("isminiz " + isim + " ve " + "Yaşınız "+ yas);

    }
}
