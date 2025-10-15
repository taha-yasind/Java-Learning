public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getSahip()+ " "+ kutsalCanavar +" 'ı kutsal canavarı ortaya çıkarıyor!");
        System.out.println(getSahip()+ "ın Savunması: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: " + this.kutsalCanavar);
    }
}
