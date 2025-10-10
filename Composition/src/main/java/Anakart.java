public class Anakart {
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String isletim_sistemi;

    public Anakart(String model, String uretici, int yuvaSayisi, String isletim_sistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletim_sistemi = isletim_sistemi;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }

    public void isletim_sistemi_yukle(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("Isletim_sistemi yüklendi: " + isletim_sistemi);
    }

}
