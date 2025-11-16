import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void yazdir(LinkedList<String> gidilecek_yerler){
      /*  for (String s: LinkedList){
            System.out.println(s);
        } */
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /*
    public static void tersYazdir(LinkedList<String> gidilecek_yerler){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasPrevious()){
            iterator.
            System.out.println(iterator.previous());
        };
    }
*/
    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
/*
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        yazdir(gidilecek_yerler);

        System.out.println("---------------------------------------");
        gidilecek_yerler.add(4, "Alışveriş Merkezi");

        yazdir(gidilecek_yerler);
        System.out.println("*********************************");

        gidilecek_yerler.remove(3);
        yazdir(gidilecek_yerler);
*/


    }
}
