package exceptions;

public class BirdenFazlaCatch {

    public static void main(String[] args) {

        String[] dizi = {"abc", "234", null, "bdc"};

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException hata) {
                System.out.println(hata);
            } catch (NullPointerException hata) {
                System.out.println(hata);
            } catch (ArrayIndexOutOfBoundsException hata) {
                System.out.println(hata);
            }
        }

        System.out.println("Burada.");

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (Exception hata) {
                System.out.println(hata);
            }
        }

        System.out.println("Burada 2.");

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException hata) {
                System.out.println(hata);
            }

        }


        System.out.println("Burada 3.");

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (Exception hata) {
                System.out.println(hata);
            } catch (Throwable hata) {
                System.out.println(hata);
            } // catch deyip alt sınıfı yazamıyoruz buraya doğal olarak, zaten üst sınıflar
            // bu hataları kapsıyor.

        }


        System.out.println("Burada 4.");

        for (int i = 0; i < dizi.length + 2; i++) {

            try {
                int sayi = dizi[i].length();

                try {
                    sayi = Integer.parseInt(dizi[i]);
                } catch (NumberFormatException hata) {
                    System.out.println("hata çıktı: " + hata);
                }
            } catch (NullPointerException hata) {
                System.out.println("Dışarıdaki tryda hata: " + hata);

            } catch (ArrayIndexOutOfBoundsException hata){
                System.out.println("Dışarıdaki tryda hata: " + hata);
            }

        }


    }


}
