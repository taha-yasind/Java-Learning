import java.sql.SQLOutput;

public class Hesap {
  private String kullanici_adi;
  private String parola;
  private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int miktar){
        System.out.println("Yatırılıyor...");
        bakiye +=  miktar;
        System.out.println("Yani Bakiye = " +  bakiye);
    }
    public  void paraCek(int miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz Bakiye" +  bakiye);
        }
        else{
            System.out.println("Çekiliyor...");
            bakiye-=miktar;
            System.out.println("Yani Bakiye = " +  bakiye);
        }
    }
}