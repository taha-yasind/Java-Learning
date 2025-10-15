public class Beyblade {
    private String sahip;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String sahip, int donusHizi, int saldiriGucu) {
        this.sahip = sahip;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getSahip() {
        return sahip;
    }

    public void setSahip(String sahip) {
        this.sahip = sahip;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println( getSahip()+ " "+ saldiriGucu + " ve " + donusHizi+ " ile saldırıyor. ");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Maalseef bu beyblade'in kutsal canavarı bulunmuyor....");
    }
    public void bilgileriGoster(){
        System.out.println("Beyblade'in Sahibi: "+sahip);
        System.out.println("Beyblade'in Saldırı Gücü: "+ saldiriGucu);
        System.out.println("Beyblade'in Donüş Hızı: "+donusHizi);
    }
}
