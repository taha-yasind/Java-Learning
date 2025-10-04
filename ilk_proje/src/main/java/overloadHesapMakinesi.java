import java.util.Scanner;

public class overloadHesapMakinesi {
    public static int toplama(int a, int b, int c)
    {
        return a+b+c;
    }
    public static int toplama(int a, int b)
    {
        return a+b;
    }
    public static int cıkarma(int a, int b)
    {
        return (a-b);
    }
    public static double bolme(int a, int b)
    {
       return ((double) a / b);
    }
    public static int carpma(int a, int b)
    {
        return(a*b);
    }
    public static int carpma(int a, int b, int c)
    {
        return (a*b*c);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1- Toplama \n" +
                "2- Çıkarma \n" +
                "3- Bölme \n" +
                "4- Çarpma \n" +
                "5- Çıkış ";

        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*********************");


        while(true)
        {
            System.out.println("Yapmak isteidğiniz işlemi seçiniz: ");
            int islem = scanner.nextInt();

            if (islem == 5)
            {
                break;
            }
            else if (islem == 1)
            {
                while(true) {
                    System.out.println("Kaç parametreli olmalı 2 ya da 3 ?");
                    int parametre = scanner.nextInt();
                    if (parametre == 2) {
                        System.out.println("1. sayıyı girniz: ");
                        int sayi1 = scanner.nextInt();
                        System.out.println("2. sayıyı girniz: ");
                        int sayi2 = scanner.nextInt();

                        System.out.println(toplama(sayi1, sayi2));
                        break;
                    } else if (parametre == 3) {
                        System.out.println("1. sayıyı girniz: ");
                        int sayi1 = scanner.nextInt();
                        System.out.println("2. sayıyı girniz: ");
                        int sayi2 = scanner.nextInt();
                        System.out.println("3. sayıyı girniz: ");
                        int sayi3 = scanner.nextInt();

                        System.out.println(toplama(sayi1, sayi2, sayi3));
                        break;
                    } else {
                        System.out.println("yanlış parametre sayısı. 2 ya da 3 olabilir....");
                    }
                }
            }
            else if(islem == 2)
            {
                System.out.println("1. sayıyı girniz: ");
                int sayi1 = scanner.nextInt();
                System.out.println("2. sayıyı girniz: ");
                int sayi2 = scanner.nextInt();
                System.out.println(cıkarma(sayi1, sayi2));
            }
            else if(islem == 3)
            {
                System.out.println("1. sayıyı girniz: ");
                int sayi1 = scanner.nextInt();
                System.out.println("2. sayıyı girniz: ");
                int sayi2 = scanner.nextInt();
                System.out.println(bolme(sayi1, sayi2));
            }
            else if (islem == 4)
            {
                while (true) {
                    System.out.println("Kaç parametreli olmalı 2 ya da 3 ?");
                    int parametre = scanner.nextInt();
                    if (parametre == 2) {
                        System.out.println("1. sayıyı girniz: ");
                        int sayi1 = scanner.nextInt();
                        System.out.println("2. sayıyı girniz: ");
                        int sayi2 = scanner.nextInt();

                        System.out.println(carpma(sayi1, sayi2));
                        break;
                    } else if (parametre == 3) {
                        System.out.println("1. sayıyı girniz: ");
                        int sayi1 = scanner.nextInt();
                        System.out.println("2. sayıyı girniz: ");
                        int sayi2 = scanner.nextInt();
                        System.out.println("3. sayıyı girniz: ");
                        int sayi3 = scanner.nextInt();

                        System.out.println(carpma(sayi1, sayi2, sayi3));
                        break;
                    } else {
                        System.out.println("yanlış parametre sayısı. 2 ya da 3 olabilir....");
                    }
                }
            }
            else
                System.out.println("Yanlış işlem kodu Tekrar Deneyiniz...");

        }
    }
}
