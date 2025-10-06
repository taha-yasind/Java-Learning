public class Yazilimci extends Calisan {
    private String diller;

    public Yazilimci(String isim, String soyad, String id, String diller) {
        super(isim, soyad, id);
        this.diller = diller;
    }
    public void format(String isletim_sistemi){
        System.out.println(getIsim()+ " "+ isletim_sistemi +"ni yüklüyor..." );
    }
    @Override
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("yazılımcının Bildiği Diller : "+ diller);

    }
}

