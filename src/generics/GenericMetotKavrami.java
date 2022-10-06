package generics;

//Metotlardaki kullanımı.

public class GenericMetotKavrami {


    public static void main(String[] args) {

        String[] isimler = {"emre", "ayşe", "ali"};
        Integer[] sayilar = {1, 5, 7, 9, 10};
        Character[] karakterler = {'a', 'b', 'k'};
/*
        stringDiziYazdir(isimler);
        integerDiziYazdir(sayilar);
        charDiziYazdir(karakterler);
        diziYazdir(isimler);
        diziYazdir(sayilar);
        diziYazdir(karakterler);

 */

        genericYazdir(isimler);
        genericYazdir(sayilar);
        genericYazdir(karakterler);


    }


    public static <Genel> void genericYazdir(Genel[] dizi){
        //<Genel extends Number>
        for (Genel gecici: dizi){
            System.out.println(gecici);
        }

    }

    public static void diziYazdir(Object[] dizi) {
        //Böyle bir yazımda sadece genel ifadeler kullanılabilir.
        //Kodların patlama ihtimali çok yüksek o yüzden genericlere ihtiyaç duyuluyor.
        //Genericler kodu güvenli hale getirmiş oluyor

        for (Object gecici : dizi) {
            System.out.println(gecici);
        }
    }

    public static void stringDiziYazdir(String[] dizi) {
        for (String gecici : dizi) {
            System.out.println(gecici);
        }
    }

    public static void integerDiziYazdir(Integer[] dizi) {
        for (Integer gecici : dizi) {
            System.out.println(gecici);
        }
    }

    public static void charDiziYazdir(Character[] dizi) {
        for (Character gecici : dizi) {
            System.out.println(gecici);
        }
    }
}
