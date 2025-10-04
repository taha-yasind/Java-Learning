public class returnMethod {
    public static void toplama(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static double toplamaR(int a, int b, int c)
    {
        return(a+b+c);
    }
    public static  void main(String[] args)
    {
        toplama(1, 2, 3);
        System.out.println(toplamaR(5,4,1));

    }
}
