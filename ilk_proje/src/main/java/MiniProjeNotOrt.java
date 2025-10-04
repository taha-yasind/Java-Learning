import java.util.Scanner;

public class MiniProjeNotOrt {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 1.Vize notunu giriniz: ");
        int vize1 = scanner.nextInt();

        System.out.print("Lütfen 2. Vize notunu giriniz: ");
        int vize2 = scanner.nextInt();

        System.out.print("Lütfen Final notunu giriniz: ");
        int Final = scanner.nextInt();

        double ort = ((vize1 * 30) / 100) + ((vize2 * 30) / 100) + ((Final * 40) / 100);
        System.out.println(ort);

        if(ort >= 90 )
        {
            System.out.println("Not Harfi: AA Tebrikler.");
        }
        else if(ort >= 85 && ort < 90 )
        {
            System.out.println("Not Harfi: BA Tebrikler.");
        }
        else if(ort >= 80 && ort < 85 )
        {
            System.out.println("Not Harfi: BB Tebrikler.");
        }
        else if(ort >= 75 && ort < 80 )
        {
            System.out.println("Not Harfi: CB Tebrikler.");
        }
        else if(ort >= 70 && ort < 75 )
        {
            System.out.println("Not Harfi: CC Tebrikler.");
        }
        else if(ort >= 65 && ort < 70 )
        {
            System.out.println("Not Harfi: DC Tebrikler.");
        }
        else if(ort >= 60 && ort < 65 )
        {
            System.out.println("Not Harfi: DD Tebrikler.");
        }
        else if(ort >= 55 && ort < 60 )
        {
            System.out.println("Not Harfi: FD Tebrikler.");
        }
        else
        {
            System.out.println("Not Harfi: FF Kaldınız.");
        }
    }
}
