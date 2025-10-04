public class Main {
    public static void main(String[] args) {
        Yolcu yolcu1 = new Yolcu("Taha Yasin", false);
        Yolcu yolcu2 = new Yolcu("Sıla", true);

        Otobus otobus1 = new Otobus(584,35, 15 );
        Otobus otobus2 = new Otobus(54,35, 0 );

        System.out.println("--- Yolcular bilet alıyor ---");
        yolcu1.biletAl();
        otobus1.rezerve();
        otobus2.rezerve();



    }
}
