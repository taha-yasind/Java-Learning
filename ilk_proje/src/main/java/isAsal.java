import java.util.Scanner;

public class isAsal {
    public static boolean asalMi(int sayi)
    {
        for(int i=2; i< sayi; i++)
        {
                if(sayi % i== 0)
                {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args)
    {
        for(int i=1; i<=1000; i++)
        {
            if(asalMi(i)== true){
                System.out.println(i+" sayısı asaldır.");
            }
        }

    }
}
