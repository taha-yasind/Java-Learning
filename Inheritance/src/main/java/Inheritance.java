public class Inheritance {
    public static void main(String[] args) {
        // IS - A

        Yonetici yonetici1 = new Yonetici("Taha" , 50000, "IT", 10);
        yonetici1.bilgilerigöster();
        Calisan calisan1 = new Calisan("Yasin" , 3500, "IT");

        yonetici1.zam_yap(calisan1, 500);
    }
}
