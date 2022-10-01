package usta_sifu_egzersizler.enbuyuk_ikincisayi;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] sayiDizisi = {56543643, 5425323, 321543, 76876, 432};
        System.out.println(enBuyukIkinciSayiyiGoster(sayiDizisi));


    }

    public static int enBuyukIkinciSayiyiGoster(int[] dizi) {
        int oAnkiEnKucukSayi = 0;
        int oAnkiEnKucukSayininIndexi = 0;


        for (int i = 0; i < dizi.length; i++) {
            oAnkiEnKucukSayi = dizi[i];
            oAnkiEnKucukSayininIndexi = i;

            for (int j = i + 1; j < dizi.length; j++) {

                if (oAnkiEnKucukSayi > dizi[j]) {
                    oAnkiEnKucukSayi = dizi[j];
                    oAnkiEnKucukSayininIndexi = j;
                }

                if (oAnkiEnKucukSayininIndexi != i) {
                    dizi[oAnkiEnKucukSayininIndexi] = dizi[i];
                    dizi[i] = oAnkiEnKucukSayi;
                }

            }
        }

        return dizi[dizi.length - 2];


    }

    public static void diziyiYazdir(int[] dizi) {
        for (int gecici : dizi) {
            System.out.println(gecici);
        }
    }







/*
    public static int enBuyukIkinciSayi(@NotNull int dizi[]) {
        int oAnkiEnBuyukSayininIndexi= 0;
        int oAnkiEnBuyukSayi = 0;
        for (int i = 0; i < dizi.length -1 ; i++){
             oAnkiEnBuyukSayininIndexi = i;
             oAnkiEnBuyukSayi = dizi[i];

            for (int x = i +1; x < dizi.length ; x++){
                if (oAnkiEnBuyukSayi < dizi[x]){
                    oAnkiEnBuyukSayi = dizi[x];
                    oAnkiEnBuyukSayininIndexi = x;
                }

                if (oAnkiEnBuyukSayininIndexi != i ){
                    dizi[oAnkiEnBuyukSayininIndexi] = dizi [i];
                    dizi[i] = oAnkiEnBuyukSayi;
                }

            }

        }


        return oAnkiEnBuyukSayi;
    }
    */
}
