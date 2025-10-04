import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("faktoriyeli alınacak sayıyı gir:");

        int sayi = scanner.nextInt();
        int faktoriyel= 1;

        for(int i=sayi; i >=1; i--)
        {
            faktoriyel= faktoriyel * i;
        }
        System.out.println("sonuc= " + faktoriyel);
    }
}
