package usta_sifu_egzersizler.enbuyuk_ikincisayi;

public class Deneme2 {

    public static void main(String[] args) {

        int[] sayiDizisi = {31,44,231,654,324,64,967,23};
        enBuyukIkinciSayiyiBul(sayiDizisi);

    }

    public static void enBuyukIkinciSayiyiBul(int[] dizi) {
        int enBuyukSayi = dizi[0];
        int enBuyukIkinciSayi = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (enBuyukSayi < dizi[i]) {
                enBuyukIkinciSayi = enBuyukSayi;
                enBuyukSayi = dizi[i];
            }


        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En büyük ikinci sayı: " + enBuyukIkinciSayi);


    }


}



