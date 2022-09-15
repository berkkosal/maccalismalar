package abstract_interface;

public class SoyutSinifKavrami {
    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(2);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare) kare).adiniSoyle();

        Dikdortgen dikdortgen = new Dikdortgen(5,8);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        dikdortgen.adiniSoyle();

        GeometrikSekil daire = new Daire(5);
        daire.cevreHesapla();
        daire.alanHesapla();


    }
}
