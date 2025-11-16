public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alanHesapla(){
        System.out.println(getIsim()+ "Alanı : "+ (kenar*kenar));
    }

    public void CevreHesapla(){
        System.out.println(getIsim()+ "Cevre : "+ (4*kenar));
    }
}
