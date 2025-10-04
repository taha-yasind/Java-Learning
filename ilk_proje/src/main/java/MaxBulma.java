import java.util.Scanner;

public class MaxBulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Karşılaştırmak istediğiniz 3 sayıyı giriniz:");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();

        int maks = -1;

        if (sayi1 >= sayi2 && sayi1 >= sayi3)
        {
            maks = sayi1;
        }
        else if (sayi2 >= sayi1 && sayi2 >= sayi3)
        {
            maks = sayi2;
        }
        else
        {
            maks = sayi3;
        }
        System.out.println(maks);
    }
}
