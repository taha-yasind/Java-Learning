public class Dranza  extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip()+ " "+ kutsalCanavar +" 'ı kutsal canavarı ortaya çıkarıyor!");
        System.out.println(getSahip()+ "ın Saldırısı: Alev Kılıcı!");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: " + this.kutsalCanavar);
    }
}
