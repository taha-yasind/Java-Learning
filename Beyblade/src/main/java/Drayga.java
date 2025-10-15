public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip()+ " "+ kutsalCanavar +" 'ı kutsal canavarı ortaya çıkarıyor!");
        System.out.println(getSahip()+ "ın Saldırısı: Kaplan Pençesi!");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: " + this.kutsalCanavar);
    }
}
