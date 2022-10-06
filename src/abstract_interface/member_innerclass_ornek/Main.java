package abstract_interface.member_innerclass_ornek;

public class Main {

    public static void main(String[] args) {

        HesapMakinesi hm = new HesapMakinesi();

        HesapMakinesi.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5, 6);
        System.out.println("Toplam: " + toplam);

        HesapMakinesi.Cikar cikarici = hm.new Cikar();
        int fark = cikarici.cikar(9, 4);
        System.out.println("Fark: " + fark);

        hm.carp(3,5);


    }
}
