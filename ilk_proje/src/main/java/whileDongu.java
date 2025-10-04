import java.util.Scanner;

public class whileDongu
{
    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("sayı gir: ");

        int x=scanner.nextInt();
        int faktoriyel = 1;
        while( x >= 1 )
        {
            faktoriyel = x * faktoriyel;
            x--;

        }
        System.out.println("sonuc= " + faktoriyel);
    }
}
