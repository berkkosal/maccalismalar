package exceptions;

public class ThrowsKullanimi {

    public static void main(String[] args) {
        try {
            metot3();
        } catch (NumberFormatException e){
            System.out.println("hata yakalandı.");
        }
    }

    private static void metot() throws NumberFormatException {

        Integer sayi = Integer.parseInt("abc");
    }

    private static void metot2() throws NumberFormatException {

        metot();
    }

    private static void metot3() throws NumberFormatException {

        metot2();
    }


}

class A{

    void aMetodu() {
        //146.      Kontrollü ve kontrolsüz hata çeşitlerine göre throws kavramına yazmamız gereken hata değişiyor.
        //          Kontrollü hatalarda yukarı kadar yazılıyor.
        //          Kontrolsüz (runtime) hatalarında böyle bir zorunluluk yok.
    }
}
