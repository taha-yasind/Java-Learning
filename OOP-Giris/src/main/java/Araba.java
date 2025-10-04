// Erişim belirleyiciler public private ve protector olarak 3 e ayırlılr.

public class Araba {
    private String renk;
    private int kapi;
    private int tekerlek;
    private String motor;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        if(kapi <0)
        {
            System.out.println("Kapı sayısı 0'dan küçük olamaz!");
        }
        else
        this.kapi = kapi;
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
