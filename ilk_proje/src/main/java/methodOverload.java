public class methodOverload {
    public static void toplama(int a, int b){
        System.out.println(a+b);
    }
    public static void toplama(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        toplama(5,5);
        toplama(5,5,5);
    }
}
