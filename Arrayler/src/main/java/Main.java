import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int a = 5;

        //int[] a = new int[5];
        //int[] b = {30,40,50,60,70} ;

       // System.out.println(b[0]);
        // System.out.println(b[2]);
      //  System.out.println(b[6]); // indeks dışı

/*
        a[5] = 32;
        a[9] = 50;
*/

        //for (int i = 0; i <5; i++) {
            //a[i] = i*4+2;
          //  System.out.println(a[i]);

        //miniProje Denemesi(kullanıcıdan alınan sayıların ortalamasını bul.)

        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            System.out.print("Lütfen ortalamsı alınacak "+ (i+1) + ". sayıyı giriniz: ");
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        int ortalama = 0;

        for (int i = 0; i < array.length; i++){

            ortalama += array[i];
        }
        ortalama = ortalama / array.length;
        System.out.println("Sayıların Ortalaması: "+ ortalama);

    }
}
