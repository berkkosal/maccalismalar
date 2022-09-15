package abstract_interface;

public class SoyutSinifKavrami {
    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(2);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare) kare).adiniSoyle();

        Dikdortgen dikdortgen = new Dikdortgen(5, 8);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        dikdortgen.adiniSoyle();

        GeometrikSekil daire = new Daire(5);
        daire.cevreHesapla();
        daire.alanHesapla();

        alanlarikarsilastir(kare,dikdortgen);


    }

    public static void alanlarikarsilastir(GeometrikSekil gs1, GeometrikSekil gs2) {
        if (gs1.getHesaplananAlan() < gs2.getHesaplananAlan()) {
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından küçüktür . ");
        } else if (gs1.getHesaplananAlan() > gs2.getHesaplananAlan()) {
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından büyüktür . ");
        } else {
            System.out.println("Alanlar birbirine eşittir ");
        }

    }
}
