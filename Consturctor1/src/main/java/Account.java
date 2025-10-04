public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;

    public Account() {
/*
    this.hesapNo = "Bilgi yok.";
    this.bakiye = 0.0;
    this.isim = "Bilgi yok.";
    this.email = "Bilgi yok.";
    this.telNo = "Bilgi yok.";
*/
    this("Bilgi Yok", 0.0 , "Bilgi Yok" ,
            "Bilgi Yok " , "Bilgi Yok");

    }
    public Account(String isim, String email, String telNo)
    {
        this.isim = isim;
        this.email = email;
        this.telNo = telNo;

        this.hesapNo = "Bilgi Yok";
        this.bakiye = 0.0;
    }
    public Account(String hesapNo, double bakiye, String isim, String email, String telNo)
    {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telNo = telNo;
    }


    public void paraYatir(double miktar)
    {
        System.out.println("yatırılıyor...");
        bakiye +=miktar;
        System.out.println("Yeni Bakiye = " + bakiye);
    }

    public void paraCek(double miktar)
    {
        if(miktar > bakiye)
        {
            System.out.println("Yetersiz Bakiye! " + bakiye);
        }
        if(miktar > 1500)
        {
            System.out.println("1500 Tlden fazla çekemezsiniz!");
        }
        else
        bakiye -=miktar;
        System.out.println("Yeni Bakiye = " + bakiye);
    }



    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

}
