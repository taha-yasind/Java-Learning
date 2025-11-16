public class Main
{
    public static void main(String[] args)
    {
      //  IMuhendis muhendis = new IMuhendis(); İnterfacelerden obje oluşturamazsın.

       /* PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();

        System.out.println(muhendis1.mezuniyet_ortalaması(3.41));
        String[] tecrube = {"vestel", "Havelsan", "Türksat"};

        muhendis1.is_tecrübesi(tecrube);

        */
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] isTecrübe = {"vestel", "Havelsan", "Türksat"};
        String[] Referans = {"Taha Yasin Demirci: +90545 555 222 1111"};

        System.out.println(muhendis2.mezuniyet_ortalaması(2.41));
        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_sorgula();
        muhendis2.is_tecrübesi(isTecrübe);
        muhendis2.referans_getir(Referans);



    }
}
