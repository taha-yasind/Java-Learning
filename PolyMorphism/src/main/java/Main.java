class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
       return "Hayvan konuşuyor...";
    }
}


class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Miyavlıyor";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Havlıyor";
    }
}


public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Kopek1");
        Hayvan hayvan2 = new Kedi("Tekir"); // polymorphism örneği
    }
}
