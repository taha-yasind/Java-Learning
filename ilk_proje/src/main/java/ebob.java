import java.util.Scanner;

public class ebob {

    public static int ebob(int a, int b)
    {
     int sonuc= 1;

     for(int i= 1; i <= a && i <= b; i++)
     {
        if((a % i==0) && (b % i==0 ))
        {
            sonuc = i;
        }
     }

        return sonuc;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ikinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.println("iki sayının ebobu "+ebob(a,b));


    }
}
