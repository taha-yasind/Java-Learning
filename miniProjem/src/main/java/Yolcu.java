public class Yolcu {
   private String isim;
   private Boolean biletiVarmi;

    public Yolcu(String isim, Boolean biletiVarmi) {
        this.isim = isim;
        this.biletiVarmi = biletiVarmi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Boolean getBiletiVarmi() {
        return biletiVarmi;
    }

    public void setBiletiVarmi(Boolean biletiVarmi) {
        this.biletiVarmi = biletiVarmi;
    }

    public void biletAl(){
        if(!biletiVarmi){
        biletiVarmi=true;
        System.out.println("Bileti rezerve edilmiştir");
        }
        else{
            System.out.println("Halihazırda biletiniz mevcut.");
        }
    }
    public void biletIptal(){
        if(biletiVarmi)
        {
        biletiVarmi=false;
        System.out.println("Biletiniz iptal edilmiştir.");
        }
        else{
            System.out.println("İptal edilecek bilet mevcut değil.");
        }
    }
}
