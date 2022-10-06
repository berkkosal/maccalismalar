package usta_sifu_egzersizler.enbuyuk_ikincisayi;

public class Deneme2 {

    public static void main(String[] args) {

        int[] sayiDizisi = {1,2,3,4,5};
        enBuyukIkinciSayiyiBul(sayiDizisi);

    }

    public static void enBuyukIkinciSayiyiBul(int[] dizi) {
        int enBuyukSayi = dizi[0];
        int enBuyukIkinciSayi = dizi[1];

        for (int i = 0; i < dizi.length; i++) {
            if (enBuyukSayi < dizi[i]) {
                enBuyukIkinciSayi = enBuyukSayi;
                enBuyukSayi = dizi[i];
            } else if(enBuyukSayi > dizi[i]){
                if(enBuyukIkinciSayi < dizi[i]){
                    enBuyukIkinciSayi = dizi[i];
                }
            }


        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En büyük ikinci sayı: " + enBuyukIkinciSayi);


    }


}



